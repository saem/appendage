package com.github.saem.appendage.resources;

import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import com.github.saem.appendage.jooq.generated.Tables;
import com.github.saem.appendage.representations.UserWriteRepresentation;
import com.github.saem.appendage.users.UserLookupService;
import io.dropwizard.jersey.params.LongParam;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.sql.DataSource;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jooq.Field;
import static org.jooq.impl.DSL.using;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
final public class UserResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);
    
    public final long SYSTEM_USER_ID = 1L;

    public final DataSource dataSource;
    private final UserLookupService userLookup;

    public UserResource(
            DataSource ds,
            UserLookupService userLookup
    ) {
        dataSource = ds;
        this.userLookup = userLookup;
    }

    @POST
    @Metered(name = "com.github.saem.appendage.resources.UserResource.createUser")
    @Timed(name = "com.github.saem.appendage.resources.UserResource.createUser.time")
    public final Response createUser(@Valid UserWriteRepresentation user) throws URISyntaxException {
        final int version = 1;
        
        // Have to store in a map, because lambdas close over values not variables.
        final Map<String, Long> idState = new HashMap();
        
        try (Connection conn = dataSource.getConnection()) {
            using(conn).transaction(config -> {
                final Long sequence = using(config)
                        .insertInto(Tables.EVENTS,
                                Tables.EVENTS.EVENT,
                                Tables.EVENTS.USER_ID,
                                Tables.EVENTS.VERSION,
                                Tables.EVENTS.WHEN)
                        .values("create user", SYSTEM_USER_ID, version, LocalDateTime.now())
                        .returning(Tables.EVENTS.SEQUENCE)
                        .fetchOne()
                        .into(Long.class);
                
                final Long userId = using(config)
                        .insertInto(Tables.USERS)
                        .values((Field<?>) null)
                        .returning(Tables.USERS.USER_ID)
                        .fetchOne()
                        .into(Long.class);
                
                using(config)
                        .insertInto(Tables.USER_API_KEYS)
                        .values(sequence, userId, 
                                UUID.randomUUID().toString(),
                                UUID.randomUUID().toString() + UUID.randomUUID().toString()) // my terrible way of creating a shared key
                        .execute();
                
                using(config)
                        .insertInto(Tables.USER_STATES)
                        .values(user.username, user.email, user.password)
                        .execute();
                
                idState.put("userId", userId);
                idState.put("sequence", sequence);
            });
        } catch (SQLException ex) {
            LOGGER.error(
                    "Failed to create a user (username: '" +
                            user.username + "', email: '" + user.email + "')"
                    , ex);
            
            return Response.serverError().build();
        }

        return Response.created(new URI("/users/" + idState.get("userId")))
                .build();
    }
    
    @GET
    @Metered(name = "com.github.saem.appendage.resources.UserResource.getUser")
    @Timed(name = "com.github.saem.appendage.resources.UserResource.getUser.time")
    public final Response getUser(@PathParam("userId") LongParam userIdParam) {
        return userLookup.find(userIdParam.get())
                .map(u -> Response.ok(u).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }
}

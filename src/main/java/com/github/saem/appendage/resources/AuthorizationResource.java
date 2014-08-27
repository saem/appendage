package com.github.saem.appendage.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
final public class AuthorizationResource {
    public final DataSource dataSource;
    
    public AuthorizationResource(DataSource ds) {
        dataSource = ds;
    }
    
    @POST
    public final Response createAuthToken() throws SQLException, URISyntaxException {
        return Response.created(new URI("/butts-totally-works")).build();
    }
}

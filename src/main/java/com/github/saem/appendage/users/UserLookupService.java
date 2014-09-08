package com.github.saem.appendage.users;

import com.github.saem.appendage.jooq.generated.Tables;
import com.github.saem.appendage.jooq.generated.tables.CurrentUsers;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.jooq.Record3;
import static org.jooq.impl.DSL.using;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLookupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserLookupService.class);

    private final DataSource dataSource;

    public UserLookupService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

//    public Optional<CurrentApiUsersFact> findCurrentApiUser(String apiKey) {
//        final CurrentApiUsers current = Tables.CURRENT_API_USERS;
//        
//        try (Connection conn = dataSource.getConnection()) {
//            List<Object> authorities = using(conn)
//                    .select(Tables.CURRENT_API_USERS.fields())
//                    .from(current)
//                    .where(current.API_KEY.eq(apiKey))
//                    .fetch(r -> r.);
//        } catch (SQLException e) {
//            LOGGER.error("BUG: ", e);
//            
//            return Optional.empty();
//        }
//    }
    
    public Optional<UserFact> find(Long userId) {
        final CurrentUsers currentUsers = Tables.CURRENT_USERS;
        try (Connection conn = dataSource.getConnection()) {
            final List<Record3<Long, String, String>> userAuthorities
                    = using(conn)
                    .select(
                            currentUsers.USER_ID,
                            currentUsers.USERNAME,
                            currentUsers.EMAIL
                    )
                    .from(currentUsers)
                    .where(
                            currentUsers.USER_ID.eq(userId)
                    )
                    .fetch()
                    .stream()
                    .collect(Collectors.toList());

            return userAuthorities.stream()
                    .map(
                            ua -> new UserFact(
                                    ua.getValue(currentUsers.USER_ID),
                                    ua.getValue(currentUsers.USERNAME),
                                    ua.getValue(currentUsers.EMAIL)
                            )
                    ).findFirst();

        } catch (SQLException ex) {
            LOGGER.error("BUG: ", ex);
            
            return Optional.empty();
        }
    }

}

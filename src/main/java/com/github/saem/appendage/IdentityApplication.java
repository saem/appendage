package com.github.saem.appendage;

import com.github.saem.appendage.resources.UserResource;
import com.github.saem.appendage.users.UserLookupService;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.ManagedDataSource;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

final public class IdentityApplication extends Application<IdentityConfiguration> {
    public static void main(String[] args) throws Exception {
        new IdentityApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<IdentityConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<IdentityConfiguration>() {

            @Override
            public DataSourceFactory getDataSourceFactory(IdentityConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
    }

    @Override
    public void run(IdentityConfiguration cfg, Environment env) throws Exception {
        final ManagedDataSource ds = cfg.getDataSourceFactory().build(env.metrics(), "db");
        
        final UserLookupService userLookupService = new UserLookupService(ds);
        
        UserResource userResource = new UserResource(ds);
        
        env.jersey().register(userResource);
    }
}

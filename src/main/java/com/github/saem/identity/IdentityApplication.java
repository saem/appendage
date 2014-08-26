package com.github.saem.identity;

import com.github.saem.identity.resources.AuthorizationResource;
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
        ManagedDataSource ds = cfg.getDataSourceFactory().build(env.metrics(), "db");
        
        AuthorizationResource authorizationResource = new AuthorizationResource(ds);
        
        env.jersey().register(authorizationResource);
    }
}

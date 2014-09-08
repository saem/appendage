package com.github.saem.appendage;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

final class IdentityConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String authenticationCachePolicy = "maximumSize=10000, expireAfterAccess=10m";

    @Valid
    @NotNull
    private DataSourceFactory dataSource;

    public String getAuthenticationCachePolicy() {
      return authenticationCachePolicy;
    }
    
    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return dataSource;
    }

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        this.dataSource = dataSourceFactory;
    }
}

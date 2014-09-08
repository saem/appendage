package com.github.saem.appendage.representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserWriteRepresentation {
    public final String username;
    public final String email;
    public final String password;
    
    @JsonCreator
    public UserWriteRepresentation(
            @JsonProperty("username") String username,
            @JsonProperty("email") String email,
            @JsonProperty("password") String password
    ) {
        this.username = username;
        this.email = email;
        this.password = password;
                
    }
}

package com.github.saem.appendage.representations;

import com.fasterxml.jackson.annotation.JsonCreator;

final public class CredentialsRepresentation {
    public final String email;
    public final String password;
    
    @JsonCreator
    public CredentialsRepresentation(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

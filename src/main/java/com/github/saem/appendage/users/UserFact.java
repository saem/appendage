package com.github.saem.appendage.users;

public final class UserFact {
    public final Long id;
    public final String username;
//    public final String firstName;
//    public final String lastName;
    public final String email;
    
    public UserFact(
            Long id,
            String username, 
//            String firstName, 
//            String lastName, 
            String email
    ) {
        this.id = id;
        this.username = username;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.email = email;
    }
}

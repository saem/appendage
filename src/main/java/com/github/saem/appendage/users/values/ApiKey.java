package com.github.saem.appendage.users.values;

import java.util.Optional;

final public class ApiKey {
    private final String key;
    
    private ApiKey(String key) {
        this.key = key;
    }
    
    @Override
    public String toString() { return key; }
    
    @Override
    public int hashCode() { return key.hashCode(); }
    
    @Override
    public boolean equals(Object other) {
        return other != null &&
                other instanceof ApiKey && 
                ((ApiKey) other).key.equals(key);
    }
    
    public static Optional<ApiKey> fromString(String key) {
        if (key != null && key.length() > 0) {
            return Optional.of(new ApiKey(key));
        } else {
            return Optional.empty();
        }
    }
}

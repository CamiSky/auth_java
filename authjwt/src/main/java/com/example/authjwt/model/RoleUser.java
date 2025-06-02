package com.example.authjwt.model;

public enum RoleUser {
    ADMIN("admin"),
    USER("user");

    private String role;

    RoleUser(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

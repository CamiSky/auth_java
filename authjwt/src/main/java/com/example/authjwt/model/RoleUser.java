package com.example.authjwt.model;

public enum RoleUser {
    ADMIN('admin'),
    USER('user');

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

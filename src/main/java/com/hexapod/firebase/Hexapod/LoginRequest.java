package com.hexapod.firebase.Hexapod;

public class LoginRequest {
    private String userType; // "User" or "Admin"
    private String email;
    private String password;

    // getters and setters

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

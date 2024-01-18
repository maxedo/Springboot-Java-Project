package com.example.Proiect_Tehnologii_Web_Java.User.Models;

import java.util.UUID;

public class UserResponse {
    String token;

    public UserResponse() {
        token = UUID.randomUUID().toString();
    }

    public String getToken() {
        return token;
    }
}


package com.kodilla.ecommercee.controller;

import lombok.Getter;

@Getter
public class UsernameExistsException extends Exception {
    private String username;

    public UsernameExistsException(String username) {
        super("Username " + username + " already exists.");
    }
}

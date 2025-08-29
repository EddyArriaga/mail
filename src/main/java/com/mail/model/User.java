package com.mail.model;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String name;
    protected String emailAddress;
    protected String password;
    protected List<User> contacts = new ArrayList<User>();
    protected List<EmailFolder> emailFolders = new ArrayList<EmailFolder>();

    public User(String name, String emailAddress, String password) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
    }
}

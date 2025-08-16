package com.mail.model;

import java.util.ArrayList;

public class EmailList {
    private ArrayList<Email> email;
    
    public EmailList() {
        email = new ArrayList<Email>();
    }

    public ArrayList<Email> getEmail() {
        return email;
    }
}

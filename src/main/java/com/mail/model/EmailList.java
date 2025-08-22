package com.mail.model;

import java.util.ArrayList;

public class EmailList {
    private String name;
    private ArrayList<Email> emails;

    public EmailList(String name) {
        this.name = name;
        emails = new ArrayList<Email>();
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public void deleteEmail(Email email) {
        emails.remove(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }
}

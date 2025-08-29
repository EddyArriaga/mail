package com.mail.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmailFolder {
    private String name;
    private List<Email> emails = new ArrayList<>();

    public EmailFolder(String name) {
        this.name = name;
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public void removeEmail(int i) {
        emails.remove(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Email> getEmails() {
        return Collections.unmodifiableList(emails);
    }
}

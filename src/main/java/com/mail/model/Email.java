package com.mail.model;

import java.time.LocalDateTime;

public class Email {
    private String title;
    private String message;
    private User sender;
    private User receiver;
    private LocalDateTime localDateTime;

    public Email(String title, String message, User sender, User receiver) {
        this.title = title;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        localDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public User getSender() {
        return sender;
    }
    
    public User getReceiver() {
        return receiver;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

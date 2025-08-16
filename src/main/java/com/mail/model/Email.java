package com.mail.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Email {
    private String title;
    private String message;
    private LocalDate shippingDate;
    private LocalTime shippingTime;

    public Email(String title, String message) {
        this.title = title;
        this.message = message;
        shippingDate = LocalDate.now();
        shippingTime = LocalTime.now();
    }
}

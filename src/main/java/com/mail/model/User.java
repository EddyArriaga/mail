package com.mail.model;

import java.util.ArrayList;

public class User {
    private Contact contact;
    private ArrayList<EmailList> emailList;

    public User(Contact contact){
        this.contact = contact;
    }
}

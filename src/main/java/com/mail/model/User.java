package com.mail.model;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Contact> contacts;
    private ArrayList<EmailList> emailLists;

    public User() {

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public void addEmailList(EmailList emailList) {
        emailLists.add(emailList);
    }

    public void deleteEmailList(EmailList emailList) {
        emailLists.remove(emailList);
    }

    // Lógica para enviar correo usando "EmailSender".
    public void sendEmail() {

    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<EmailList> getEmailLists() {
        return emailLists;
    }
    
}

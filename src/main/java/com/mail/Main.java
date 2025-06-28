package com.mail;

import com.mail.controller.LoginController;
import com.mail.view.LoginView;

public class Main {
    public static void main(String[] args) {
        new LoginController(new LoginView());
    }
}
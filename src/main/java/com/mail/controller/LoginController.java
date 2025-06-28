package com.mail.controller;

import com.mail.view.LoginView;

public class LoginController {
    private LoginView loginView = new LoginView();

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.setVisible(true);
    }
}

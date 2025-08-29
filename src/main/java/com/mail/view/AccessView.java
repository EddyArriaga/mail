package com.mail.view;

import javax.swing.JFrame;

public class AccessView extends JFrame {
    private RegisterPanel registerPanel;
    private LoginPanel loginPanel;

    public AccessView() {
        setProperties();
        initComponents();
    }

    private void setProperties() {
        setTitle("Iniciar sesión");
        setResizable(false);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

    }
}

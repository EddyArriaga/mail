package com.mail.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginView extends JFrame {
    public LoginView() {
        setTitle("Mail - Inicio de sesión");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
    }

    private void initializeComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout()); // <--- Main panel.
        mainPanel.setBackground(new Color(255, 255, 255));

        

        add(mainPanel);
    }
}

package com.mail.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

            JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // <--- Title panel.
            titlePanel.setOpaque(false);

                JLabel titleLabel = new JLabel("Iniciar sesión en Mail");
                titleLabel.setForeground(new Color(0, 0, 0));
                titleLabel.setFont(new Font("arial", Font.BOLD, 18));

            titlePanel.add(titleLabel);

        mainPanel.add(titlePanel, BorderLayout.NORTH);

        add(mainPanel);
    }
}

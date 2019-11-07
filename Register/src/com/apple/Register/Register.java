package com.apple.Register;

import javax.swing.*;

public class Register {
    public static void main(String[] args){
        JFrame frame = new JFrame("Register Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {


        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);


        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);


        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);


        JButton RegisterButton = new JButton("Register");
        RegisterButton.setBounds(10, 80, 80, 25);
        panel.add(RegisterButton);
    }
}

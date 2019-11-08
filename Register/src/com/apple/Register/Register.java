package com.apple.Register;
/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/7
 */
import javax.swing.*;

public class Register {
    public static void main(String[] args){
        JFrame frame = new JFrame("Register Example");
        frame.setSize(360, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {


        panel.setLayout(null);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);



        JTextField mailboxText = new JTextField(20);
        mailboxText.setBounds(100,50,165,25);
        panel.add(mailboxText);

        JLabel mailboxLabel = new JLabel("Mailbox:");
        mailboxLabel.setBounds(10,50,80,25);
        panel.add(mailboxLabel);



        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,80,165,25);
        panel.add(passwordText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,80,80,25);
        panel.add(passwordLabel);





        JButton RegisterButton = new JButton("Register");
        RegisterButton.setBounds(10, 120, 100, 25);
        panel.add(RegisterButton);
    }
}

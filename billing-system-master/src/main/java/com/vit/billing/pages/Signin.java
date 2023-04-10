package com.vit.billing.pages;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class Signin {
  JFrame signInFrame;
  JTextField userNameText;
  JPasswordField passwordText;

  public Signin() {

    signInFrame = new JFrame("Signin Page");
    JLabel userNameLabel = new JLabel("Username");
    userNameLabel.setBounds(600, 150, 80, 40);
    JLabel passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(600, 200, 80, 40);
    userNameText = new JTextField();
    userNameText.setBounds(700, 150, 150, 30);
    passwordText = new JPasswordField();
    passwordText.setBounds(700, 200, 150, 30);
    JButton submitBttn = new JButton("Submit");
    submitBttn.setBounds(700, 250, 100, 40);
    JButton cancelBttn = new JButton("Signup");
    cancelBttn.setBounds(700, 300, 100, 40);
    JButton backButton = new JButton("Back");
    backButton.setBounds(700, 350, 100, 40);
    JLabel registerl = new JLabel("Dont have an account signup to register");
    registerl.setBounds(675, 400, 300, 50);
    JLabel invalid = new JLabel("");
    invalid.setBounds(675, 450, 300, 50);
    JLabel title = new JLabel("VIT Billing System");
    title.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    title.setBorder(new EmptyBorder(10, 10, 10, 10));
    title.setBounds(625, 25, 400, 40);
    JLabel titl = new JLabel("Signin page");
    titl.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    titl.setBorder(new EmptyBorder(10, 10, 10, 10));
    titl.setBounds(660, 75, 400, 40);
    signInFrame.add(titl);
    signInFrame.add(title);
    signInFrame.add(invalid);
    signInFrame.add(userNameLabel);
    signInFrame.add(userNameText);
    signInFrame.add(passwordLabel);
    signInFrame.add(passwordText);
    signInFrame.add(registerl);
    signInFrame.add(submitBttn);
    signInFrame.add(cancelBttn);
    signInFrame.add(backButton);
    
    signInFrame.setSize(1650, 1080);
    signInFrame.setLayout(null);
    signInFrame.setVisible(true);

    submitBttn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        String userName = userNameText.getText();
        String password = new String(passwordText.getPassword());

        try {
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "jeeva@2002");
          PreparedStatement statement = connection
              .prepareStatement("SELECT name,password FROM login WHERE name=? AND password=?");
          statement.setString(1, userName);
          statement.setString(2, password);
          ResultSet result = statement.executeQuery();
          if (result.next()) {
            signInFrame.dispose();

            System.out.println("Login Successful");
            new Home();

          } else {
            if (userName.equals("") && password.equals("")) {
              invalid.setText("Please enter the username and password");
            } else {
              invalid.setText("Invalid username or password");
            }

          }
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }

    }

    );

    cancelBttn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        new register();

        signInFrame.setVisible(false);
        signInFrame.dispose();

      }
    });

  }
}

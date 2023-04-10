package com.vit.billing.pages;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class register {
    JFrame registerFrame;
    JTextField nametText;
    JTextField idtText;
    JPasswordField passwordText;

    public register() {
        registerFrame = new JFrame("Register Page");

        JLabel idlLabel = new JLabel("Id");
        idlLabel.setBounds(600, 150, 80, 40);
        JLabel namelLabel = new JLabel("Name");
        namelLabel.setBounds(600, 200, 80, 40);
        JLabel passwordlLabel = new JLabel("Password");
        passwordlLabel.setBounds(600, 250, 80, 40);
        idtText = new JTextField();
        idtText.setBounds(700, 150, 150, 30);
        nametText = new JTextField();
        nametText.setBounds(700, 200, 150, 30);
        passwordText = new JPasswordField();
        passwordText.setBounds(700, 250, 150, 30);
        JButton submitBttn = new JButton("Register");
        submitBttn.setBounds(700, 300, 100, 40);
        JButton cancelBttn = new JButton("Signin");
        cancelBttn.setBounds(700, 350, 100, 40);
        JLabel invalid = new JLabel("");
        invalid.setBounds(675, 400, 300, 50);
        JLabel title = new JLabel("VIT Billing System");
        title.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
        title.setBorder(new EmptyBorder(10, 10, 10, 10));
        title.setBounds(625, 25, 400, 40);
        JLabel titl = new JLabel("Register page");
        titl.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
        titl.setBorder(new EmptyBorder(10, 10, 10, 10));
        titl.setBounds(660, 75, 400, 40);
        registerFrame.add(titl);
        registerFrame.add(title);
        registerFrame.add(invalid);
        registerFrame.add(idlLabel);
        registerFrame.add(namelLabel);
        registerFrame.add(nametText);
        registerFrame.add(idlLabel);
        registerFrame.add(idtText);
        registerFrame.add(passwordlLabel);
        registerFrame.add(passwordText);
        registerFrame.add(submitBttn);
        registerFrame.add(cancelBttn);
        registerFrame.setSize(1650, 1080);
        registerFrame.setLayout(null);
        registerFrame.setVisible(true);

        submitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String id = idtText.getText();
                String userName = nametText.getText();
                String password = new String(passwordText.getPassword());

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root",
                            "jeeva@2002");
                    PreparedStatement statement = connection.prepareStatement("insert into login values(?,?,?)");
                    statement.setString(1, id);
                    statement.setString(2, userName);
                    statement.setString(3, password);
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        invalid.setText("Register is successfull");
                        System.out.println("Data inserted  Successful");

                    } else if (userName.equals("") && password.equals("")) {
                        invalid.setText("Please enter the id, name, and password");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        );

        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Signin();

                registerFrame.setVisible(false);
                registerFrame.dispose();

            }
        });

    }
}

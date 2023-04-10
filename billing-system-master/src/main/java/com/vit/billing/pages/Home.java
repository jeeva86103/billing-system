package com.vit.billing.pages;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class Home {
  JFrame homeFrame;
  JButton invoiceBttn;
  JButton inventoryBttn;
  JButton cancelBttn;

  public Home() {

    homeFrame = new JFrame("Home page");
    invoiceBttn = new JButton("Invoice");
    invoiceBttn.setBounds(675, 150, 100, 40);
    inventoryBttn = new JButton("Inventory");
    inventoryBttn.setBounds(675, 200, 100, 40);
    cancelBttn = new JButton("logout");
    cancelBttn.setBounds(675, 250, 100, 40);
    invoiceBttn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        homeFrame.dispose();
        new Invoice();

      }

    });
    inventoryBttn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        homeFrame.setVisible(false);
        homeFrame.dispose();
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            new Inventory().createAndShowGui();
          }
        });

      }

    });

    cancelBttn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        new Login();

        homeFrame.setVisible(false);
        homeFrame.dispose();
      }
    });

    JLabel loginTitle = new JLabel(" VIT Billing System");
    loginTitle.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    loginTitle.setBorder(new EmptyBorder(10, 10, 10, 10));
    loginTitle.setBounds(600, 25, 400, 40);
    JLabel title = new JLabel("Home Page");
    title.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    title.setBorder(new EmptyBorder(10, 10, 10, 10));
    title.setBounds(650, 85, 400, 40);
    homeFrame.add(loginTitle);
    homeFrame.add(title);
    homeFrame.add(inventoryBttn);
    homeFrame.add(invoiceBttn);
    homeFrame.add(cancelBttn);
    homeFrame.setSize(1650, 1080);

    homeFrame.setLayout(null);
    homeFrame.setVisible(true);
  }
}
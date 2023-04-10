package com.vit.billing.pages;

import javax.swing.*;

public class Calculator {
  JFrame calFrame;
  JTextField t;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDiv, bMul, bSub, bAdd, bDec, bEq, bDel, bClr;

  static double a = 0, b = 0, result = 0;
  static int operator = 0;

  Calculator() {
    calFrame = new JFrame("Calculator");
    t = new JTextField();
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    bDiv = new JButton("/");
    bMul = new JButton("*");
    bSub = new JButton("-");
    bAdd = new JButton("+");
    bDec = new JButton(".");
    bEq = new JButton("=");
    bDel = new JButton("Delete");
    bClr = new JButton("Clear");
    t.setBounds(30, 40, 280, 30);
    b7.setBounds(40, 100, 50, 40);
    b8.setBounds(110, 100, 50, 40);
    b9.setBounds(180, 100, 50, 40);
    bDiv.setBounds(250, 100, 50, 40);
    b4.setBounds(40, 170, 50, 40);
    b5.setBounds(110, 170, 50, 40);
    b6.setBounds(180, 170, 50, 40);
    bMul.setBounds(250, 170, 50, 40);
    b1.setBounds(40, 240, 50, 40);
    b2.setBounds(110, 240, 50, 40);
    b3.setBounds(180, 240, 50, 40);
    bSub.setBounds(250, 240, 50, 40);
    bDec.setBounds(40, 310, 50, 40);
    b0.setBounds(110, 310, 50, 40);
    bEq.setBounds(180, 310, 50, 40);
    bAdd.setBounds(250, 310, 50, 40);
    bDel.setBounds(60, 380, 100, 40);
    bClr.setBounds(180, 380, 100, 40);
    calFrame.add(t);
    calFrame.add(b7);
    calFrame.add(b8);
    calFrame.add(b9);
    calFrame.add(bDiv);
    calFrame.add(b4);
    calFrame.add(b5);
    calFrame.add(b6);
    calFrame.add(bMul);
    calFrame.add(b1);
    calFrame.add(b2);
    calFrame.add(b3);
    calFrame.add(bSub);
    calFrame.add(bDec);
    calFrame.add(b0);
    calFrame.add(bEq);
    calFrame.add(bAdd);
    calFrame.add(bDel);
    calFrame.add(bClr);
    calFrame.setLayout(null);
    calFrame.setVisible(true);
    calFrame.setSize(350, 500);
    calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calFrame.setResizable(false);
    b1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("1"));

      }

    });
    b2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("2"));

      }

    });
    b3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("3"));

      }

    });
    b4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("4"));

      }

    });
    b5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("5"));

      }

    });
    b6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("6"));

      }

    });
    b7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("7"));

      }

    });
    b8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("8"));

      }

    });
    b9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("9"));

      }

    });
    b0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("0"));

      }

    });
    bDec.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("."));

      }

    });
    bAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        a = Double.parseDouble(t.getText());
        operator = 1;
        t.setText("");

      }

    });
    bSub.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        a = Double.parseDouble(t.getText());
        operator = 2;
        t.setText("");

      }

    });
    bMul.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        a = Double.parseDouble(t.getText());
        operator = 3;
        t.setText("");

      }

    });
    bDiv.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        a = Double.parseDouble(t.getText());
        operator = 4;
        t.setText("");

      }

    });
    bEq.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        b = Double.parseDouble(t.getText());
        switch (operator) {
        case 1:
          result = a + b;
          break;
        case 2:
          result = a - b;
          break;
        case 3:
          result = a * b;
          break;
        case 4:
          result = a / b;
          break;
        default:
          result = 0;
        }
        t.setText("" + result);

      }

    });
    bDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        String s = t.getText();
        t.setText("");
        for (int i = 0; i < s.length() - 1; i++)
          t.setText(t.getText() + s.charAt(i));

      }

    });
    bClr.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText("");

      }

    });

  }

}

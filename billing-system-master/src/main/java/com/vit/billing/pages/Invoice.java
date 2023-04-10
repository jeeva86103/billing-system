package com.vit.billing.pages;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Invoice {

    JButton generatebttn, backbttn, printbttn, calcibttn, clearbttn, logoutbttn;
    JCheckBox wheatcb, ricecb, sugarcb, oilcb, cerealscb;

    JLabel titlelb, addresslb, billnolb, datelb, itemlb, qntlb, wheatlb, ricelb, sugarlb, oillb, cerealslb, lspl,
            productlb, dashlb2, quantitylb, titlelb5, titlelb6, titlelb7, titlelb8, titlelb9, ratelb, amountlb, dashlb3,
            totallb, lq1, lq2, lq3, lq4, lq5, r1, r2, r3, r4, r5, a1, a2, a3, a4, a5, t;
    JTextField t1, t2, t3, t4, t5, t6, t7;

    public Invoice() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        JFrame Invoiceframe = new JFrame("INVOICE");
        Invoiceframe.setBounds(0, 0, 800, 600);

        titlelb = new JLabel("VIT BILLING SYSTEM");
        titlelb.setBounds(555, 25, 300, 30);
        titlelb.setFont(new Font("Verdana", Font.PLAIN, 20));
        addresslb = new JLabel("Chennai-600028");
        addresslb.setBounds(580, 50, 200, 30);
        addresslb.setFont(new Font("Verdana", Font.PLAIN, 20));
        billnolb = new JLabel("Bill no:");
        billnolb.setBounds(880, 75, 300, 30);
        t1 = new JTextField();
        t1.setBounds(930, 80, 50, 20);
        t2 = new JTextField();
        t2.setBounds(880, 185, 50, 20);
        t3 = new JTextField();
        t3.setBounds(880, 215, 50, 20);
        t4 = new JTextField();
        t4.setBounds(880, 245, 50, 20);
        t5 = new JTextField();
        t5.setBounds(880, 275, 50, 20);
        t6 = new JTextField();
        t6.setBounds(880, 305, 50, 20);
        datelb = new JLabel("Date and Time:" + dtf.format(now));
        datelb.setBounds(860, 95, 300, 30);
        itemlb = new JLabel("PRODUCT ITEMS:");
        itemlb.setBounds(390, 160, 300, 30);
        qntlb = new JLabel("QUANTITY IN KG/L:");
        qntlb.setBounds(810, 150, 300, 30);
        wheatlb = new JLabel("wheat:");
        wheatlb.setBounds(830, 180, 300, 30);
        ricelb = new JLabel("rice:");
        ricelb.setBounds(830, 210, 300, 30);
        sugarlb = new JLabel("sugar:");
        sugarlb.setBounds(830, 240, 300, 30);
        oillb = new JLabel("oil:");
        oillb.setBounds(830, 270, 300, 30);
        cerealslb = new JLabel("cereals:");
        cerealslb.setBounds(830, 300, 300, 30);
        qntlb.setFont(new Font("Verdana", Font.PLAIN, 16));
        itemlb.setFont(new Font("Verdana", Font.PLAIN, 16));
        wheatcb = new JCheckBox("WHEAT");
        wheatcb.setBounds(410, 190, 150, 20);
        ricecb = new JCheckBox("RICE");
        ricecb.setBounds(410, 210, 150, 20);
        sugarcb = new JCheckBox("SUGAR");
        sugarcb.setBounds(410, 230, 150, 20);
        oilcb = new JCheckBox("OIL");
        oilcb.setBounds(410, 250, 150, 20);
        cerealscb = new JCheckBox("CEREALS");
        cerealscb.setBounds(410, 270, 150, 20);
        t7 = new JTextField();
        t7.setBounds(940, 555, 50, 20);
        Invoiceframe.add(t7);

        lspl = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        lspl.setBounds(400, 380, 800, 30);
        Invoiceframe.add(lspl);
        productlb = new JLabel("PRODUCT NAME");
        productlb.setBounds(415, 400, 300, 30);
        Invoiceframe.add(productlb);
        dashlb2 = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        dashlb2.setBounds(400, 410, 800, 30);
        Invoiceframe.add(dashlb2);
        dashlb3 = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        dashlb3.setBounds(400, 530, 800, 30);
        Invoiceframe.add(dashlb3);
        quantitylb = new JLabel("QUANTITY");
        quantitylb.setBounds(590, 400, 300, 30);
        Invoiceframe.add(quantitylb);
        ratelb = new JLabel("RATE");
        ratelb.setBounds(765, 400, 300, 30);
        Invoiceframe.add(ratelb);
        amountlb = new JLabel("AMOUNT");
        amountlb.setBounds(940, 400, 300, 30);
        Invoiceframe.add(amountlb);
        totallb = new JLabel("TOTAL:");
        totallb.setBounds(890, 550, 300, 30);
        Invoiceframe.add(totallb);
        generatebttn = new JButton("Generate");
        generatebttn.setBounds(390, 320, 120, 30);
        backbttn = new JButton("Back");
        backbttn.setBounds(890, 25, 120, 30);
        printbttn = new JButton("Printbill");
        printbttn.setBounds(910, 600, 120, 30);
        calcibttn = new JButton("Calculator");
        calcibttn.setBounds(360, 95, 120, 30);
        logoutbttn = new JButton("Logout");
        logoutbttn.setBounds(360, 25, 120, 30);
        clearbttn = new JButton("Clear");
        clearbttn.setBounds(360, 600, 120, 30);
        logoutbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Login();

                Invoiceframe.setVisible(false);
                Invoiceframe.dispose();
                System.out.println("Logout sucessful");
            }
        });
        clearbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (wheatcb.isSelected()) {
                    titlelb5.setText("");
                    lq1.setText("");
                    r1.setText("");
                    a1.setText("");
                    t7.setText("");

                }

                if (ricecb.isSelected()) {
                    titlelb6.setText("");
                    lq2.setText("");
                    r2.setText("");
                    a2.setText("");
                    t7.setText("");
                }
                if (sugarcb.isSelected()) {
                    titlelb7.setText("");
                    lq3.setText("");
                    r3.setText("");
                    a3.setText("");
                    t7.setText("");
                }
                if (oilcb.isSelected()) {
                    titlelb8.setText("");
                    lq4.setText("");
                    r4.setText("");
                    a4.setText("");
                    t7.setText("");
                }
                if (cerealscb.isSelected()) {
                    titlelb9.setText("");
                    lq5.setText("");
                    r5.setText("");
                    a5.setText("");
                    t7.setText("");
                }
            }
        });
        backbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Home();

                Invoiceframe.setVisible(false);
                Invoiceframe.dispose();
            }
        });
        printbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Bill Printed Sucessfully");
            }
        });
        calcibttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {

                new Calculator();

            }

        });
        generatebttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (wheatcb.isSelected()) {
                    titlelb5 = new JLabel("wheat");
                    titlelb5.setBounds(445, 430, 300, 30);
                    Invoiceframe.add(titlelb5);

                    String q1 = t2.getText();
                    lq1 = new JLabel();
                    lq1.setText(String.valueOf(q1));
                    lq1.setBounds(600, 430, 300, 30);
                    Invoiceframe.add(lq1);
                    r1 = new JLabel("100");
                    r1.setBounds(770, 430, 300, 30);
                    Invoiceframe.add(r1);
                    a1 = new JLabel();
                    float amount = 100 * Float.parseFloat(q1);
                    String am = String.valueOf(amount);
                    a1.setText(String.valueOf(am));
                    a1.setBounds(950, 430, 300, 30);
                    Invoiceframe.add(a1);
                    t7.setText(String.valueOf(am));

                }
                if (ricecb.isSelected()) {

                    String q2 = t3.getText();
                    if (wheatcb.isSelected()) {
                        titlelb6 = new JLabel("rice");
                        titlelb6.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb6);
                        lq2 = new JLabel();
                        lq2.setText(String.valueOf(q2));
                        lq2.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq2);
                        r2 = new JLabel("50");
                        r2.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r2);
                        a2 = new JLabel();
                        float amount = 50 * Float.parseFloat(q2);
                        String am = String.valueOf(amount);
                        a2.setText(String.valueOf(am));
                        a2.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a2);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float total = am1 + am2;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    } else {
                        titlelb6 = new JLabel("rice");
                        titlelb6.setBounds(445, 430, 300, 30);
                        Invoiceframe.add(titlelb6);
                        lq2 = new JLabel();
                        lq2.setText(String.valueOf(q2));
                        lq2.setBounds(600, 430, 300, 30);
                        Invoiceframe.add(lq2);
                        r2 = new JLabel("50");
                        r2.setBounds(770, 430, 300, 30);
                        Invoiceframe.add(r2);
                        a2 = new JLabel();
                        float amount = 50 * Float.parseFloat(q2);
                        String am = String.valueOf(amount);
                        a2.setText(String.valueOf(am));
                        a2.setBounds(950, 430, 300, 30);
                        Invoiceframe.add(a2);
                        t7.setText(String.valueOf(am));

                    }
                }
                if (sugarcb.isSelected()) {

                    if (wheatcb.isSelected() && ricecb.isSelected()) {
                        titlelb7 = new JLabel("sugar");
                        titlelb7.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb7);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a3);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        Float am3 = Float.parseFloat(amount3);
                        float total = am1 + am2 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    }

                    else if (wheatcb.isSelected()) {
                        titlelb7 = new JLabel("sugar");
                        titlelb7.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb7);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a3);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        float am1 = Float.parseFloat(amount1);
                        int am3 = Integer.parseInt(amount3);
                        float total = am1 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    }

                    else if (ricecb.isSelected()) {
                        titlelb7 = new JLabel("sugar");
                        titlelb7.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb7);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a3);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float total = am2 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else {
                        titlelb7 = new JLabel("sugar");
                        titlelb7.setBounds(445, 430, 300, 30);
                        Invoiceframe.add(titlelb7);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 430, 300, 30);
                        Invoiceframe.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 430, 300, 30);
                        Invoiceframe.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 430, 300, 30);
                        Invoiceframe.add(a3);
                        t7.setText(String.valueOf(am));
                    }
                }
                if (oilcb.isSelected()) {

                    if (wheatcb.isSelected() && ricecb.isSelected() && sugarcb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 490, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 490, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 490, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 490, 300, 30);
                        Invoiceframe.add(a4);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am2 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected() && sugarcb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a4);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am2 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    } else if (wheatcb.isSelected() && sugarcb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a4);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else if (wheatcb.isSelected() && ricecb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a4);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am2 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (sugarcb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a4);
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a4);
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float total = am2 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected()) {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a4);
                        String amount1 = a1.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else {
                        titlelb8 = new JLabel("oil");
                        titlelb8.setBounds(445, 430, 300, 30);
                        Invoiceframe.add(titlelb8);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 430, 300, 30);
                        Invoiceframe.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 430, 300, 30);
                        Invoiceframe.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 430, 300, 30);
                        Invoiceframe.add(a4);
                        t7.setText(String.valueOf(am));
                    }
                }
                if (cerealscb.isSelected()) {
                    if (wheatcb.isSelected() && ricecb.isSelected() && sugarcb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 510, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 510, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 510, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 510, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am2 + am3 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected() && ricecb.isSelected() && sugarcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 490, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am2 + am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected() && ricecb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 490, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am2 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected() && sugarcb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 490, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        Invoiceframe.add(r5);
                        a4 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am3 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected() && sugarcb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 490, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        Invoiceframe.add(a5);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am2 + am3 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else if (wheatcb.isSelected() && ricecb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am2 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected() && sugarcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount4 = a4.getText();
                        String amount5 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected() && sugarcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am5 = Float.parseFloat(amount5);
                        float total = am2 + am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am2 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (sugarcb.isSelected() && oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 470, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        Invoiceframe.add(a5);
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am3 + am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (wheatcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a5);
                        String amount1 = a1.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am5 = Float.parseFloat(amount5);
                        float total = am1 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (ricecb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a5);
                        String amount2 = a2.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am5 = Float.parseFloat(amount5);
                        float total = am2 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (sugarcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a5);
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am5 = Float.parseFloat(amount5);
                        float total = am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (oilcb.isSelected()) {
                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 450, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        Invoiceframe.add(a5);
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am4 = Float.parseFloat(amount4);
                        float am5 = Float.parseFloat(amount5);
                        float total = am4 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else {

                        titlelb9 = new JLabel("cerelas");
                        titlelb9.setBounds(445, 430, 300, 30);
                        Invoiceframe.add(titlelb9);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 430, 300, 30);
                        Invoiceframe.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 430, 300, 30);
                        Invoiceframe.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 430, 300, 30);
                        Invoiceframe.add(a5);
                        t7.setText(String.valueOf(am));

                    }

                }

            }

        });

        Invoiceframe.add(wheatcb);
        Invoiceframe.add(ricecb);
        Invoiceframe.add(sugarcb);
        Invoiceframe.add(oilcb);
        Invoiceframe.add(cerealscb);
        Invoiceframe.add(generatebttn);
        Invoiceframe.add(backbttn);
        Invoiceframe.add(printbttn);
        Invoiceframe.add(calcibttn);
        Invoiceframe.add(clearbttn);
        Invoiceframe.add(logoutbttn);

        Invoiceframe.add(titlelb);
        Invoiceframe.add(addresslb);
        Invoiceframe.add(billnolb);
        Invoiceframe.add(datelb);
        Invoiceframe.add(t1);
        Invoiceframe.add(itemlb);
        Invoiceframe.add(qntlb);
        Invoiceframe.add(wheatlb);
        Invoiceframe.add(t2);
        Invoiceframe.add(ricelb);
        Invoiceframe.add(t3);
        Invoiceframe.add(sugarlb);
        Invoiceframe.add(oillb);
        Invoiceframe.add(cerealslb);
        Invoiceframe.add(t4);
        Invoiceframe.add(t5);
        Invoiceframe.add(t6);
        Invoiceframe.setSize(1650, 1080);
        Invoiceframe.setLayout(null);

        Invoiceframe.setVisible(true);
        Invoiceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package com.vit.billing;

import javax.swing.*;
import com.formdev.flatlaf.*;

import com.vit.billing.pages.Login;

public class App {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        new Login();
    }
}

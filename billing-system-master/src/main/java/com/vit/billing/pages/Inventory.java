package com.vit.billing.pages;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class Inventory {

    private JFrame frame;
    private JPanel mainPane;
    private JPanel topPane;
    private JPanel tablePane;

    private JLabel selectAccountLabel;

    private JButton addButton;
    private JButton deleteButton;
    private JButton backButton;
    private JButton logoutButton;
    private JButton updateButton;

    private JTable table;

    private JScrollPane scroll;

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());

        try {
            // Connect to the MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "jeeva@2002");

            // Execute a SELECT statement to fetch the required data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM inventory");

            // Store the fetched data in a 2D array or an ArrayList
            Object[][] data = new Object[5][5];
            int row = 0;
            while (rs.next()) {
                data[row][0] = rs.getInt("sno");
                data[row][1] = rs.getString("productname");
                data[row][2] = rs.getInt("quantity");
                data[row][3] = rs.getDouble("purchaseprice");
                data[row][4] = rs.getDouble("sellingprice");
                row++;
            }

            // Create a new DefaultTableModel object and set the column names and data from
            // the fetched data
            String[] columnNames = { "sno", "productname", "quantity", "purchaseprice", "sellingprice" };
            DefaultTableModel model = new DefaultTableModel(data, columnNames);

            // Create a new JTable object with the DefaultTableModel
            table = new JTable(model);

            // Wrap the JTable object in a JScrollPane
            scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

            // Add the JScrollPane object to the GUI
            JFrame frame = new JFrame("Inventory");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(scroll);
            frame.pack();
            frame.setVisible(true);

            // Close the database connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        selectAccountLabel = new JLabel("VIT Billing System | Inventory");
        selectAccountLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        updateButton = new JButton("Update");
        updateButton.setBounds(1000, 350, 200, 30);
        addButton = new JButton("Add");
        addButton.setBounds(1000, 400, 200, 30);
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(1000, 450, 200, 30);
        backButton = new JButton("Back");
        backButton.setBounds(1100, 20, 100, 40);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1100, 70, 100, 40);

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Home();

                frame.setVisible(false);
                frame.dispose();
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Login();

                frame.setVisible(false);
                frame.dispose();
                System.out.println("Logout sucessful");
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Connect to the MySQL database
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root",
                            "jeeva@2002");
                    Statement stmtCount = con.createStatement();
                    ResultSet rsCount = stmtCount.executeQuery("SELECT COUNT(*) FROM inventory");
                    rsCount.next();
                    int rowCount = rsCount.getInt(1);

                    // Generate a unique sno value
                    int sno = rowCount + 1;

                    // Execute an INSERT statement to add the new data to the database

                    // Prompt the user to enter the new data
                    String productName = JOptionPane.showInputDialog(frame, "Enter Product Name:");
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Quantity:"));
                    double purchasePrice = Double
                            .parseDouble(JOptionPane.showInputDialog(frame, "Enter Purchase Price:"));
                    double sellingPrice = Double
                            .parseDouble(JOptionPane.showInputDialog(frame, "Enter Selling Price:"));

                    // Execute an INSERT statement to add the new data to the database
                    String query = "INSERT INTO inventory (sno, productname, quantity, purchaseprice, sellingprice) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.setInt(1, sno);
                    stmt.setString(2, productName);
                    stmt.setInt(3, quantity);
                    stmt.setDouble(4, purchasePrice);
                    stmt.setDouble(5, sellingPrice);
                    int result = stmt.executeUpdate();
                    // Display a success message if the data was added successfully
                    if (result > 0) {
                        JOptionPane.showMessageDialog(frame, "Data added successfully.");
                    }

                    // Refresh the JTable with the updated data
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    Statement stmt2 = con.createStatement();
                    ResultSet rs = stmt2.executeQuery("SELECT * FROM inventory");
                    int row = 0;
                    while (rs.next()) {
                        model.addRow(new Object[] { rs.getInt("sno"), rs.getString("productname"),
                                rs.getInt("quantity"), rs.getDouble("purchaseprice"), rs.getDouble("sellingprice") });
                        row++;
                    }

                    // Close the database connection
                    con.close();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Connect to the MySQL database
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root",
                            "jeeva@2002");

                    // Prompt the user to enter the sno value of the data to be deleted
                    int sno = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter sno value to delete:"));

                    // Execute a DELETE statement to remove the data from the database
                    String query = "DELETE FROM inventory WHERE sno=?";
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.setInt(1, sno);
                    int result = stmt.executeUpdate();

                    // Update the sno values to maintain order
                    if (result > 0) {
                        // Retrieve all rows with higher sno values than the one that was deleted
                        String selectQuery = "SELECT * FROM inventory WHERE sno > ?";
                        PreparedStatement selectStmt = con.prepareStatement(selectQuery);
                        selectStmt.setInt(1, sno);
                        ResultSet selectRs = selectStmt.executeQuery();

                        // Decrement the sno values and update the rows in the database
                        while (selectRs.next()) {
                            int oldSno = selectRs.getInt("sno");
                            int newSno = oldSno - 1;
                            String updateQuery = "UPDATE inventory SET sno = ? WHERE sno = ?";
                            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                            updateStmt.setInt(1, newSno);
                            updateStmt.setInt(2, oldSno);
                            updateStmt.executeUpdate();
                        }

                        // Display a success message if the data was deleted successfully
                        JOptionPane.showMessageDialog(frame, "Data deleted successfully.");
                    }

                    // Refresh the JTable with the updated data
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    Statement stmt2 = con.createStatement();
                    ResultSet rs = stmt2.executeQuery("SELECT * FROM inventory");
                    int row = 0;
                    while (rs.next()) {
                        model.addRow(
                                new Object[] { rs.getInt("sno"), rs.getString("productname"), rs.getInt("quantity"),
                                        rs.getDouble("purchaseprice"), rs.getDouble("sellingprice") });
                        row++;
                    }

                    // Close the database connection
                    con.close();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Connect to the MySQL database
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root",
                            "jeeva@2002");

                    // Prompt the user to enter the sno value of the data to be updated
                    int sno = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter sno value to update:"));

                    // Retrieve the row to be updated from the database
                    String selectQuery = "SELECT * FROM inventory WHERE sno = ?";
                    PreparedStatement selectStmt = con.prepareStatement(selectQuery);
                    selectStmt.setInt(1, sno);
                    ResultSet selectRs = selectStmt.executeQuery();

                    // Prompt the user to select which column to update
                    String[] options = { "Product Name", "Quantity", "Purchase Price", "Selling Price" };
                    int columnOption = JOptionPane.showOptionDialog(frame, "Select column to update:", "Update Column",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                    // Prompt the user to enter the updated value for the selected column
                    String newValue = JOptionPane.showInputDialog(frame, "Enter new value:");
                    String columnName;
                    switch (columnOption) {
                        case 0:
                            columnName = "productname";
                            break;
                        case 1:
                            columnName = "quantity";
                            break;
                        case 2:
                            columnName = "purchaseprice";
                            break;
                        case 3:
                            columnName = "sellingprice";
                            break;
                        default:
                            columnName = "";
                            break;
                    }

                    // Update the row in the database with the new value for the selected column
                    if (selectRs.next() && !columnName.isEmpty()) {
                        String updateQuery = "UPDATE inventory SET " + columnName + "=? WHERE sno=?";
                        PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                        if (columnName.equals("productname")) {
                            updateStmt.setString(1, newValue);
                        } else {
                            updateStmt.setDouble(1, Double.parseDouble(newValue));
                        }
                        updateStmt.setInt(2, sno);
                        updateStmt.executeUpdate();

                        // Display a success message if the row was updated successfully
                        JOptionPane.showMessageDialog(frame, "Row updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "No row found with sno = " + sno + " or invalid column selected.");
                    }

                    // Refresh the JTable with the updated data
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    Statement stmt2 = con.createStatement();
                    ResultSet rs = stmt2.executeQuery("SELECT * FROM inventory");
                    int row = 0;
                    while (rs.next()) {
                        model.addRow(
                                new Object[] { rs.getInt("sno"), rs.getString("productname"), rs.getInt("quantity"),
                                        rs.getDouble("purchaseprice"), rs.getDouble("sellingprice") });
                        row++;
                    }

                    // Close the database connection
                    con.close();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        topPane = new JPanel();
        topPane.setLayout(new BorderLayout());

        topPane.add(selectAccountLabel, BorderLayout.WEST);

        tablePane = new JPanel();
        tablePane.add(scroll);

        mainPane = new JPanel();
        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
        frame.add(updateButton);

        frame.add(addButton);
        frame.add(deleteButton);
        frame.add(backButton);
        frame.add(logoutButton);
        frame.add(topPane, BorderLayout.NORTH);
        frame.add(tablePane, BorderLayout.CENTER);

        frame.setSize(1080, 900);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
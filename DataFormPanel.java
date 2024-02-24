/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonfive;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author amith
 */
public class DataFormPanel extends JPanel {
    private JTextField nameField, emailField;
    private JButton submitButton;
    private DefaultTableModel tableModel;

    public DataFormPanel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        setLayout(new FlowLayout());

        nameField = new JTextField(10);
        emailField = new JTextField(10);
        submitButton = new JButton("Submit");

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                if (!name.isEmpty() && !email.isEmpty()) {
                    tableModel.addRow(new Object[]{name, email});
                    nameField.setText(""); // Clear the name field
                    emailField.setText(""); // Clear the email field
                }
            }
        });
    }
}

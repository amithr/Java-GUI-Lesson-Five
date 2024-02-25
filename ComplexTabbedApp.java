/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonfive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author amith
 */
public class ComplexTabbedApp extends JFrame {
    private JLabel displayLabel; // Label to display data in Tab 2

    public ComplexTabbedApp() {
        setTitle("Simple Tabbed Application");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1 - Form
        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("Enter your name:"));
        JTextField nameField = new JTextField(20);
        tab1.add(nameField);
        JButton submitButton = new JButton("Submit");
        tab1.add(submitButton);

        // Tab 2 - Display
        JPanel tab2 = new JPanel();
        displayLabel = new JLabel("Your name will appear here");
        tab2.add(displayLabel);

        tabbedPane.addTab("Form", tab1);
        tabbedPane.addTab("Display", tab2);

        getContentPane().add(tabbedPane);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Hello, " + nameField.getText() + "!");
                // Optionally, switch to the second tab automatically
                tabbedPane.setSelectedIndex(1);
            }
        });

        setVisible(true);
    }
    
}

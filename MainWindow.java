/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonfive;

import javax.swing.*;

/**
 *
 * @author amith
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Excel-like JTable with Form Submission");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tabbed Pane Setup
        JTabbedPane tabbedPane = new JTabbedPane();

        // Table Panel
        DataTablePanel tablePanel = new DataTablePanel();
        tabbedPane.addTab("Table", tablePanel);

        // Form Panel
        DataFormPanel formPanel = new DataFormPanel(tablePanel.getTableModel());
        tabbedPane.addTab("Form", formPanel);

        // Add TabbedPane to the frame
        getContentPane().add(tabbedPane);
    }
    
}

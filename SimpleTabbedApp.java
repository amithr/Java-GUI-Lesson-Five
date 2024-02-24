/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonfive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author amith
 */
public class SimpleTabbedApp extends JFrame {
    public SimpleTabbedApp() {
        // Set the title of the window
        setTitle("Simple Tabbed Application");
        // Set the size of the window
        setSize(400, 200);
        // Specify the operation that will happen by default when the user initiates a "close" on this frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Center the window on the screen
        setLocationRelativeTo(null);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the first tab
        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("This is Tab 1"));
        tabbedPane.addTab("Tab 1", tab1);

        // Create the second tab
        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("This is Tab 2"));
        tabbedPane.addTab("Tab 2", tab2);

        // Add the tabbed pane to the content pane of the frame
        getContentPane().add(tabbedPane);

        // Make the window visible
        setVisible(true);
    }
}

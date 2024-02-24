/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonfive;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author amith
 */
public class DataTablePanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;

    public DataTablePanel() {
        setLayout(new BorderLayout());
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Email");

        table = new JTable(tableModel);
        table.setGridColor(Color.GRAY);
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(25);
        table.setCellSelectionEnabled(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
}

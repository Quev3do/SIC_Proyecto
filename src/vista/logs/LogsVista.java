/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.logs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Steven Medrano
 */

public class LogsVista extends JFrame {

    private JPanel panelPrincipal;
    private JButton btnInicio;
    private JButton btnExcel;
    private JButton btnRetirarFiltro;
    private JButton btnAplicarFiltro;
    private JTable tablaLogs;
    private JScrollPane scrollPane;
    private JTextField txtDe;
    private JTextField txtHasta;

    public LogsVista() {
        // Inicializar componentes
        panelPrincipal = new JPanel(new GridBagLayout());
        btnInicio = new JButton("inicio");
        btnExcel = new JButton("excel");
        btnRetirarFiltro = new JButton("retirar filtro");
        btnAplicarFiltro = new JButton("aplicar filtro");
        txtDe = new JTextField(10);
        txtHasta = new JTextField(10);

        // Crear la tabla con el modelo de datos
        String[] columnas = {"id", "concepto", "codigo", "id"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        tablaLogs = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tablaLogs);

        // Estilo de botones
        btnInicio.setBackground(Color.decode("#C4F513"));
        btnExcel.setBackground(Color.decode("#C4F513"));
        btnRetirarFiltro.setBackground(Color.decode("#FFA500"));
        btnAplicarFiltro.setBackground(Color.decode("#ADD8E6"));

        // Configurar GridBagConstraints para los componentes
        GridBagConstraints gbc = new GridBagConstraints();

        // Botón inicio
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelPrincipal.add(btnInicio, gbc);

        // ScrollPane con la tabla
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panelPrincipal.add(scrollPane, gbc);

        // Campos de texto "de" y "hasta"
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(new JLabel("de:"), gbc);

        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(txtDe, gbc);

        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(new JLabel("hasta:"), gbc);

        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(txtHasta, gbc);

        // Botón retirar filtro
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(btnRetirarFiltro, gbc);

        // Botón aplicar filtro
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(btnAplicarFiltro, gbc);

        // Botón excel
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 10);
        panelPrincipal.add(btnExcel, gbc);

        // Configurar el JFrame
        setTitle("Logs Vista");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panelPrincipal);

        // Añadir ActionListeners
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "inicio"
                JOptionPane.showMessageDialog(null, "Regresando a inicio");
            }
        });

        btnExcel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "excel"
                exportTableToExcel(tablaLogs);
            }
        });

        btnRetirarFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "retirar filtro"
                JOptionPane.showMessageDialog(null, "Filtro retirado");
            }
        });

        btnAplicarFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "aplicar filtro"
                JOptionPane.showMessageDialog(null, "Filtro aplicado");
            }
        });
    }

    private void exportTableToExcel(JTable table) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                FileWriter fw = new FileWriter(file + ".csv");

                for (int i = 0; i < table.getColumnCount(); i++) {
                    fw.write(table.getColumnName(i) + ",");
                }
                fw.write("\n");

                for (int i = 0; i < table.getRowCount(); i++) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        fw.write(table.getValueAt(i, j).toString() + ",");
                    }
                    fw.write("\n");
                }

                fw.close();
                JOptionPane.showMessageDialog(null, "Datos exportados a Excel correctamente.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al exportar datos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Crear y mostrar la vista
        SwingUtilities.invokeLater(() -> {
            LogsVista vista = new LogsVista();
            vista.setVisible(true);
        });
    }
}

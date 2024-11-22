/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.user;

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
public class VistaUsers extends JFrame {

    private JPanel panelPrincipal;
    private JButton btnInicio;
    private JButton btnExcel;
    private JButton btnAgregarNuevo;
    private JTable tablaUsuarios;
    private JScrollPane scrollPane;

    public VistaUsers() {
        // Inicializar componentes
        panelPrincipal = new JPanel(new GridBagLayout());
        btnInicio = new JButton("inicio");
        btnExcel = new JButton("excel");
        btnAgregarNuevo = new JButton("agregar nuevo");

        // Crear la tabla con el modelo de datos
        String[] columnas = {"id", "nombre", "email", "telefono", "rol", "despedir"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        tablaUsuarios = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tablaUsuarios);

        // Estilo de botones
        btnInicio.setBackground(Color.decode("#C4F513"));
        btnExcel.setBackground(Color.decode("#C4F513"));
        btnAgregarNuevo.setBackground(Color.decode("#D2C4F9"));

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
        gbc.gridwidth = 5;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panelPrincipal.add(scrollPane, gbc);

        // Botón excel
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panelPrincipal.add(btnExcel, gbc);

        // Botón agregar nuevo
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(btnAgregarNuevo, gbc);

        // Configurar el JFrame
        setTitle("Users Vista");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panelPrincipal);

        // Añadir ActionListeners
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "inicio"
                JOptionPane.showMessageDialog(null, "Botón inicio presionado");
            }
        });

        btnExcel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "excel"
                exportTableToExcel(tablaUsuarios);
            }
        });

        btnAgregarNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón "agregar nuevo"
                agregarNuevoUsuario();
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

    private void agregarNuevoUsuario() {
        JTextField idField = new JTextField(5);
        JTextField nombreField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextField telefonoField = new JTextField(10);
        JTextField rolField = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(5, 2));
        myPanel.add(new JLabel("ID:"));
        myPanel.add(idField);
        myPanel.add(new JLabel("Nombre:"));
        myPanel.add(nombreField);
        myPanel.add(new JLabel("Email:"));
        myPanel.add(emailField);
        myPanel.add(new JLabel("Teléfono:"));
        myPanel.add(telefonoField);
        myPanel.add(new JLabel("Rol:"));
        myPanel.add(rolField);

        int result = JOptionPane.showConfirmDialog(null, myPanel, 
                 "Agregar nuevo usuario", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
            model.addRow(new Object[]{idField.getText(), nombreField.getText(), emailField.getText(), telefonoField.getText(), rolField.getText(), "Despedir"});
        }
    }

    public static void main(String[] args) {
        // Crear y mostrar la vista
        SwingUtilities.invokeLater(() -> {
            VistaUsers vista = new VistaUsers();
            vista.setVisible(true);
        });
    }
}

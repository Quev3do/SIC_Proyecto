/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.user;

import vistas.Inicio.Inicio;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

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
    }

    public static void main(String[] args) {
        // Crear y mostrar la vista
        SwingUtilities.invokeLater(() -> {
            VistaUsers vista = new VistaUsers();
            vista.setVisible(true);
        });
    }
}
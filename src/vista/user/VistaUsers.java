/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.user;

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
        panelPrincipal = new JPanel(new BorderLayout());
        btnInicio = new JButton("inicio");
        btnExcel = new JButton("excel");
        btnAgregarNuevo = new JButton("agregar nuevo");
        
        // Crear la tabla con el modelo de datos
        String[] columnas = {"id", "nombre", "email", "telefono", "rol", "despedir"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        tablaUsuarios = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tablaUsuarios);
        
        // Configurar los paneles y layouts
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.add(btnInicio);
        panelIzquierdo.add(Box.createVerticalStrut(20)); // Espacio entre botones
        panelIzquierdo.add(btnExcel);
        panelIzquierdo.add(Box.createVerticalStrut(20));
        panelIzquierdo.add(btnAgregarNuevo);
        
        // Estilo de botones
        btnInicio.setBackground(Color.decode("#C4F513"));
        btnExcel.setBackground(Color.decode("#C4F513"));
        btnAgregarNuevo.setBackground(Color.decode("#D2C4F9"));
        
        // Agregar los paneles al panel principal
        panelPrincipal.add(panelIzquierdo, BorderLayout.WEST);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        
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
            UsersVista vista = new UsersVista();
            vista.setVisible(true);
        });
    }
}

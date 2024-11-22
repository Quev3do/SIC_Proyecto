/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.libro_diario;

import vistas.libro_mayor.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
//import Utilidades_configuracion.CustomCellLabelTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import modelos.cuentas;
import modelos.documentos;
import modelos.users;
import modelos.logs;
import modelos.libro_diario;

import vistas.Inicio.Inicio;

import vistas.libro_diario.LibroDiarioCrear;
import vistas.libro_diario.LibroDiarioEdit;

/**
 *
 * @author jonat
 */
public class LibroDiarioVista extends javax.swing.JFrame {

    public ArrayList<cuentas> listaCuentas;
    public ArrayList<documentos> listaDocumentos;
    public ArrayList<users> listaUsers;
    public ArrayList<logs> listaLogs;
    cuentas cuenta1;
    
    users User;
    
    /**
     * Creates new form LibroMayorVista
     */
    public LibroDiarioVista(){
        initComponents();
    }
    
    public LibroDiarioVista(users user) {
        this.User = user;
        initComponents();
        cuenta1 = new cuentas();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_LibroMayor = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibroMayor = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        lblBalance = new javax.swing.JLabel();
        lblDebe = new javax.swing.JLabel();
        lblHaber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libro Mayor");

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        tblLibroMayor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibroMayor);

        btncerrar.setBackground(new java.awt.Color(220, 101, 57));
        btncerrar.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.setText("Cerrar todo");

        btnExportarExcel.setBackground(new java.awt.Color(181, 229, 29));
        btnExportarExcel.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnExportarExcel.setText("Excel");

        btnagregar.setBackground(new java.awt.Color(37, 150, 190));
        btnagregar.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        lblBalance.setBackground(new java.awt.Color(0, 0, 0));
        lblBalance.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblBalance.setText("Balance:");

        lblDebe.setBackground(new java.awt.Color(0, 0, 0));
        lblDebe.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDebe.setText("0.00");

        lblHaber.setBackground(new java.awt.Color(0, 0, 0));
        lblHaber.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHaber.setText("0.00");

        javax.swing.GroupLayout Jpanel_LibroMayorLayout = new javax.swing.GroupLayout(Jpanel_LibroMayor);
        Jpanel_LibroMayor.setLayout(Jpanel_LibroMayorLayout);
        Jpanel_LibroMayorLayout.setHorizontalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblBalance)
                        .addGap(97, 97, 97)
                        .addComponent(lblDebe)
                        .addGap(113, 113, 113)
                        .addComponent(lblHaber))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnExportarExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        Jpanel_LibroMayorLayout.setVerticalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDebe)
                    .addComponent(lblBalance)
                    .addComponent(lblHaber))
                .addGap(27, 27, 27))
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(Jpanel_LibroMayor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio ini = new Inicio();
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        LibroDiarioCrear libDD = new LibroDiarioCrear(this.User);
        libDD.show();
        this.dispose();
    }//GEN-LAST:event_btnagregarActionPerformed

    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)this.tblLibroMayor.getModel();
        modelo.setRowCount(0);
        
        listaCuentas = cuenta1.getCuentas();
        
        for(cuentas item : listaCuentas){
            System.out.println(item.getTipo_cuenta());
            
            double debe, haber;
            
            String tipo = item.getTipo_cuenta();
            
            if(tipo.equals("activo") || tipo.equals("patrimonio")){
                debe = item.getSaldo();
            }else{
                debe = 0;
            }
            
            if(tipo.equals("pasivo") || tipo.equals("gastos") || tipo.equals("ingresos")){
                haber = item.getSaldo();
            }else{
                haber = 0;
            }
            
            modelo.addRow(new Object[]{item.getNombre_cuenta(),
                debe,
                haber
            });
            
            lblDebe.setText(String.valueOf(debe+ Double.parseDouble(lblDebe.getText())));
            lblHaber.setText(String.valueOf(haber + Double.parseDouble(lblHaber.getText())));
        }
        
        this.tblLibroMayor.setModel(modelo);
    }
    
    public void diseñoTabla(){
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibroDiarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibroDiarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibroDiarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibroDiarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibroDiarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_LibroMayor;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDebe;
    private javax.swing.JLabel lblHaber;
    private javax.swing.JTable tblLibroMayor;
    // End of variables declaration//GEN-END:variables
}   

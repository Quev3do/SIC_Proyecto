/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.libro_mayor;

import ExportExcel.ExportExcel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
//import Utilidades_configuracion.CustomCellLabelTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelos.balance;

import modelos.cuentas;
import modelos.documentos;
import modelos.users;
import modelos.logs;
import modelos.libro_diario;
import modelos.libro_mayor_filtro;

import vistas.Inicio.Inicio;

/**
 *
 * @author jonat
 */
public class LibroMayorVista extends javax.swing.JFrame {

    public ArrayList<cuentas> listaCuentas;
    public ArrayList<documentos> listaDocumentos;
    public ArrayList<users> listaUsers;
    public ArrayList<logs> listaLogs;
    cuentas cuenta1;
    
    users User;
    
    /**
     * Creates new form LibroMayorVista
     */
    public LibroMayorVista(){
        initComponents();
    }
    
    public LibroMayorVista(users user) {
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
        btnQuitarFiltro = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        btnAplicarFiltro = new javax.swing.JButton();
        lblHastaMes = new javax.swing.JLabel();
        lblDesdeMes = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblDebe = new javax.swing.JLabel();
        lblHaber = new javax.swing.JLabel();
        txtfecha2 = new javax.swing.JFormattedTextField();
        txtfecha1 = new javax.swing.JFormattedTextField();

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
                "id", "Cuenta", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibroMayor);

        btnQuitarFiltro.setBackground(new java.awt.Color(220, 101, 57));
        btnQuitarFiltro.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnQuitarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarFiltro.setText("Remover Filtro de Fecha");
        btnQuitarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarFiltroActionPerformed(evt);
            }
        });

        btnExportarExcel.setBackground(new java.awt.Color(181, 229, 29));
        btnExportarExcel.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnExportarExcel.setText("Excel");
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });

        btnAplicarFiltro.setBackground(new java.awt.Color(37, 150, 190));
        btnAplicarFiltro.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicarFiltro.setText("Aplicar Filtro de Fecha");
        btnAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFiltroActionPerformed(evt);
            }
        });

        lblHastaMes.setBackground(new java.awt.Color(0, 0, 0));
        lblHastaMes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHastaMes.setText("Hasta");

        lblDesdeMes.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes.setText("Desde");

        lblBalance.setBackground(new java.awt.Color(0, 0, 0));
        lblBalance.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblBalance.setText("Balance:");

        lblDebe.setBackground(new java.awt.Color(0, 0, 0));
        lblDebe.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDebe.setText("0.00");

        lblHaber.setBackground(new java.awt.Color(0, 0, 0));
        lblHaber.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHaber.setText("0.00");

        txtfecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        txtfecha1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        javax.swing.GroupLayout Jpanel_LibroMayorLayout = new javax.swing.GroupLayout(Jpanel_LibroMayor);
        Jpanel_LibroMayor.setLayout(Jpanel_LibroMayorLayout);
        Jpanel_LibroMayorLayout.setHorizontalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblBalance)
                        .addGap(97, 97, 97)
                        .addComponent(lblDebe)
                        .addGap(113, 113, 113)
                        .addComponent(lblHaber))
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnQuitarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                            .addGap(0, 2, Short.MAX_VALUE)
                            .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDesdeMes, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHastaMes, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnExportarExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        Jpanel_LibroMayorLayout.setVerticalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 377, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDebe)
                            .addComponent(lblBalance)
                            .addComponent(lblHaber))
                        .addGap(27, 27, 27))
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesdeMes)
                            .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHastaMes)
                            .addComponent(txtfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)
                        .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))))
        );

        getContentPane().add(Jpanel_LibroMayor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio ini = new Inicio(User);
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFiltroActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)this.tblLibroMayor.getModel();
        modelo.setRowCount(0);
        
        String fechaI = txtfecha1.getText();
        String fechaF = txtfecha2.getText();
        
        balance balanc = new balance().getTotalDebeHaberPorRango(fechaI,fechaF);
        ArrayList<libro_mayor_filtro> datosFiltrados = new libro_mayor_filtro().libroMayorFiltro(fechaI,fechaF);
        
        for(libro_mayor_filtro dato: datosFiltrados){
            modelo.addRow(new Object[]{
                dato.getIdCuenta(),
                dato.getNombreCuenta(),
                dato.getTotalDebe(),
                dato.getTotalHaber()
            });
        }
        
        this.tblLibroMayor.setModel(modelo);
        
        lblDebe.setText(balanc.getDebeGlobal());
        lblHaber.setText(balanc.getHaberGlobal());
    }//GEN-LAST:event_btnAplicarFiltroActionPerformed

    private void btnQuitarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarFiltroActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnQuitarFiltroActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        ExportExcel EXXC;
        
        try {
            EXXC = new ExportExcel();
            EXXC.exportarExcel(tblLibroMayor, "Libro_Mayor");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarExcelActionPerformed

    public void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)this.tblLibroMayor.getModel();
        modelo.setRowCount(0);
        
        if(listaCuentas != null){
            listaCuentas.clear();
        }
        
        listaCuentas = cuenta1.getCuentas();
        
        for(cuentas item : listaCuentas){
            System.out.println(item.getNombre_cuenta() + " :: " + item.getTipo_cuenta() + " : " + item.getSaldo());
            
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
            
            modelo.addRow(new Object[]{item.getId_cuenta(),
                item.getNombre_cuenta(),
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
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibroMayorVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_LibroMayor;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnQuitarFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDebe;
    private javax.swing.JLabel lblDesdeMes;
    private javax.swing.JLabel lblHaber;
    private javax.swing.JLabel lblHastaMes;
    private javax.swing.JTable tblLibroMayor;
    private javax.swing.JFormattedTextField txtfecha1;
    private javax.swing.JFormattedTextField txtfecha2;
    // End of variables declaration//GEN-END:variables
}   

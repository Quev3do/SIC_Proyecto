/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.documentos;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelos.cuentas;
import modelos.documentos;
import modelos.logs;
import modelos.users;
import vistas.Inicio.Inicio;
import vistas.documentos.CrearDocumento;

/**
 *
 * @author Usuario
 */
public class DocumentosVista extends javax.swing.JFrame {
  
       
    public ArrayList<documentos> listaDocumentos;
    documentos docu;
    users User;

    /**
     * Creates new form DocumentosVista
     */
    public DocumentosVista(){
        initComponents();
    }
    
    public DocumentosVista(users Us) {
        this.User = Us;
        initComponents();
        docu = new documentos();
        
        String rol = User.getUser_rol();
        
        if(rol.equals("Gerente")){
            btnaddDoc.setVisible(false);
            btnaddDoc.disable();
        }
        
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

        btnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentos = new javax.swing.JTable();
        btnAplicarFiltro = new javax.swing.JButton();
        btnaddDoc = new javax.swing.JButton();
        btnaddDoc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        tblDocumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Codigo", "Fecha doc", "Fecha reg"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDocumentos);

        btnAplicarFiltro.setBackground(new java.awt.Color(102, 255, 0));
        btnAplicarFiltro.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnAplicarFiltro.setForeground(new java.awt.Color(0, 0, 0));
        btnAplicarFiltro.setText("Excel");

        btnaddDoc.setBackground(new java.awt.Color(37, 150, 190));
        btnaddDoc.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnaddDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnaddDoc.setText("Agregar Documento");
        btnaddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddDocActionPerformed(evt);
            }
        });

        btnaddDoc1.setBackground(new java.awt.Color(255, 102, 51));
        btnaddDoc1.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnaddDoc1.setForeground(new java.awt.Color(255, 255, 255));
        btnaddDoc1.setText("Editar Documento");
        btnaddDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddDoc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnaddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnaddDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio ini = new Inicio(this.User);
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnaddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddDocActionPerformed
        CrearDocumento cdoc = new CrearDocumento();
        cdoc.show();
        this.dispose();
    }//GEN-LAST:event_btnaddDocActionPerformed

    private void btnaddDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddDoc1ActionPerformed
        DocumentoEditar Edit = new DocumentoEditar();
        Edit.show();
        this.dispose();
    }//GEN-LAST:event_btnaddDoc1ActionPerformed

    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)this.tblDocumentos.getModel();
        modelo.setRowCount(0);
        
        listaDocumentos = docu.getDocumentos();
        
        for (documentos item : listaDocumentos) {
            modelo.addRow(new Object[]{
                item.getId_documento(),
                item.getCodigo_doc(),
                item.getFecha_doc(),
                item.getFecha_registro_doc()
            });
        }
        
        this.tblDocumentos.setModel(modelo);
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
            java.util.logging.Logger.getLogger(DocumentosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocumentosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocumentosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocumentosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocumentosVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnaddDoc;
    private javax.swing.JButton btnaddDoc1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDocumentos;
    // End of variables declaration//GEN-END:variables
}

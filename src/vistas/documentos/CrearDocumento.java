/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.documentos;

import vistas.documentos.DocumentosVista;

import modelos.documentos;
import modelos.users;
import modelos.logs;

import vistas.documentos.DocumentosVista;

import java.time.LocalDate;

import java.util.Date;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jajon
 */
public class CrearDocumento extends javax.swing.JFrame {
    
    documentos docu;
    
    users User;

    /**
     * Creates new form CrearDocumento
     */
    public CrearDocumento(){
        initComponents();
    }
    
    public CrearDocumento(users us) {
        this.User = us;
        
        docu = new documentos();
        
        initComponents();
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
        lblDesdeMes2 = new javax.swing.JLabel();
        lblDesdeMes3 = new javax.swing.JLabel();
        lblDesdeMes4 = new javax.swing.JLabel();
        txtfechadoc = new javax.swing.JTextField();
        txtfechareg = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DocumentosCrear");

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Regresar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lblDesdeMes2.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes2.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes2.setText("Codigo");

        lblDesdeMes3.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes3.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes3.setText("Fecha del registro:");

        lblDesdeMes4.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes4.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes4.setText("Fecha documento:");

        btningresar.setBackground(new java.awt.Color(0, 204, 204));
        btningresar.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesdeMes3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btningresar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtfechareg))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDesdeMes2)
                            .addComponent(lblDesdeMes4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfechadoc, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtcodigo))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfechareg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesdeMes2)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesdeMes4)
                            .addComponent(txtfechadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(lblDesdeMes3)))
                .addGap(54, 54, 54)
                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        DocumentosVista ini = new DocumentosVista();
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        docu.setCodigo_doc(txtcodigo.getText());
        
        /*------------------IGNORARRRRRR-----------------
        String string = txtfechadoc.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
        */
        
        docu.setFecha_doc(txtfechadoc.getText());
        docu.setFecha_registro_doc(txtfechareg.getText());
        
        if(docu.insertDocumento(docu)>0){
          System.out.println("Se agrego el documento.");
        }else{
            System.out.println("No se agrego.");
        }
        
        logs log = new logs();
        
        LocalDate fecha_ahora = LocalDate.now();
        
        log.setFecha_log(String.valueOf(fecha_ahora));
        log.setId_user(User.getId_user());
        log.setAccion("Se edito un documento.");
        
        if(log.insertLog(log)>0){
            System.out.println("Se agrego el log.");
        }else{
            System.out.println("No se agrego el log.");
        }
    }//GEN-LAST:event_btningresarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel lblDesdeMes2;
    private javax.swing.JLabel lblDesdeMes3;
    private javax.swing.JLabel lblDesdeMes4;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfechadoc;
    private javax.swing.JTextField txtfechareg;
    // End of variables declaration//GEN-END:variables
}

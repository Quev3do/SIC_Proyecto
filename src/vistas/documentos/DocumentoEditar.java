/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.documentos;

import com.github.lgooddatepicker.components.DatePickerSettings;

/**
 *
 * @author jajon
 */
public class DocumentoEditar extends javax.swing.JFrame {

    /**
     * Creates new form DocumentoEditar
     */
    public DocumentoEditar() {
        initComponents();
        
         DatePickerSettings dateSettingsDoc_Cambio = new DatePickerSettings();
        dateSettingsDoc_Cambio.setFormatForDatesCommonEra("yyyy-MM-dd");
        datePickerDoc_Cambio.setSettings(dateSettingsDoc_Cambio);
        
        DatePickerSettings dateSettingsReg_Cambio = new DatePickerSettings();
        dateSettingsReg_Cambio.setFormatForDatesCommonEra("yyyy-MM-dd"); 
        datePickerReg_Cambio.setSettings(dateSettingsReg_Cambio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_FechaDoc = new javax.swing.JLabel();
        lbl_FechaRes = new javax.swing.JLabel();
        txtcodigo_Cambio = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_GuardarCambios = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_ID_Cambio = new javax.swing.JLabel();
        datePickerDoc_Cambio = new com.github.lgooddatepicker.components.DatePicker();
        datePickerReg_Cambio = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Regresar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lbl_Codigo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Codigo.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lbl_Codigo.setText("Codigo:");

        lbl_FechaDoc.setBackground(new java.awt.Color(0, 0, 0));
        lbl_FechaDoc.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lbl_FechaDoc.setText("Fecha documento:");

        lbl_FechaRes.setBackground(new java.awt.Color(0, 0, 0));
        lbl_FechaRes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lbl_FechaRes.setText("Fecha del registro:");

        btn_Cancelar.setBackground(new java.awt.Color(255, 102, 51));
        btn_Cancelar.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_GuardarCambios.setBackground(new java.awt.Color(0, 204, 204));
        btn_GuardarCambios.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btn_GuardarCambios.setText("Guardar Cambios");
        btn_GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarCambiosActionPerformed(evt);
            }
        });

        lbl_id.setBackground(new java.awt.Color(0, 0, 0));
        lbl_id.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lbl_id.setText("Id:");

        lbl_ID_Cambio.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ID_Cambio.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lbl_ID_Cambio.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_GuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_FechaRes)
                            .addComponent(lbl_id))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lbl_ID_Cambio)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(datePickerReg_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Codigo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lbl_FechaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePickerDoc_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(lbl_ID_Cambio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Codigo)
                    .addComponent(txtcodigo_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaDoc)
                    .addComponent(datePickerDoc_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaRes)
                    .addComponent(datePickerReg_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        DocumentosVista ini = new DocumentosVista();
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        docu.setCodigo_doc(txtcodigo_Cambio.getText());
        docu.setFecha_doc(txtfechadoc.getText());
        docu.setFecha_registro_doc(txtfechareg_Cambio.getText());

        if(docu.insertDocumento(docu)>0){
            System.out.println("Se agrego el documento.");
        }else{
            System.out.println("No se agrego.");
        }
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarCambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(DocumentoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocumentoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocumentoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocumentoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocumentoEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_GuardarCambios;
    private static com.github.lgooddatepicker.components.DatePicker datePickerDoc_Cambio;
    private static com.github.lgooddatepicker.components.DatePicker datePickerReg_Cambio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_FechaDoc;
    private javax.swing.JLabel lbl_FechaRes;
    private javax.swing.JLabel lbl_ID_Cambio;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTextField txtcodigo_Cambio;
    // End of variables declaration//GEN-END:variables
}

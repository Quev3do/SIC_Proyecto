/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.cuentas;

import java.time.LocalDate;
import modelos.*;

import vistas.cuentas.cuentasVista;

/**
 *
 * @author Usuario
 */
public class cuentasCrear extends javax.swing.JFrame {
    users User;
    cuentas cuenta;
    /**
     * Creates new form cuentasCrear
     */
    public cuentasCrear() {
        initComponents();
    }
    
    public cuentasCrear(users us) {
        this.User = us;
        cuenta = new cuentas();
        initComponents();
        
        this.cmbtipos.addItem("activo");
        this.cmbtipos.addItem("patrimonio");
        this.cmbtipos.addItem("pasivo");
        this.cmbtipos.addItem("gastos");
        this.cmbtipos.addItem("ingresos");
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
        lblDesdeMes = new javax.swing.JLabel();
        lblDesdeMes1 = new javax.swing.JLabel();
        lblDesdeMes2 = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btncrear1 = new javax.swing.JButton();
        txtsaldo = new javax.swing.JTextField();
        txtnombrecuenta = new javax.swing.JTextField();
        cmbtipos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Regresar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lblDesdeMes.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes.setText("Tipo cuenta:");

        lblDesdeMes1.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes1.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes1.setText("Nombre cuenta:");

        lblDesdeMes2.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes2.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes2.setText("Saldo inicial(opcional):");

        btnborrar.setBackground(new java.awt.Color(255, 102, 102));
        btnborrar.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnborrar.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar.setText("Borrar todo");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btncrear1.setBackground(new java.awt.Color(0, 204, 153));
        btncrear1.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btncrear1.setForeground(new java.awt.Color(255, 255, 255));
        btncrear1.setText("Crear usuario");
        btncrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrear1ActionPerformed(evt);
            }
        });

        txtsaldo.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDesdeMes)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDesdeMes1)
                        .addComponent(lblDesdeMes2))
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncrear1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(cmbtipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsaldo)
                    .addComponent(txtnombrecuenta))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesdeMes)
                            .addComponent(cmbtipos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesdeMes1)
                            .addComponent(txtnombrecuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(lblDesdeMes2))
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncrear1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        cuentasVista ini = new cuentasVista(this.User);
        ini.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        txtnombrecuenta.setText("");

        txtsaldo.setText("0.00");

    }//GEN-LAST:event_btnborrarActionPerformed

    private void btncrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrear1ActionPerformed
        String stra = txtsaldo.getText();
        if(stra.equals("")){
            System.out.println("No puede ser vacio.");
        }else{
            String str = txtsaldo.getText();
            if(isNumericD(str)){
                cuenta.setNombre_cuenta(txtnombrecuenta.getText());
            
                Double saldo = Double.parseDouble(str);
            
                if(saldo==0.00){
                    cuenta.setSaldo(0.00);
                }else{
                    cuenta.setSaldo(saldo);
                }
            
                cuenta.setTipo_cuenta(String.valueOf(cmbtipos.getSelectedItem()));
                
                if(cuenta.insertCuenta(cuenta)>0){
                    System.out.println("Se agrego la cuenta.");
                    
                    logs log = new logs();
                    
                    log.setAccion("Crear cuenta nueva.");
                    LocalDate fecha_ahora = LocalDate.now();
        
                    log.setFecha_log(String.valueOf(fecha_ahora));
                    
                    log.setId_user(this.User.getId_user());
                    
                    if(log.insertLog(log)>0){
                        System.out.println("Se agrego el log.");
                    }else{
                        System.out.println("No se agrego el log.");
                    }
                }

            
            }else{
                System.out.println("Error, no es un numero");
            }
        }

    }//GEN-LAST:event_btncrear1ActionPerformed

    public static boolean isNumericD(String str) { 
        try {  
            Double.parseDouble(str);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
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
            java.util.logging.Logger.getLogger(cuentasCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentasCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentasCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentasCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentasCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncrear1;
    private javax.swing.JComboBox<String> cmbtipos;
    private javax.swing.JLabel lblDesdeMes;
    private javax.swing.JLabel lblDesdeMes1;
    private javax.swing.JLabel lblDesdeMes2;
    private javax.swing.JTextField txtnombrecuenta;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
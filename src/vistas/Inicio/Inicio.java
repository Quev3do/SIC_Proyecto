/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.Inicio;

/**
 *
 * @author jajon
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        Panel_Inicio = new javax.swing.JPanel();
        btnCerrar2 = new javax.swing.JButton();
        btnAgregar_Documento = new javax.swing.JButton();
        btnVer_LibroMayor = new javax.swing.JButton();
        btnAgregar_Transaccion = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btnCerrar2.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar2.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnCerrar2.setText("Cerrar");

        btnAgregar_Documento.setBackground(new java.awt.Color(255, 201, 13));
        btnAgregar_Documento.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnAgregar_Documento.setText("Agregar Documento");

        btnVer_LibroMayor.setBackground(new java.awt.Color(199, 191, 230));
        btnVer_LibroMayor.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnVer_LibroMayor.setText("Ver libro Mayor");

        btnAgregar_Transaccion.setBackground(new java.awt.Color(154, 217, 234));
        btnAgregar_Transaccion.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnAgregar_Transaccion.setText("Agregar Transaccion");

        lblUser.setBackground(new java.awt.Color(0, 0, 0));
        lblUser.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        lblUser.setText("User");

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 204, 204));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicio.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        jPanelTitulo.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 40));

        javax.swing.GroupLayout Panel_InicioLayout = new javax.swing.GroupLayout(Panel_Inicio);
        Panel_Inicio.setLayout(Panel_InicioLayout);
        Panel_InicioLayout.setHorizontalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(Panel_InicioLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Panel_InicioLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar_Transaccion)
                    .addComponent(btnAgregar_Documento)
                    .addComponent(btnVer_LibroMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_InicioLayout.setVerticalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InicioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_InicioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar2)))
                .addGap(74, 74, 74)
                .addComponent(btnAgregar_Documento)
                .addGap(35, 35, 35)
                .addComponent(btnAgregar_Transaccion)
                .addGap(36, 36, 36)
                .addComponent(btnVer_LibroMayor)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Inicio;
    private javax.swing.JButton btnAgregar_Documento;
    private javax.swing.JButton btnAgregar_Transaccion;
    private javax.swing.JButton btnCerrar2;
    private javax.swing.JButton btnVer_LibroMayor;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
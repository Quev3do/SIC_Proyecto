/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.documentos;

/**
 *
 * @author jajon
 */
public class CrearDocumento extends javax.swing.JFrame {

    /**
     * Creates new form CrearDocumento
     */
    public CrearDocumento() {
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

        Panel_CrearDocumento = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        lblFechaActual = new javax.swing.JLabel();
        lblCodigo_doc = new javax.swing.JLabel();
        lblFecha_doc = new javax.swing.JLabel();
        lblFecha_ingreso = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        boxFecha_Ingreso = new javax.swing.JComboBox<>();
        boxCodigo_Doc = new javax.swing.JComboBox<>();
        boxFecha_Doc = new javax.swing.JComboBox<>();
        jPanelTitulo = new javax.swing.JPanel();
        lblCreate_Doc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DocumentosCrear");
        setPreferredSize(new java.awt.Dimension(800, 600));

        Panel_CrearDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        Panel_CrearDocumento.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 40));

        lblFechaActual.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaActual.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblFechaActual.setText("Fecha_hoy");
        Panel_CrearDocumento.add(lblFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, 40));

        lblCodigo_doc.setBackground(new java.awt.Color(0, 0, 0));
        lblCodigo_doc.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblCodigo_doc.setText("Codigo del Doc");
        Panel_CrearDocumento.add(lblCodigo_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 40));

        lblFecha_doc.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha_doc.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblFecha_doc.setText("Fecha del Doc");
        Panel_CrearDocumento.add(lblFecha_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblFecha_ingreso.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha_ingreso.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblFecha_ingreso.setText("Fecha de Ingreso");
        Panel_CrearDocumento.add(lblFecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(37, 150, 190));
        btnIngresar.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        Panel_CrearDocumento.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 170, 50));

        boxFecha_Ingreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_CrearDocumento.add(boxFecha_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, -1));

        boxCodigo_Doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_CrearDocumento.add(boxCodigo_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));

        boxFecha_Doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_CrearDocumento.add(boxFecha_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 160, -1));

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 204, 204));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreate_Doc.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lblCreate_Doc.setForeground(new java.awt.Color(255, 255, 255));
        lblCreate_Doc.setText("Crear un Documento");
        jPanelTitulo.add(lblCreate_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 40));

        Panel_CrearDocumento.add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_CrearDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_CrearDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel Panel_CrearDocumento;
    private javax.swing.JComboBox<String> boxCodigo_Doc;
    private javax.swing.JComboBox<String> boxFecha_Doc;
    private javax.swing.JComboBox<String> boxFecha_Ingreso;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lblCodigo_doc;
    private javax.swing.JLabel lblCreate_Doc;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblFecha_doc;
    private javax.swing.JLabel lblFecha_ingreso;
    // End of variables declaration//GEN-END:variables
}

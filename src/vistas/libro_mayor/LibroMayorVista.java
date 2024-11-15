/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.libro_mayor;

/**
 *
 * @author jonat
 */
public class LibroMayorVista extends javax.swing.JFrame {

    /**
     * Creates new form LibroMayorVista
     */
    public LibroMayorVista() {
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

        Jpanel_LibroMayor = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibroMayor = new javax.swing.JTable();
        btnQuitarFiltro = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        btnAplicarFiltro = new javax.swing.JButton();
        lblHastaMes = new javax.swing.JLabel();
        lblDesdeMes = new javax.swing.JLabel();
        lblHastaAño = new javax.swing.JLabel();
        lblDesdeAño = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblDebe = new javax.swing.JLabel();
        lblHaber = new javax.swing.JLabel();
        boxHastaMes = new javax.swing.JComboBox<>();
        boxHastaAño = new javax.swing.JComboBox<>();
        boxDesdeMes = new javax.swing.JComboBox<>();
        boxDesdeAño = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libro Mayor");
        setPreferredSize(new java.awt.Dimension(800, 600));

        btnInicio.setBackground(new java.awt.Color(181, 229, 29));
        btnInicio.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");

        tblLibroMayor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descripción", "Debe", "Haber"
            }
        ));
        jScrollPane1.setViewportView(tblLibroMayor);

        btnQuitarFiltro.setBackground(new java.awt.Color(220, 101, 57));
        btnQuitarFiltro.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnQuitarFiltro.setText("Remover Filtro de Fecha");

        btnExportarExcel.setBackground(new java.awt.Color(181, 229, 29));
        btnExportarExcel.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        btnExportarExcel.setText("Excel");

        btnAplicarFiltro.setBackground(new java.awt.Color(37, 150, 190));
        btnAplicarFiltro.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        btnAplicarFiltro.setText("Aplicar Filtro de Fecha");

        lblHastaMes.setBackground(new java.awt.Color(0, 0, 0));
        lblHastaMes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHastaMes.setText("Hasta Mes");

        lblDesdeMes.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeMes.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeMes.setText("Desde Mes");

        lblHastaAño.setBackground(new java.awt.Color(0, 0, 0));
        lblHastaAño.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHastaAño.setText("Hasta Año");

        lblDesdeAño.setBackground(new java.awt.Color(0, 0, 0));
        lblDesdeAño.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDesdeAño.setText("Desde Año");

        lblBalance.setBackground(new java.awt.Color(0, 0, 0));
        lblBalance.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblBalance.setText("Balance:");

        lblDebe.setBackground(new java.awt.Color(0, 0, 0));
        lblDebe.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblDebe.setText("B_debe");

        lblHaber.setBackground(new java.awt.Color(0, 0, 0));
        lblHaber.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        lblHaber.setText("B_haber");

        boxHastaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxHastaAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxDesdeMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxDesdeAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Jpanel_LibroMayorLayout = new javax.swing.GroupLayout(Jpanel_LibroMayor);
        Jpanel_LibroMayor.setLayout(Jpanel_LibroMayorLayout);
        Jpanel_LibroMayorLayout.setHorizontalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addComponent(lblBalance)
                        .addGap(131, 131, 131)
                        .addComponent(lblDebe)
                        .addGap(55, 55, 55)
                        .addComponent(lblHaber)))
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHastaMes)
                                .addComponent(lblDesdeAño)
                                .addComponent(lblHastaAño))
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addComponent(lblDesdeMes)
                                .addGap(3, 3, 3)))
                        .addGap(32, 32, 32)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxHastaMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxDesdeMes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxDesdeAño, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxHastaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuitarFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExportarExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        Jpanel_LibroMayorLayout.setVerticalGroup(
            Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDesdeMes)
                                    .addComponent(boxDesdeMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHastaMes)
                                    .addComponent(boxHastaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDesdeAño)
                                    .addComponent(boxDesdeAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHastaAño)
                                    .addComponent(boxHastaAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Jpanel_LibroMayorLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(Jpanel_LibroMayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHaber)
                                    .addComponent(lblDebe)
                                    .addComponent(lblBalance))))
                        .addGap(27, 27, 27))))
        );

        getContentPane().add(Jpanel_LibroMayor, java.awt.BorderLayout.CENTER);

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
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibroMayorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JComboBox<String> boxDesdeAño;
    private javax.swing.JComboBox<String> boxDesdeMes;
    private javax.swing.JComboBox<String> boxHastaAño;
    private javax.swing.JComboBox<String> boxHastaMes;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnQuitarFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDebe;
    private javax.swing.JLabel lblDesdeAño;
    private javax.swing.JLabel lblDesdeMes;
    private javax.swing.JLabel lblHaber;
    private javax.swing.JLabel lblHastaAño;
    private javax.swing.JLabel lblHastaMes;
    private javax.swing.JTable tblLibroMayor;
    // End of variables declaration//GEN-END:variables
}   

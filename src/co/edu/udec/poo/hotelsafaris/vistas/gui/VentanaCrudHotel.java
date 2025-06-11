
package co.edu.udec.poo.hotelsafaris.vistas.gui;

public class VentanaCrudHotel extends javax.swing.JDialog {


    public VentanaCrudHotel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

   
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        JLImagen = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jSCategoria = new javax.swing.JSpinner();
        jTDireccion = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jCDirector = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Crud Hotel");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(740, 400));
        setMinimumSize(new java.awt.Dimension(740, 400));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(740, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Hotel");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 24, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/hotel256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos del Hotel", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCodigo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPDatos.add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 165, 23));

        jTNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jPDatos.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 165, 23));

        jSCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPDatos.add(jSCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 45, 23));

        jTDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPDatos.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 165, 23));

        jTTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPDatos.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 165, 23));

        jCDirector.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCDirector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPDatos.add(jCDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 165, 23));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Código:");
        jPDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 23));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");
        jPDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 23));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Categoria:");
        jPDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 23));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección:");
        jPDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 23));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono:");
        jPDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 23));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Director:");
        jPDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 23));

        getContentPane().add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 61, 410, 230));

        jBAgregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 80, 40));

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 80, 40));

        jBEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 80, 40));

        jBEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 80, 40));

        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrudHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCrudHotel dialog = new VentanaCrudHotel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLImagen;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCDirector;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JSpinner jSCategoria;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}

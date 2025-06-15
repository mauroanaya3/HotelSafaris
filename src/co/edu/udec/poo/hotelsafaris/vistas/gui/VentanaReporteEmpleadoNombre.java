package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.ClienteCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.EmpleadoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Cliente;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauro
 */
public class VentanaReporteEmpleadoNombre extends javax.swing.JDialog {


    public VentanaReporteEmpleadoNombre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buscarPorNombre("");
    }

    private void buscarPorNombre(String nombre) {
        DefaultTableModel modelo = (DefaultTableModel) jTablaEmpleado.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        try {
            for (Empleado e : EmpleadoCrud.buscarPorNombre(nombre)) {
                Object[] fila = {
                    e.getDni(),
                    e.getNombre(),
                    e.getDireccion(),
                    e.getTelefono(),
                    e.getNivelEducativo(),
                    e.getTipo(),
                    e.getHotel().getNombre()
                };
                modelo.addRow(fila);
            }

            jLTotal.setText(String.valueOf(modelo.getRowCount()));

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), 
                    "Sin resultados", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEmpleado = new javax.swing.JTable();
        JLImagen = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Hoteles");
        setModal(true);
        setResizable(false);
        setSize(new java.awt.Dimension(981, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Reporte Empleados");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 390, -1));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Resultado de la busqueda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaEmpleado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Direccion", "Telefono", "Nivel Edu.", "Tipo", "Hotel"
            }
        ));
        jTablaEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTablaEmpleado.setEnabled(false);
        jTablaEmpleado.setSelectionBackground(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(jTablaEmpleado);

        jPDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 810, 270));

        getContentPane().add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 830, 310));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reportehotel128.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 140));

        jLTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLTotal.setText("0");
        getContentPane().add(jLTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 40, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Total:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jTBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 170, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Buscar por nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 25, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTablaEmpleado.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTablaEmpleado.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTablaEmpleado.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablaEmpleado.getColumnModel().getColumn(3).setPreferredWidth(35);
        jTablaEmpleado.getColumnModel().getColumn(4).setPreferredWidth(35);
        jTablaEmpleado.getColumnModel().getColumn(5).setPreferredWidth(35);
        jTablaEmpleado.getColumnModel().getColumn(6).setPreferredWidth(35);

    }//GEN-LAST:event_formWindowOpened

    private void jTBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarKeyReleased
        buscarPorNombre(jTBuscar.getText());
    }//GEN-LAST:event_jTBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(VentanaReporteEmpleadoNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteEmpleadoNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteEmpleadoNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteEmpleadoNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaReporteEmpleadoNombre dialog = new VentanaReporteEmpleadoNombre(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscar;
    private javax.swing.JTable jTablaEmpleado;
    // End of variables declaration//GEN-END:variables
}

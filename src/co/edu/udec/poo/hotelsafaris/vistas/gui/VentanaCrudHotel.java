package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.EmpleadoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HotelCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaCrudHotel extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudHotel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDirectores();

    }

    // setter para aplicar la configuracion de botones
    public void setAccion(String accion) {
        this.accion = accion;
        habilitarBotones(accion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        JLImagen = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jCDirector = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCCategoria = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Hoteles");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(740, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Hotel");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/hotel256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos del Hotel", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCodigo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTCodigo.setPreferredSize(new java.awt.Dimension(165, 23));
        jTCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodigoKeyTyped(evt);
            }
        });
        jPDatos.add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 30, -1, -1));

        jTNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTNombre.setPreferredSize(new java.awt.Dimension(165, 23));
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jPDatos.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 60, -1, -1));

        jTDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTDireccion.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 120, -1, -1));

        jTTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTTelefono.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 150, -1, -1));

        jCDirector.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCDirector.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jCDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 180, -1, -1));

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

        jCCategoria.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jCCategoria.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jCCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 90, 50, -1));

        getContentPane().add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 410, 230));

        jBAgregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setEnabled(false);
        jBAgregar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 80, 40));

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 80, 40));

        jBEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 80, 40));

        jBEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 80, 40));

        jBLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add yodur handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    // Boton Limpiar
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTCodigo.setText("");
        jTNombre.setText("");
        if (jCCategoria.getItemCount() > 0) {
            jCCategoria.setSelectedIndex(0);
        }
        jTDireccion.setText("");
        jTTelefono.setText("");
        if (jCDirector.getItemCount() > 0) {
            jCDirector.setSelectedIndex(0);
        }

        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // Traer valores ingresados
        String strCodigo = jTCodigo.getText().trim();
        String nombre = jTNombre.getText().trim();
        String categoria = (String) jCCategoria.getSelectedItem();
        String direccion = jTDireccion.getText().trim();
        String telefono = jTTelefono.getText().trim();
        Empleado director = (Empleado) jCDirector.getSelectedItem();

        // Validaciones
        if (strCodigo.isEmpty() || nombre.isEmpty() || direccion.isEmpty()
                || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, complete todos los campos obligatorios.",
                    "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int codigo;
        try {
            codigo = Integer.parseInt(strCodigo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "El código debe ser un número entero.", "Formato inválido",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!telefono.matches("\\d{7,}")) {
            JOptionPane.showMessageDialog(
                    this,
                    "El teléfono debe contener solo números y tener al menos 7 dígitos.",
                    "Teléfono inválido",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Mostrar confirmación solo si todo es válido
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea guardar esta información?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == JOptionPane.NO_OPTION) {
            return; // Cancelado por el usuario
        }

        // Crear objeto
        Hotel h = new Hotel();
        h.setCodigo(codigo);
        h.setNombre(nombre);
        h.setCategoria(categoria);
        h.setDireccion(direccion);
        h.setTelefono(telefono);
        h.setDirector(director);

        // guardar el objeto en mi array
        try {
            HotelCrud.agregar(h);
            JOptionPane.showMessageDialog(this,
                    "Registro guardado existosamente.", "Exito",
                    JOptionPane.INFORMATION_MESSAGE);
            // Limpiar formulario
            jBLimpiarActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al guardar el hotel: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    // Validar caracteres al digitar en jTNombre
    private void jTCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodigoKeyTyped
        int tecla = evt.getKeyChar();

        boolean numero = tecla >= 48 && tecla <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTCodigoKeyTyped

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // Valor buscado
        String codigoTexto = jTCodigo.getText().trim();

        // Validar campo vacio
        if (codigoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // convertir codigo a int
        int codigo;
        codigo = Integer.parseInt(codigoTexto);

        try {
            // realizar la busqueda
            Hotel hotel = HotelCrud.buscar(codigo);

            jTNombre.setText(hotel.getNombre());
            jTDireccion.setText(hotel.getDireccion());
            jTTelefono.setText(hotel.getTelefono());
            jCCategoria.setSelectedItem(hotel.getCategoria());
            // Seleccionar el director
            if (hotel.getDirector() != null) {
                jCDirector.setSelectedItem(hotel.getDirector());
            } else {
                jCDirector.setSelectedIndex(-1); // o dejar sin selección
            }

            // habilitar bonotes
            habilitarBotones(accion);
            //jBEliminar.setEnabled(true);

        } catch (Exception ex) {
            // si no hay resultados
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "No encontrado", JOptionPane.INFORMATION_MESSAGE);

            jTNombre.setText("");
            jTDireccion.setText("");
            jTTelefono.setText("");
            jCCategoria.setSelectedItem(0);
            jCDirector.setSelectedItem(0);

            habilitarBotones("buscar");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea modificar?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmar != JOptionPane.YES_OPTION) {
            return; // Cancelado
        }

        // Traer valores ingresados
        String strCodigo = jTCodigo.getText().trim();
        String nombre = jTNombre.getText().trim();
        String categoria = (String) jCCategoria.getSelectedItem();
        String direccion = jTDireccion.getText().trim();
        String telefono = jTTelefono.getText().trim();
        Empleado director = (Empleado) jCDirector.getSelectedItem();

        // Validaciones
        if (strCodigo.isEmpty() || nombre.isEmpty() || direccion.isEmpty()
                || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, complete todos los campos obligatorios.",
                    "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // guardar el codigo del hotel a modificar
            int codigo = Integer.parseInt(jTCodigo.getText().trim());

            // busco el hotel
            Hotel hotel = HotelCrud.buscar(codigo);

            hotel.setNombre(nombre);
            hotel.setCategoria(categoria);
            hotel.setDireccion(direccion);
            hotel.setTelefono(telefono);
            hotel.setDirector(director);

            JOptionPane.showMessageDialog(this,
                    "Los cambios se han guardado exitosamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al editar el hotel: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmar != JOptionPane.YES_OPTION) {
            return; // Cancelado
        }

        // Valor buscado
        String codigoTexto = jTCodigo.getText().trim();

        // Validar campo vacio
        if (codigoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // guardar el codigo del hotel a modificar
            int codigo = Integer.parseInt(jTCodigo.getText().trim());

            // busco el hotel
            // Hotel hotel = HotelCrud.buscar(codigo);
            HotelCrud.eliminar(codigo);

            JOptionPane.showMessageDialog(this,
                    "El hotel fue eliminado exitosamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar el hotel: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    // Listar empleados e insertarlos en jCDirector
    private void cargarDirectores() {
        try {
            ArrayList<Empleado> empleados = EmpleadoCrud.listarTodo();

            for (Empleado e : empleados) {
                if (e.getTipo().equalsIgnoreCase("Director")) {
                    jCDirector.addItem(e);
                }
            }

        } catch (Exception ex) {
            /*JOptionPane.showMessageDialog(this, "Error al cargar directores: "
                    + ex.getMessage());*/
        }
    }

    // Habilitar botones segun la accion
    private void habilitarBotones(String accion) {
        switch (accion.toLowerCase()) {
            case "agregar":
                jBAgregar.setEnabled(true);
                jBBuscar.setEnabled(false);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);
                jTNombre.setEnabled(true);
                jTDireccion.setEnabled(true);
                jTTelefono.setEnabled(true);
                jCCategoria.setEnabled(true);
                jCDirector.setEnabled(true);
                break;
            case "editar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(true);
                jBEliminar.setEnabled(false);
                jTNombre.setEnabled(true);
                jTDireccion.setEnabled(true);
                jTTelefono.setEnabled(true);
                jCCategoria.setEnabled(true);
                jCDirector.setEnabled(true);
                break;
            case "eliminar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(true);
                jTNombre.setEnabled(false);
                jTDireccion.setEnabled(false);
                jTTelefono.setEnabled(false);
                jCCategoria.setEnabled(false);
                jCDirector.setEnabled(false);
                break;
            default:
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);
                jTNombre.setEnabled(false);
                jTDireccion.setEnabled(false);
                jTTelefono.setEnabled(false);
                jCCategoria.setEnabled(false);
                jCDirector.setEnabled(false);
        }
    }

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
            @Override
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
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JComboBox<Empleado> jCDirector;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables

}

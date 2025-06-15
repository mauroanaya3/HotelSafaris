package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.EmpleadoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HotelCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaCrudEmpleado extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarHoteles();

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
        jTDni = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jCTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCNivelEducativo = new javax.swing.JComboBox<>();
        jCHotel = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Empleados");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(780, 400));
        setMinimumSize(new java.awt.Dimension(780, 400));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(780, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Empleado");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/empleado256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos del Empleado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTDni.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTDni.setPreferredSize(new java.awt.Dimension(165, 23));
        jTDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDniKeyTyped(evt);
            }
        });
        jPDatos.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 30, -1, -1));

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
        jPDatos.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 90, -1, -1));

        jTTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTTelefono.setMaximumSize(new java.awt.Dimension(165, 23));
        jTTelefono.setMinimumSize(new java.awt.Dimension(165, 23));
        jTTelefono.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 120, -1, -1));

        jCTipo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Animador", "Director", "Gestión", "Limpieza" }));
        jCTipo.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jCTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DNI:");
        jPDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 23));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");
        jPDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 23));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Niel Educativo:");
        jPDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 23));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección:");
        jPDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 23));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono:");
        jPDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 23));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tipo:");
        jPDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 23));

        jCNivelEducativo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCNivelEducativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Básica primaria", "Secundaria", "Técnico", "Tecnólogo", "Profesional", "Especialización", "Maestría", "Doctorado" }));
        jCNivelEducativo.setMaximumSize(new java.awt.Dimension(165, 23));
        jCNivelEducativo.setMinimumSize(new java.awt.Dimension(165, 23));
        jCNivelEducativo.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jCNivelEducativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 150, 165, 23));

        jCHotel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCHotel.setPreferredSize(new java.awt.Dimension(165, 23));
        jPDatos.add(jCHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Hotel:");
        jPDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 23));

        getContentPane().add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 410, 250));

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
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 80, 40));

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 80, 40));

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
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 40));

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
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 80, 40));

        jBLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add yodur handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    // Boton Limpiar
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTDni.setText("");
        jTNombre.setText("");
        if (jCNivelEducativo.getItemCount() > 0) {
            jCNivelEducativo.setSelectedIndex(0);
        }
        jTDireccion.setText("");
        jTTelefono.setText("");
        if (jCTipo.getItemCount() > 0) {
            jCTipo.setSelectedIndex(0);
        }
        if (jCHotel.getItemCount() > 0) {
            jCHotel.setSelectedIndex(0);
        }
        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // Traer valores ingresados
        String dni = jTDni.getText().trim();
        String nombre = jTNombre.getText().trim();
        String direccion = jTDireccion.getText().trim();
        String telefono = jTTelefono.getText().trim();
        String nivelEducativo = (String) jCNivelEducativo.getSelectedItem();
        String tipo = (String) jCTipo.getSelectedItem();
        Hotel hotel = (Hotel) jCHotel.getSelectedItem();

        // Validaciones
        if (dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || hotel == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.");
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
        Empleado nuevoEmpleado = new Empleado(
                dni,
                nombre,
                direccion,
                telefono,
                nivelEducativo,
                tipo,
                hotel);

        // guardar el objeto en el array
        try {
            EmpleadoCrud.agregar(nuevoEmpleado);
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
    private void jTDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDniKeyTyped
        int tecla = evt.getKeyChar();

        boolean numero = tecla >= 48 && tecla <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTDniKeyTyped

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
        String dni = jTDni.getText().trim();
        String nombre = jTNombre.getText().trim();
        String direccion = jTDireccion.getText().trim();
        String telefono = jTTelefono.getText().trim();
        String nivelEducativo = (String) jCNivelEducativo.getSelectedItem();
        String tipo = (String) jCTipo.getSelectedItem();
        Hotel hotel = (Hotel) jCHotel.getSelectedItem();

        // Validaciones
        if (dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty()
                || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, complete todos los campos obligatorios.",
                    "Campos incompletos", JOptionPane.WARNING_MESSAGE);
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

        try {
            Empleado empleado = EmpleadoCrud.buscar(dni);

            empleado.setNombre(nombre);
            empleado.setDireccion(direccion);
            empleado.setTelefono(telefono);
            empleado.setNivelEducativo(nivelEducativo);
            empleado.setTipo(tipo);
            empleado.setHotel(hotel);
            
            

            JOptionPane.showMessageDialog(this,
                    "Los cambios se han guardado exitosamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al editar el cliente: " + ex.getMessage(),
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
        String codigo = jTDni.getText().trim();

        // Validar campo vacio
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            EmpleadoCrud.eliminar(codigo);

            JOptionPane.showMessageDialog(this,
                    "El empleado fue eliminado exitosamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar el empleado: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // Valor buscado
        String codigo = jTDni.getText().trim();

        // Validar campo vacio
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // realizar la busqueda
            Empleado empleado = EmpleadoCrud.buscar(codigo);
        
            jTNombre.setText(empleado.getNombre());
            jTDireccion.setText(empleado.getDireccion());
            jTTelefono.setText(empleado.getTelefono());
            jCNivelEducativo.setSelectedItem(empleado.getNivelEducativo());
            jCTipo.setSelectedItem(empleado.getTipo());
            jCHotel.setSelectedItem(empleado.getHotel());
            

            // habilitar bonotes
            habilitarBotones(accion);

        } catch (Exception ex) {
            // si no hay resultados
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "No encontrado", JOptionPane.INFORMATION_MESSAGE);

            jTNombre.setText("");
            jTDireccion.setText("");
            jTTelefono.setText("");

            habilitarBotones(accion);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    // Listar hoteles e insertarlos en jCHotel
    private void cargarHoteles() {
        try {
            ArrayList<Hotel> hoteles = HotelCrud.listarTodo();

            // Limpiar elementos existentes
            jCHotel.removeAllItems();

            // Agregar los hoteles al combo
            for (Hotel h : hoteles) {
                jCHotel.addItem(h);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar hoteles: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
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
                jCNivelEducativo.setEnabled(true);
                jCHotel.setEnabled(true);
                jCTipo.setEnabled(true);
                break;
            case "editar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(true);
                jBEliminar.setEnabled(false);
                jTNombre.setEnabled(true);
                jTDireccion.setEnabled(true);
                jTTelefono.setEnabled(true);
                jCNivelEducativo.setEnabled(true);
                jCHotel.setEnabled(true);
                jCTipo.setEnabled(true);
                break;
            case "eliminar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(true);
                jTNombre.setEnabled(false);
                jTDireccion.setEnabled(false);
                jTTelefono.setEnabled(false);
                jCNivelEducativo.setEnabled(false);
                jCHotel.setEnabled(false);
                jCTipo.setEnabled(false);
                break;
            default:
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);
                jTNombre.setEnabled(false);
                jTDireccion.setEnabled(false);
                jTTelefono.setEnabled(false);
                jCNivelEducativo.setEnabled(false);
                jCHotel.setEnabled(false);
                jCTipo.setEnabled(false);
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
            java.util.logging.Logger.getLogger(VentanaCrudEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaCrudEmpleado dialog = new VentanaCrudEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Hotel> jCHotel;
    private javax.swing.JComboBox<String> jCNivelEducativo;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables

}

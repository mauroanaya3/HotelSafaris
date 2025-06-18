package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.ActividadCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.EmpleadoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Actividad;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class VentanaCrudActividad extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudActividad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatosIniciales();

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
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cmbAnimador = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jRDisponible = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRGratuito = new javax.swing.JRadioButton();
        jRPago = new javax.swing.JRadioButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDias = new javax.swing.JList<>();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Habitaciones");
        setMinimumSize(new java.awt.Dimension(780, 400));
        setModal(true);
        setResizable(false);
        setSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Actividad");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/actividad256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos de la Actividad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(165, 23));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Código:");

        cmbAnimador.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cmbAnimador.setPreferredSize(new java.awt.Dimension(165, 23));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Animador:");

        jRDisponible.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRDisponible.setText("¿Disponible?");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Nombre:");

        txtNombre.setPreferredSize(new java.awt.Dimension(165, 23));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Horario");

        txtHorario.setPreferredSize(new java.awt.Dimension(165, 23));
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Dia:");

        jRGratuito.setText("¿Gratuito?");
        jRGratuito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRGratuitoActionPerformed(evt);
            }
        });

        jRPago.setText("¿Pagado?");
        jRPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRPagoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPrecio.setPreferredSize(new java.awt.Dimension(165, 23));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Precio: $");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Descripción:");

        lstDias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstDias);

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatosLayout.createSequentialGroup()
                                        .addComponent(jRGratuito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRPago, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPDatosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDatosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDatosLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbAnimador, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRDisponible)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAnimador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRGratuito)
                            .addComponent(jRPago))
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 490, 360));

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
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 80, 40));

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 80, 40));

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
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 80, 40));

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
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 80, 40));

        jBLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Limpiar
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtHorario.setText("");
        txtPrecio.setText("");
        
        lstDias.clearSelection();

        jRGratuito.setSelected(true);
        txtPrecio.setEnabled(false);
        cmbAnimador.setSelectedIndex(-1);
        jRDisponible.setSelected(false);

        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (!validarCampos()) {
            return;
        }

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String nombre = txtNombre.getText().trim();
            String descripcion = txtDescripcion.getText().trim();
            String horario = txtHorario.getText().trim();
            List<String> diasSemana = lstDias.getSelectedValuesList();
            boolean gratuito = jRGratuito.isSelected();
            double precio = gratuito ? 0.0 : Double.parseDouble(txtPrecio.getText().trim());
            Empleado animador = (Empleado) cmbAnimador.getSelectedItem();
            boolean disponible = jRDisponible.isSelected();

            Actividad nueva = new Actividad(codigo, nombre, descripcion, horario,
                    diasSemana, gratuito, precio, animador);

            ActividadCrud.agregar(nueva);
            JOptionPane.showMessageDialog(this, "Actividad agregada exitosamente!\n"
                    + "Costo para clientes: $" + nueva.calcularCostoCliente(),
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    // Validar caracteres al digitar en jTNombre
    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea modificar esta actividad?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String nombre = txtNombre.getText().trim();
            String descripcion = txtDescripcion.getText().trim();
            String horario = txtHorario.getText().trim();
            List<String> diasSemana = lstDias.getSelectedValuesList();
            boolean gratuito = jRGratuito.isSelected();
            double precio = gratuito ? 0.0 : Double.parseDouble(txtPrecio.getText().trim());
            Empleado animador = (Empleado) cmbAnimador.getSelectedItem();
            boolean disponible = jRDisponible.isSelected();

            Actividad actividad = new Actividad(codigo, nombre, descripcion, horario,
                    diasSemana, gratuito, precio, animador);

            ActividadCrud.editar(actividad);
            JOptionPane.showMessageDialog(this, "Actividad actualizada exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al editar actividad: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String texto = txtCodigo.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código de la actividad.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar esta actividad?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int codigo = Integer.parseInt(texto);
            ActividadCrud.eliminar(codigo);
            JOptionPane.showMessageDialog(this, "Actividad eliminada correctamente.");
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar actividad: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un código para buscar",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            Actividad encontrada = ActividadCrud.buscar(codigo);

            // Mostrar datos en la interfaz
            txtNombre.setText(encontrada.getNombre());
            txtDescripcion.setText(encontrada.getDescripcion());
            txtHorario.setText(encontrada.getHorario());

            // Configurar radio buttons
            if (encontrada.isGratuito()) {
                jRGratuito.setSelected(true);
                txtPrecio.setText("");
                txtPrecio.setEnabled(false);
            } else {
                jRPago.setSelected(true);
                txtPrecio.setText(String.valueOf(encontrada.getPrecio()));
                txtPrecio.setEnabled(true);
            }

            // Seleccionar animador
            cmbAnimador.setSelectedItem(encontrada.getAnimador());

            // Habilitar botones de edición/eliminación
            jBEditar.setEnabled(true);
            jBEliminar.setEnabled(true);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser numérico",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "No encontrado", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void jRGratuitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRGratuitoActionPerformed
        txtPrecio.setEnabled(false);
        txtPrecio.setText("");
    }//GEN-LAST:event_jRGratuitoActionPerformed

    private void jRPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRPagoActionPerformed
        txtPrecio.setEnabled(true);
    }//GEN-LAST:event_jRPagoActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    // Listar hoteles e insertarlos
    private boolean validarCampos() {
        if (txtCodigo.getText().trim().isEmpty()
                || txtNombre.getText().trim().isEmpty()
                || txtHorario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Los campos Código, Nombre y Horario son obligatorios",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que si no es gratuito, tenga precio
        if (!jRGratuito.isSelected() && txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar un precio para actividades no gratuitas",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtHorario.setText("");
        
        lstDias.clearSelection();
        
        jRGratuito.setSelected(true);
        txtPrecio.setText("");
        txtPrecio.setEnabled(false);
        cmbAnimador.setSelectedIndex(-1);

        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }

    // Habilitar botones según la acción
    private void habilitarBotones(String accion) {
        switch (accion.toLowerCase()) {
            case "agregar":
                jBAgregar.setEnabled(true);
                jBBuscar.setEnabled(false);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                txtCodigo.setEnabled(true);
                txtNombre.setEnabled(true);
                jRDisponible.setEnabled(true);
                txtDescripcion.setEnabled(true);
                cmbAnimador.setEnabled(true);
                txtHorario.setEnabled(true);
                jRGratuito.setEnabled(true);
                jRPago.setEnabled(true);
                lstDias.setEnabled(true);
                                
                break;

            case "editar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(true);
                jBEliminar.setEnabled(false);

                txtCodigo.setEnabled(true);
                txtNombre.setEnabled(true);
                jRDisponible.setEnabled(true);
                txtDescripcion.setEnabled(true);
                cmbAnimador.setEnabled(true);
                txtHorario.setEnabled(true);
                jRGratuito.setEnabled(true);
                jRPago.setEnabled(true);
                lstDias.setEnabled(true);
                break;

            case "eliminar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(true);

                txtCodigo.setEnabled(true);
                txtNombre.setEnabled(false);
                jRDisponible.setEnabled(false);
                txtDescripcion.setEnabled(false);
                cmbAnimador.setEnabled(false);
                txtHorario.setEnabled(false);
                jRGratuito.setEnabled(false);
                jRPago.setEnabled(false);
                lstDias.setEnabled(false);
                break;

            default:
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                txtCodigo.setEnabled(false);
                txtNombre.setEnabled(false);
                jRDisponible.setEnabled(false);
                txtDescripcion.setEnabled(false);
                cmbAnimador.setEnabled(false);
                txtHorario.setEnabled(false);
                jRGratuito.setEnabled(false);
                jRPago.setEnabled(false);
                lstDias.setEnabled(false);
                break;
        }
    }

    private void cargarDatosIniciales() {
        try {
            // Cargar animadores disponibles
            ArrayList<Empleado> animadores = EmpleadoCrud.listarTodo();
            cmbAnimador.removeAllItems();
            for (Empleado e : animadores) {
                cmbAnimador.addItem(e);
            }


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar datos iniciales: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(VentanaCrudActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                VentanaCrudActividad dialog = new VentanaCrudActividad(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Empleado> cmbAnimador;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JRadioButton jRDisponible;
    private javax.swing.JRadioButton jRGratuito;
    private javax.swing.JRadioButton jRPago;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lstDias;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}

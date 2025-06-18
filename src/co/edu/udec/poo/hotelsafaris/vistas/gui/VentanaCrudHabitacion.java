package co.edu.udec.poo.hotelsafaris.vistas.gui;


import co.edu.udec.poo.hotelsafaris.modelo.crud.HabitacionCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HotelCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.SuplementoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Habitacion;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Suplemento;
import java.util.*;
import javax.swing.JOptionPane;

public class VentanaCrudHabitacion extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudHabitacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarHoteles();
        cargarSuplementos();

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
        txtId = new javax.swing.JTextField();
        cmbHotel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSuplementos = new javax.swing.JList<>();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jRDisponible = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JFormattedTextField();
        txtPrecioBase = new javax.swing.JFormattedTextField();
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
        jLTitulo.setText("Formulario Habitación");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/habitaciion256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos de la Habitación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        txtId.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(165, 23));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        cmbHotel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cmbHotel.setPreferredSize(new java.awt.Dimension(165, 23));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Suplementos:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Hotel:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Numero:");

        jScrollPane2.setViewportView(lstSuplementos);

        cmbTipo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Suite" }));
        cmbTipo.setPreferredSize(new java.awt.Dimension(165, 23));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Tipo:");

        jRDisponible.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRDisponible.setText("¿Disponible?");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Precio Base:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Precio Total:");

        txtPrecioTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtPrecioTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecioTotal.setPreferredSize(new java.awt.Dimension(163, 23));

        txtPrecioBase.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtPrecioBase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecioBase.setPreferredSize(new java.awt.Dimension(163, 23));

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 268, Short.MAX_VALUE))))
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRDisponible)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
         txtId.setText("");
        txtPrecioBase.setText("");
        txtPrecioTotal.setText("");
        cmbTipo.setSelectedIndex(0);

        if (cmbHotel.getItemCount() > 0) {
            cmbHotel.setSelectedIndex(0);
        }

        lstSuplementos.clearSelection();
        jRDisponible.setSelected(false);

        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        try {
            int numero = Integer.parseInt(txtId.getText().trim());
            String tipo = (String) cmbTipo.getSelectedItem();
            boolean disponible = jRDisponible.isSelected();
            double precioBase = Double.parseDouble(txtPrecioBase.getText().trim());
            Hotel hotel = (Hotel) cmbHotel.getSelectedItem();

            Habitacion h = new Habitacion(numero, tipo, disponible, precioBase, hotel);

            for (Suplemento s : lstSuplementos.getSelectedValuesList()) {
                h.agregarSuplemento(s);
            }

            HabitacionCrud.agregar(h);

            txtPrecioTotal.setText(String.valueOf(h.calcularPrecioTotal()));

            JOptionPane.showMessageDialog(this, "Habitación agregada correctamente.");
            jBLimpiarActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar habitación: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    // Validar caracteres al digitar en jTNombre
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int tecla = evt.getKeyChar();

        boolean numero = tecla >= 48 && tecla <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

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

        try {
            int numero = Integer.parseInt(txtId.getText().trim());
            String tipo = (String) cmbTipo.getSelectedItem();
            boolean disponible = jRDisponible.isSelected();
            double precioBase = Double.parseDouble(txtPrecioBase.getText().trim());
            Hotel hotel = (Hotel) cmbHotel.getSelectedItem();

            Habitacion h = new Habitacion(numero, tipo, disponible, precioBase, hotel);

            for (Suplemento s : lstSuplementos.getSelectedValuesList()) {
                h.agregarSuplemento(s);
            }

            HabitacionCrud.editar(h);
            txtPrecioTotal.setText(String.valueOf(h.calcularPrecioTotal()));

            JOptionPane.showMessageDialog(this, "Habitación actualizada correctamente.");
            jBLimpiarActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al editar habitación: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String texto = txtId.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de habitación.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar esta habitación?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int numero = Integer.parseInt(texto);
            HabitacionCrud.eliminar(numero);
            JOptionPane.showMessageDialog(this, "Habitación eliminada correctamente.");
            jBLimpiarActionPerformed(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar habitación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String texto = txtId.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de habitación.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int numero = Integer.parseInt(texto);
            Habitacion h = HabitacionCrud.buscar(numero);

            cmbTipo.setSelectedItem(h.getTipo());
            jRDisponible.setSelected(h.isDisponible());
            txtPrecioBase.setText(String.valueOf(h.getPrecioBase()));
            txtPrecioTotal.setText(String.valueOf(h.calcularPrecioTotal()));
            cmbHotel.setSelectedItem(h.getHotel());

            // Seleccionar suplementos correspondientes
            lstSuplementos.clearSelection();
            List<Suplemento> seleccionados = h.getSuplementos();
            int[] indices = lstSuplementos.getSelectedIndices();
            for (int i = 0; i < lstSuplementos.getModel().getSize(); i++) {
                Suplemento s = lstSuplementos.getModel().getElementAt(i);
                if (seleccionados.contains(s)) {
                    lstSuplementos.addSelectionInterval(i, i);
                }
            }

            habilitarBotones("editar");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Habitación no encontrada: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    // Listar hoteles e insertarlos
    private void cargarHoteles() {
        try {
            ArrayList<Hotel> hoteles = HotelCrud.listarTodo();

            // Limpiar elementos existentes
            cmbHotel.removeAllItems();

            // Agregar los hoteles al combo
            for (Hotel h : hoteles) {
                cmbHotel.addItem(h);
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

    private void cargarSuplementos() {
        try {
            lstSuplementos.setListData(SuplementoCrud.listarTodo().toArray(new Suplemento[0]));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar suplementos: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Habilitar botones según la acción
    private void habilitarBotones(String accion) {
        switch (accion.toLowerCase()) {
            case "agregar":
                jBAgregar.setEnabled(true);
                jBBuscar.setEnabled(false);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                txtId.setEnabled(true);
                txtPrecioBase.setEnabled(true);
                txtPrecioTotal.setEnabled(false); // se calcula automáticamente
                cmbHotel.setEnabled(true);
                cmbTipo.setEnabled(true);
                jRDisponible.setEnabled(true);
                lstSuplementos.setEnabled(true);
                break;

            case "editar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(true);
                jBEliminar.setEnabled(false);

                txtId.setEnabled(false); // para evitar cambiar el número único
                txtPrecioBase.setEnabled(true);
                txtPrecioTotal.setEnabled(false);
                cmbHotel.setEnabled(true);
                cmbTipo.setEnabled(true);
                jRDisponible.setEnabled(true);
                lstSuplementos.setEnabled(true);
                break;

            case "eliminar":
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(true);

                txtId.setEnabled(true);
                txtPrecioBase.setEnabled(false);
                txtPrecioTotal.setEnabled(false);
                cmbHotel.setEnabled(false);
                cmbTipo.setEnabled(false);
                jRDisponible.setEnabled(false);
                lstSuplementos.setEnabled(false);
                break;

            default:
                jBAgregar.setEnabled(false);
                jBBuscar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                txtId.setEnabled(true);
                txtPrecioBase.setEnabled(false);
                txtPrecioTotal.setEnabled(false);
                cmbHotel.setEnabled(false);
                cmbTipo.setEnabled(false);
                jRDisponible.setEnabled(false);
                lstSuplementos.setEnabled(false);
                break;
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
            java.util.logging.Logger.getLogger(VentanaCrudHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                VentanaCrudHabitacion dialog = new VentanaCrudHabitacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Hotel> cmbHotel;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JRadioButton jRDisponible;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Suplemento> lstSuplementos;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtPrecioBase;
    private javax.swing.JFormattedTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables

}

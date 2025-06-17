package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.ClienteCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HabitacionCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HotelCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.ReservaCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Cliente;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Habitacion;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaCrudReserva extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarReservas();

        // Configurar listeners
        cmbHotel.addActionListener(e -> {
            Hotel hotelSeleccionado = (Hotel) cmbHotel.getSelectedItem();
            cargarHabitacionesDisponibles(hotelSeleccionado);
        });

        // Cargar datos iniciales
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
        txtId = new javax.swing.JTextField();
        cmbHotel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstHabitaciones = new javax.swing.JList<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jRConfirmada = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAnticipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JFormattedTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Reserva");
        setMinimumSize(new java.awt.Dimension(780, 400));
        setModal(true);
        setResizable(false);
        setSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Reserva");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reserva256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos de la Reserva", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

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
        jLabel7.setText("Habitaciones:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Hotel:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Id:");

        jScrollPane2.setViewportView(lstHabitaciones);

        cmbCliente.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cmbCliente.setPreferredSize(new java.awt.Dimension(165, 23));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Cliente");

        jRConfirmada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRConfirmada.setText("Confirmada");
        jRConfirmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRConfirmadaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Precio Total:");

        txtPrecioTotal.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPrecioTotal.setPreferredSize(new java.awt.Dimension(165, 23));
        txtPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioTotalKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Anticipo ($):");

        txtAnticipo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAnticipo.setPreferredSize(new java.awt.Dimension(165, 23));
        txtAnticipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnticipoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha Inicio:");

        txtFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha Fin:");

        txtFechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        txtEstado.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtEstado.setPreferredSize(new java.awt.Dimension(165, 23));
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Estado:");

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jRConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaInicio)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFin)))
                .addGap(45, 45, 45))
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRConfirmada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        if (cmbHotel.getItemCount() > 0) {
            cmbHotel.setSelectedIndex(0);
        }
        lstHabitaciones.clearSelection();
        lstHabitaciones.clearSelection();
        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);

        limpiarCampos();

    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        try {
            // Validaciones básicas
            if (txtId.getText().trim().isEmpty()
                    || txtFechaInicio.getText().trim().isEmpty()
                    || txtFechaFin.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos obligatorios.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convertir valores
            int id = Integer.parseInt(txtId.getText().trim());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicio = sdf.parse(txtFechaInicio.getText().trim());
            Date fechaFin = sdf.parse(txtFechaFin.getText().trim());

            // Validar fechas
            if (!fechaInicio.before(fechaFin)) {
                JOptionPane.showMessageDialog(this, "La fecha de inicio debe ser anterior a la fecha fin.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener objetos seleccionados
            Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
            Hotel hotel = (Hotel) cmbHotel.getSelectedItem();
            boolean confirmada = jRConfirmada.isSelected();
            String estado = txtEstado.getText().trim().isEmpty() ? "Pendiente" : txtEstado.getText().trim();

            List<Habitacion> habitaciones = lstHabitaciones.getSelectedValuesList();

            // Validar habitaciones seleccionadas
            if (habitaciones.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Seleccione al menos una habitación.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calcular precio total y anticipo
            double precioTotal = Double.parseDouble(txtPrecioTotal.getText().trim());
            double anticipo = txtAnticipo.getText().trim().isEmpty() ? 0
                    : Double.parseDouble(txtAnticipo.getText().trim());

            if (anticipo > precioTotal) {
                JOptionPane.showMessageDialog(this, "El anticipo no puede ser mayor al precio total.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Verificar disponibilidad de habitaciones
            for (Habitacion hab : habitaciones) {
                if (!hab.isDisponible()) {
                    JOptionPane.showMessageDialog(this,
                            "La habitación " + hab.getNumero() + " no está disponible.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Validar Duplicados
            
            try {
                // Verificar si ya existe una reserva con este ID
                ReservaCrud.buscar(id);
                JOptionPane.showMessageDialog(this,
                        "Ya existe una reserva con este ID.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } catch (Exception ex) {
                // No existe, continuar
            }
            
            // Crear y guardar reserva
            Reserva reserva = new Reserva();
            reserva.setId(id);
            reserva.setCliente(cliente);
            reserva.setHotel(hotel);
            reserva.setHabitacionesReservadas(new ArrayList<>(habitaciones));
            reserva.setFechaInicio(fechaInicio);
            reserva.setFechaFin(fechaFin);
            reserva.setAnticipo(anticipo);
            reserva.setConfirmada(confirmada);
            reserva.setEstado(estado);

            ReservaCrud.agregar(reserva);

            // Actualizar disponibilidad de habitaciones
            for (Habitacion hab : habitaciones) {
                hab.setDisponible(false);
                HabitacionCrud.editar(hab);
            }

            JOptionPane.showMessageDialog(this, "Reserva creada exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();
            cargarReservas(); // Recargar datos

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido (dd/MM/yyyy).",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al crear reserva: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    // Validar caracteres al digitar
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int tecla = evt.getKeyChar();

        boolean numero = tecla >= 48 && tecla <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea modificar esta reserva?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            // 1. Obtener valores del formulario
            int id = Integer.parseInt(txtId.getText().trim());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicio = sdf.parse(txtFechaInicio.getText().trim());
            Date fechaFin = sdf.parse(txtFechaFin.getText().trim());
            double precioTotal = Double.parseDouble(txtPrecioTotal.getText().trim());
            double anticipo = txtAnticipo.getText().trim().isEmpty() ? 0
                    : Double.parseDouble(txtAnticipo.getText().trim());

            // 2. Validaciones básicas
            if (anticipo > precioTotal) {
                JOptionPane.showMessageDialog(this,
                        "El anticipo no puede ser mayor al precio total",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!fechaInicio.before(fechaFin)) {
                JOptionPane.showMessageDialog(this,
                        "La fecha de inicio debe ser anterior a la fecha fin",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // 3. Obtener objetos seleccionados
            Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
            Hotel hotel = (Hotel) cmbHotel.getSelectedItem();
            boolean confirmada = jRConfirmada.isSelected();
            String estado = txtEstado.getText().trim();
            estado = estado.isEmpty() ? "Pendiente" : estado;

            List<Habitacion> habitacionesSeleccionadas = lstHabitaciones.getSelectedValuesList();

            // 4. Validar habitaciones seleccionadas
            if (habitacionesSeleccionadas.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Seleccione al menos una habitación",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // 5. Obtener la reserva existente
            Reserva reservaExistente = ReservaCrud.buscar(id);

            // 6. Liberar las habitaciones anteriores
            for (Habitacion hab : reservaExistente.getHabitacionesReservadas()) {
                hab.setDisponible(true);
                HabitacionCrud.editar(hab);
            }

            // 7. Actualizar la reserva
            reservaExistente.setCliente(cliente);
            reservaExistente.setHotel(hotel);
            reservaExistente.setHabitacionesReservadas(new ArrayList<>(habitacionesSeleccionadas));
            reservaExistente.setFechaInicio(fechaInicio);
            reservaExistente.setFechaFin(fechaFin);
            reservaExistente.setAnticipo(anticipo);
            reservaExistente.setConfirmada(confirmada);
            reservaExistente.setEstado(estado);

            // 8. Reservar las nuevas habitaciones
            for (Habitacion hab : habitacionesSeleccionadas) {
                hab.setDisponible(false);
                HabitacionCrud.editar(hab);
            }

            // 9. Actualizar en el CRUD
            ReservaCrud.editar(reservaExistente);

            // 10. Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this,
                    "Reserva actualizada exitosamente!",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            // 11. Recargar datos
            cargarReservas();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese valores numéricos válidos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this,
                    "Formato de fecha inválido (dd/MM/yyyy)",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al editar reserva: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar esta reserva?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int id = Integer.parseInt(txtId.getText().trim());
            Reserva reserva = ReservaCrud.buscar(id);

            // Liberar habitaciones
            for (Habitacion hab : reserva.getHabitacionesReservadas()) {
                hab.setDisponible(true);
                HabitacionCrud.editar(hab);
            }

            // Eliminar reserva
            ReservaCrud.eliminar(id);

            JOptionPane.showMessageDialog(this,
                    "Reserva eliminada exitosamente!",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();
            cargarReservas(); // Recargar datos

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID debe ser numérico", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar reserva: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // Valor buscado (ID de reserva)
        String idTexto = txtId.getText().trim();

        // Validar campo vacío
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID de reserva.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Convertir y realizar la búsqueda
            int id = Integer.parseInt(idTexto);
            Reserva reserva = ReservaCrud.buscar(id);

            // Mostrar datos de la reserva encontrada
            txtId.setText(String.valueOf(reserva.getId()));

            // Configurar cliente
            cmbCliente.setSelectedItem(reserva.getCliente());

            // Configurar hotel
            cmbHotel.setSelectedItem(reserva.getHotel());

            // Configurar fechas
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            txtFechaInicio.setText(sdf.format(reserva.getFechaInicio()));
            txtFechaFin.setText(sdf.format(reserva.getFechaFin()));

            // Configurar otros campos
            txtPrecioTotal.setText(String.valueOf(reserva.calcularPrecio()));
            txtAnticipo.setText(String.valueOf(reserva.getAnticipo()));
            jRConfirmada.setSelected(reserva.isConfirmada());
            txtEstado.setText(reserva.getEstado());

            // Configurar lista de habitaciones
            DefaultListModel<Habitacion> modeloHabitaciones = new DefaultListModel<>();
            for (Habitacion hab : reserva.getHabitacionesReservadas()) {
                modeloHabitaciones.addElement(hab);
            }
            lstHabitaciones.setModel(modeloHabitaciones);

            // Seleccionar las habitaciones de la reserva
            int[] indices = new int[reserva.getHabitacionesReservadas().size()];
            for (int i = 0; i < indices.length; i++) {
                indices[i] = ((DefaultListModel<Habitacion>) lstHabitaciones.getModel())
                        .indexOf(reserva.getHabitacionesReservadas().get(i));
            }
            lstHabitaciones.setSelectedIndices(indices);

            // Habilitar botones según la acción
            habilitarBotones(accion);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Si no hay resultados
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "No encontrado", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar campos
            limpiarCampos();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void txtPrecioTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTotalKeyTyped

    private void txtAnticipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnticipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipoKeyTyped

    private void jRConfirmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRConfirmadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRConfirmadaActionPerformed

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoKeyTyped

    // Listar e insertar listas
    private void cargarReservas() {
        try {
            // 1. Cargar hoteles
            ArrayList<Hotel> hoteles = HotelCrud.listarTodo();
            cmbHotel.removeAllItems();
            for (Hotel h : hoteles) {
                cmbHotel.addItem(h);
            }

            // 2. Cargar clientes
            ArrayList<Cliente> clientes = ClienteCrud.listarTodo();
            cmbCliente.removeAllItems();
            for (Cliente c : clientes) {
                cmbCliente.addItem(c);
            }

            // 3. Cargar habitaciones del primer hotel (si existe)
            if (cmbHotel.getItemCount() > 0) {
                Hotel primerHotel = (Hotel) cmbHotel.getItemAt(0);
                cargarHabitacionesDisponibles(primerHotel);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar datos: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void cargarDatosIniciales() {
        try {
            // Cargar hoteles
            ArrayList<Hotel> hoteles = HotelCrud.listarTodo();
            cmbHotel.removeAllItems();
            for (Hotel h : hoteles) {
                cmbHotel.addItem(h);
            }

            // Cargar clientes
            ArrayList<Cliente> clientes = ClienteCrud.listarTodo();
            cmbCliente.removeAllItems();
            for (Cliente c : clientes) {
                cmbCliente.addItem(c);
            }

            // Cargar habitaciones del primer hotel si existe
            if (cmbHotel.getItemCount() > 0) {
                cargarHabitacionesDisponibles((Hotel) cmbHotel.getSelectedItem());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar datos iniciales: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarHabitacionesDisponibles(Hotel hotel) {
        try {
            ArrayList<Habitacion> todas = HabitacionCrud.listarTodo();
            DefaultListModel<Habitacion> modelo = new DefaultListModel<>();

            for (Habitacion hab : todas) {
                if (hab.getHotel() != null
                        && hab.getHotel().equals(hotel)
                        && hab.isDisponible()) {
                    modelo.addElement(hab);
                }
            }

            lstHabitaciones.setModel(modelo);

            if (modelo.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "No hay habitaciones disponibles para este hotel",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar habitaciones: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Habilitar botones segun la accion
    private void habilitarBotones(String accion) {
        boolean modoAgregar = "agregar".equalsIgnoreCase(accion);
        boolean modoEditar = "editar".equalsIgnoreCase(accion);
        boolean modoEliminar = "eliminar".equalsIgnoreCase(accion);

        jBAgregar.setEnabled(modoAgregar);
        jBEditar.setEnabled(modoEditar && !txtId.getText().trim().isEmpty());
        jBEliminar.setEnabled(modoEliminar && !txtId.getText().trim().isEmpty());
        jBBuscar.setEnabled(!modoAgregar);

        // Habilitar campos según la acción
        txtId.setEnabled(true);
        txtFechaInicio.setEnabled(modoAgregar || modoEditar);
        txtFechaFin.setEnabled(modoAgregar || modoEditar);
        cmbCliente.setEnabled(modoAgregar || modoEditar);
        cmbHotel.setEnabled(modoAgregar || modoEditar);
        lstHabitaciones.setEnabled(modoAgregar || modoEditar);
        txtPrecioTotal.setEnabled(false); // Siempre calculado automáticamente
        txtAnticipo.setEnabled(modoAgregar || modoEditar);
        jRConfirmada.setEnabled(modoAgregar || modoEditar);
        txtEstado.setEnabled(modoAgregar || modoEditar);
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtPrecioTotal.setText("");
        txtAnticipo.setText("");
        txtEstado.setText("");
        jRConfirmada.setSelected(false);

        // Limpiar selecciones manteniendo los datos cargados
        lstHabitaciones.clearSelection();
        if (cmbHotel.getItemCount() > 0) {
            cmbHotel.setSelectedIndex(0);
        }
        if (cmbCliente.getItemCount() > 0) {
            cmbCliente.setSelectedIndex(0);
        }

        // Deshabilitar botones según la acción actual
        habilitarBotones(accion);
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
            java.util.logging.Logger.getLogger(VentanaCrudReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                VentanaCrudReserva dialog = new VentanaCrudReserva(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Cliente> cmbCliente;
    private javax.swing.JComboBox<Hotel> cmbHotel;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JRadioButton jRConfirmada;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Habitacion> lstHabitaciones;
    private javax.swing.JTextField txtAnticipo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtFechaFin;
    private javax.swing.JFormattedTextField txtFechaInicio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables

}

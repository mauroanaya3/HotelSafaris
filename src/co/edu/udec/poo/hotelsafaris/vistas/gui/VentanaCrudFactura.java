package co.edu.udec.poo.hotelsafaris.vistas.gui;

import co.edu.udec.poo.hotelsafaris.modelo.crud.EmpleadoCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.EstanciaCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.FacturaCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.HotelCrud;
import co.edu.udec.poo.hotelsafaris.modelo.crud.ReservaCrud;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Actividad;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Estancia;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Factura;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.Reserva;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class VentanaCrudFactura extends javax.swing.JDialog {

    private String accion;

    public VentanaCrudFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarEstancias();

    }

    // setter para aplicar la configuracion de botones
    public void setAccion(String accion) {
        this.accion = accion;
        habilitarBotones(accion);
        configurarListenersParaCalculoAutomatico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        JLImagen = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        cmbEstancia = new javax.swing.JComboBox<>();
        txtFechaEmision = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHabitaciones = new javax.swing.JTextField();
        txtActiviades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSuplementos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAnticipo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFacturaGenerada = new javax.swing.JTextArea();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setTitle("Facturas");
        setMinimumSize(new java.awt.Dimension(780, 400));
        setModal(true);
        setResizable(false);
        setSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 106, 140));
        jLTitulo.setText("Formulario Factura");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, -1));

        JLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/factura256.png"))); // NOI18N
        getContentPane().add(JLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 256, 256));

        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true), "Datos de la Factura", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        txtId.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(165, 23));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        cmbEstancia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cmbEstancia.setPreferredSize(new java.awt.Dimension(165, 23));

        txtFechaEmision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha emisión:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estancia");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Factura No:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Habitaciones ($):");

        txtHabitaciones.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtHabitaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHabitaciones.setEnabled(false);
        txtHabitaciones.setPreferredSize(new java.awt.Dimension(165, 23));
        txtHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHabitacionesKeyTyped(evt);
            }
        });

        txtActiviades.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtActiviades.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtActiviades.setEnabled(false);
        txtActiviades.setPreferredSize(new java.awt.Dimension(165, 23));
        txtActiviades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActiviadesKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Actividades ($):");

        txtSuplementos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtSuplementos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSuplementos.setEnabled(false);
        txtSuplementos.setPreferredSize(new java.awt.Dimension(165, 23));
        txtSuplementos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuplementosKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Suplementos ($):");

        txtAnticipo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAnticipo.setPreferredSize(new java.awt.Dimension(165, 23));
        txtAnticipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnticipoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Anticipo -($)");

        txtTotalPagar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTotalPagar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotalPagar.setEnabled(false);
        txtTotalPagar.setPreferredSize(new java.awt.Dimension(165, 23));
        txtTotalPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagarKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Total a Pagar ($):");

        txtFacturaGenerada.setColumns(20);
        txtFacturaGenerada.setRows(5);
        txtFacturaGenerada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFacturaGenerada.setEnabled(false);
        jScrollPane1.setViewportView(txtFacturaGenerada);

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cmbEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(235, 235, 235))))
                            .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatosLayout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPDatosLayout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDatosLayout.createSequentialGroup()
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtSuplementos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPDatosLayout.createSequentialGroup()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtActiviades, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPDatosLayout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLayout.createSequentialGroup()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtActiviades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuplementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        // Limpiar campos de texto
        txtId.setText("");
        txtFechaEmision.setText("");
        txtHabitaciones.setText("");
        txtActiviades.setText("");
        txtSuplementos.setText("");
        txtAnticipo.setText("");
        txtTotalPagar.setText("");
        txtFacturaGenerada.setText("");

        // Reiniciar combobox de estancia
        if (cmbEstancia.getItemCount() > 0) {
            cmbEstancia.setSelectedIndex(0);
        }

        // Deshabilitar botones de edición/eliminación
        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);

        // Habilitar botón de agregar si está en modo agregar
        if ("agregar".equals(accion)) {
            jBAgregar.setEnabled(true);
        }

        // Enfocar el primer campo para nueva entrada
        txtId.requestFocusInWindow();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Boton Agregar
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        try {
            // Validar campos obligatorios
            if (txtId.getText().trim().isEmpty() || txtFechaEmision.getText().trim().isEmpty()
                    || cmbEstancia.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, complete todos los campos obligatorios.",
                        "Campos incompletos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Validar anticipo numérico
            double anticipo = 0;
            if (!txtAnticipo.getText().isEmpty()) {
                try {
                    anticipo = Double.parseDouble(txtAnticipo.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "El anticipo debe ser un valor numérico válido.",
                            "Error en formato", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Crear nueva factura
            Factura factura = new Factura();
            factura.setId(Integer.parseInt(txtId.getText().trim()));
            factura.setEstancia((Estancia) cmbEstancia.getSelectedItem());
            factura.setFechaEmision(new SimpleDateFormat("dd/MM/yyyy").parse(txtFechaEmision.getText().trim()));
            factura.setAnticipoDescontado(anticipo);

            // Calcular totales automáticamente
            factura.calcularTotal();

            // Guardar factura
            FacturaCrud.agregar(factura);

            // Mostrar resultados
            txtHabitaciones.setText(String.format("%.2f", factura.getTotalHabitaciones()));
            txtActiviades.setText(String.format("%.2f", factura.getTotalActividades()));
            txtTotalPagar.setText(String.format("%.2f", factura.getTotalPagar()));
            txtFacturaGenerada.setText(factura.generarFactura());

            JOptionPane.showMessageDialog(this,
                    "Factura agregada exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al agregar factura: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea modificar esta factura?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            // Obtener datos del formulario
            int id = Integer.parseInt(txtId.getText().trim());
            Estancia estancia = (Estancia) cmbEstancia.getSelectedItem();
            Date fechaEmision = new SimpleDateFormat("dd/MM/yyyy").parse(txtFechaEmision.getText().trim());
            double anticipo = txtAnticipo.getText().isEmpty() ? 0 : Double.parseDouble(txtAnticipo.getText());

            // Crear factura con los nuevos datos
            Factura factura = new Factura();
            factura.setId(id);
            factura.setEstancia(estancia);
            factura.setFechaEmision(fechaEmision);
            factura.setAnticipoDescontado(anticipo);
            factura.calcularTotal(); // Recalcular totales

            // Actualizar en el CRUD
            FacturaCrud.editar(factura);

            // Actualizar vista
            txtHabitaciones.setText(String.format("%.2f", factura.getTotalHabitaciones()));
            txtActiviades.setText(String.format("%.2f", factura.getTotalActividades()));
            txtTotalPagar.setText(String.format("%.2f", factura.getTotalPagar()));
            txtFacturaGenerada.setText(factura.generarFactura());

            JOptionPane.showMessageDialog(this,
                    "Factura actualizada exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al editar factura: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar esta factura?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int id = Integer.parseInt(txtId.getText().trim());
            FacturaCrud.eliminar(id);

            JOptionPane.showMessageDialog(this,
                    "Factura eliminada exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar factura: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String idText = txtId.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de factura", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            Factura factura = FacturaCrud.buscar(id);

            // Mostrar datos en la interfaz
            txtFechaEmision.setText(new SimpleDateFormat("dd/MM/yyyy").format(factura.getFechaEmision()));
            cmbEstancia.setSelectedItem(factura.getEstancia());
            txtHabitaciones.setText(String.format("%.2f", factura.getTotalHabitaciones()));
            txtActiviades.setText(String.format("%.2f", factura.getTotalActividades()));
            txtSuplementos.setText(String.format("%.2f", factura.getTotalSuplementos()));
            txtAnticipo.setText(String.format("%.2f", factura.getAnticipoDescontado()));
            txtTotalPagar.setText(String.format("%.2f", factura.getTotalPagar()));
            txtFacturaGenerada.setText(factura.generarFactura());

            // Habilitar botones según la acción
            if ("editar".equals(accion)) {
                jBEditar.setEnabled(true);
            } else if ("eliminar".equals(accion)) {
                jBEliminar.setEnabled(true);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    // Validar caracteres al digitar en jTNombre
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int tecla = evt.getKeyChar();

        boolean numero = tecla >= 48 && tecla <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHabitacionesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionesKeyTyped

    private void txtActiviadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActiviadesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActiviadesKeyTyped

    private void txtSuplementosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuplementosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuplementosKeyTyped

    private void txtAnticipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnticipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipoKeyTyped

    private void txtTotalPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarKeyTyped

    // Listar
    private void cargarEstancias() {
        try {
            ArrayList<Estancia> estancias = EstanciaCrud.listarTodo();
            cmbEstancia.removeAllItems();

            for (Estancia e : estancias) {
                cmbEstancia.addItem(e);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar estancias: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtFechaEmision.setText("");
        txtHabitaciones.setText("");
        txtActiviades.setText("");
        txtSuplementos.setText("");
        txtAnticipo.setText("");
        txtTotalPagar.setText("");
        txtFacturaGenerada.setText("");

        if (cmbEstancia.getItemCount() > 0) {
            cmbEstancia.setSelectedIndex(0);
        }

        jBEditar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }

    private void configurarListenersParaCalculoAutomatico() {
        KeyAdapter calculator = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                calcularTotalAutomatico();
            }
        };

        txtAnticipo.addKeyListener(calculator);
        cmbEstancia.addActionListener(e -> calcularTotalAutomatico());
    }

    private void calcularTotalAutomatico() {
        if (cmbEstancia.getSelectedItem() != null) {
            try {
                Estancia estancia = (Estancia) cmbEstancia.getSelectedItem();
                double anticipo = txtAnticipo.getText().isEmpty() ? 0 : Double.parseDouble(txtAnticipo.getText());

                double totalHabitaciones = estancia.calcularTotalEstancia();
                double totalActividades = estancia.getActividadesContratadas().stream()
                        .mapToDouble(Actividad::calcularCostoCliente).sum();
                double total = totalHabitaciones + totalActividades - anticipo;

                txtHabitaciones.setText(String.format("%.2f", totalHabitaciones));
                txtActiviades.setText(String.format("%.2f", totalActividades));
                txtTotalPagar.setText(String.format("%.2f", total));

            } catch (NumberFormatException ex) {
                // No hacer nada si el anticipo no es un número válido
            }
        }
    }

    // Habilitar botones segun la accion
    private void habilitarBotones(String accion) {
        // Convertir a minúsculas y trim para evitar problemas
        String accionNormalizada = accion != null ? accion.toLowerCase().trim() : "";

        // Configuración común para todos los casos
        jBBuscar.setEnabled(true);  // Siempre habilitado
        txtId.setEnabled(true);     // Siempre habilitado para búsqueda/ingreso

        // Configuración específica por acción
        switch (accionNormalizada) {
            case "agregar":
                jBAgregar.setEnabled(true);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                txtFechaEmision.setEnabled(true);
                cmbEstancia.setEnabled(true);
                txtAnticipo.setEnabled(true);

                // Habilitar solo lo necesario para nueva factura
                txtHabitaciones.setEnabled(false);  // Se calcula automáticamente
                txtActiviades.setEnabled(false);    // Se calcula automáticamente
                txtSuplementos.setEnabled(false);   // No usado actualmente
                txtTotalPagar.setEnabled(false);    // Se calcula automáticamente
                break;

            case "editar":
                jBAgregar.setEnabled(false);
                jBEditar.setEnabled(true);  // Se habilita después de buscar
                jBEliminar.setEnabled(false);

                txtFechaEmision.setEnabled(true);
                cmbEstancia.setEnabled(true);
                txtAnticipo.setEnabled(true);

                // Campos calculados (solo lectura)
                txtHabitaciones.setEnabled(false);
                txtActiviades.setEnabled(false);
                txtSuplementos.setEnabled(false);
                txtTotalPagar.setEnabled(false);
                break;

            case "eliminar":
                jBAgregar.setEnabled(false);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(true);  // Se habilita después de buscar

                // Deshabilitar edición de campos
                txtFechaEmision.setEnabled(false);
                cmbEstancia.setEnabled(false);
                txtAnticipo.setEnabled(false);
                txtHabitaciones.setEnabled(false);
                txtActiviades.setEnabled(false);
                txtSuplementos.setEnabled(false);
                txtTotalPagar.setEnabled(false);
                break;

            default:  // Modo consulta
                jBAgregar.setEnabled(false);
                jBEditar.setEnabled(false);
                jBEliminar.setEnabled(false);

                // Todos los campos en solo lectura
                txtFechaEmision.setEnabled(false);
                cmbEstancia.setEnabled(false);
                txtAnticipo.setEnabled(false);
                txtHabitaciones.setEnabled(false);
                txtActiviades.setEnabled(false);
                txtSuplementos.setEnabled(false);
                txtTotalPagar.setEnabled(false);
        }

        // Actualizar estado de los botones basado en datos existentes
        actualizarEstadoBotones();
    }

// Método auxiliar para actualizar estados
    private void actualizarEstadoBotones() {
        boolean tieneDatos = !txtId.getText().isEmpty();

        if ("editar".equals(accion.toLowerCase())) {
            jBEditar.setEnabled(tieneDatos);
        } else if ("eliminar".equals(accion.toLowerCase())) {
            jBEliminar.setEnabled(tieneDatos);
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
            java.util.logging.Logger.getLogger(VentanaCrudFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                VentanaCrudFactura dialog = new VentanaCrudFactura(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<Estancia> cmbEstancia;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtActiviades;
    private javax.swing.JTextField txtAnticipo;
    private javax.swing.JTextArea txtFacturaGenerada;
    private javax.swing.JFormattedTextField txtFechaEmision;
    private javax.swing.JTextField txtHabitaciones;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSuplementos;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

}

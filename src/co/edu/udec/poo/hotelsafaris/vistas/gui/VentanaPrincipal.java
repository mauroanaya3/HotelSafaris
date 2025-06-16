package co.edu.udec.poo.hotelsafaris.vistas.gui;

import javax.swing.JFrame;

public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaGeneral
     */
    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setLayout(null); 

        centrarLogo();

        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                centrarLogo();
            }
            
            @Override
            public void componentShown(java.awt.event.ComponentEvent evt) {
                centrarLogo();
            }
        });

    }

    
    private void centrarLogo() {
        int anchoContenedor = this.getContentPane().getWidth();
        int altoContenedor = this.getContentPane().getHeight();

        int anchoLabel = jLFondo.getWidth();
        int altoLabel = jLFondo.getHeight();

        int x = (anchoContenedor - anchoLabel) / 2;
        int y = (altoContenedor - altoLabel) / 2;

        jLFondo.setLocation(x, y);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFondo = new javax.swing.JLabel();
        MenuBarSuperior = new javax.swing.JMenuBar();
        menuHotel = new javax.swing.JMenu();
        itemAgregarHotel = new javax.swing.JMenuItem();
        itemBuscarHotel = new javax.swing.JMenuItem();
        itemEditarHotel = new javax.swing.JMenuItem();
        itemEliminarHotel = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuHotelReportes = new javax.swing.JMenu();
        itemReporteXNombreHotel = new javax.swing.JMenuItem();
        itemReporteXCategoriaHotel = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        itemAgregarCliente = new javax.swing.JMenuItem();
        itemBuscarCliente = new javax.swing.JMenuItem();
        itemEditarCliente = new javax.swing.JMenuItem();
        itemEliminarCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuClienteReportes = new javax.swing.JMenu();
        itemReporteXNombreCliente = new javax.swing.JMenuItem();
        itemReporteXTelefonoCliente = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        itemAgregarEmpleado = new javax.swing.JMenuItem();
        itemBuscarEmpleado = new javax.swing.JMenuItem();
        itemEditarEmpleado = new javax.swing.JMenuItem();
        itemEliminarEmpleado = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuEmpleadoReportes = new javax.swing.JMenu();
        itemReporteXTipoEmpleado = new javax.swing.JMenuItem();
        itemReporteXNivelEmpleado = new javax.swing.JMenuItem();
        menuEstancia = new javax.swing.JMenu();
        itemAgregarEstancia = new javax.swing.JMenuItem();
        itemBuscarEstancia = new javax.swing.JMenuItem();
        itemEditarEstancia = new javax.swing.JMenuItem();
        itemEliminarEstancia = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuEstanciaReportes = new javax.swing.JMenu();
        itemReporteXFechaInicioEstancia = new javax.swing.JMenuItem();
        itemReporteXClienteEstancia = new javax.swing.JMenuItem();
        menuFactura = new javax.swing.JMenu();
        itemAgregarFactura = new javax.swing.JMenuItem();
        itemBuscarFactura = new javax.swing.JMenuItem();
        itemEditarFactura = new javax.swing.JMenuItem();
        itemEliminarFactura = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuFacturaReportes = new javax.swing.JMenu();
        itemReporteXFechaFactura = new javax.swing.JMenuItem();
        itemReporteXClienteFactura = new javax.swing.JMenuItem();
        menuHabitacion = new javax.swing.JMenu();
        itemAgregarHabitacion = new javax.swing.JMenuItem();
        itemBuscarHabitacion = new javax.swing.JMenuItem();
        itemEditarHabitacion = new javax.swing.JMenuItem();
        itemEliminarHabitacion = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuHabitacionReportes = new javax.swing.JMenu();
        itemReporteXTipoHabitacion = new javax.swing.JMenuItem();
        itemReporteXDisponibilidadHabitacion = new javax.swing.JMenuItem();
        menuReserva = new javax.swing.JMenu();
        itemAgregarReserva = new javax.swing.JMenuItem();
        itemBuscarReserva = new javax.swing.JMenuItem();
        itemEditarReserva = new javax.swing.JMenuItem();
        itemEliminarReserva = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuReservaReportes = new javax.swing.JMenu();
        itemReporteXClienteReserva = new javax.swing.JMenuItem();
        itemReporteXFechaReserva = new javax.swing.JMenuItem();
        menuSuplemento = new javax.swing.JMenu();
        itemAgregarSuplemento = new javax.swing.JMenuItem();
        itemBuscarSuplemento = new javax.swing.JMenuItem();
        itemEditarSuplemento = new javax.swing.JMenuItem();
        itemEliminarSuplemento = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuSuplementoReportes = new javax.swing.JMenu();
        itemReporteXTipoSuplemento = new javax.swing.JMenuItem();
        itemReporteXImporteSuplemento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Hotelera");
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/logo280.png"))); // NOI18N
        jLFondo.setText("jLabel1");
        getContentPane().add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 280, -1));

        menuHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/hotel24.png"))); // NOI18N
        menuHotel.setText("Hotel");
        menuHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemAgregarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarHotel.setText("Agregar...");
        itemAgregarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemAgregarHotel);

        itemBuscarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemBuscarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarHotel.setText("Buscar...");
        itemBuscarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemBuscarHotel);

        itemEditarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemEditarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarHotel.setText("Editar...");
        itemEditarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemEditarHotel);

        itemEliminarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemEliminarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarHotel.setText("Eliminar...");
        itemEliminarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemEliminarHotel);
        menuHotel.add(jSeparator1);

        menuHotelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuHotelReportes.setText("Reportes");
        menuHotelReportes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemReporteXNombreHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemReporteXNombreHotel.setText("Listar por Nombre...");
        itemReporteXNombreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXNombreHotelActionPerformed(evt);
            }
        });
        menuHotelReportes.add(itemReporteXNombreHotel);

        itemReporteXCategoriaHotel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemReporteXCategoriaHotel.setText("Listar por Categoría...");
        itemReporteXCategoriaHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXCategoriaHotelActionPerformed(evt);
            }
        });
        menuHotelReportes.add(itemReporteXCategoriaHotel);

        menuHotel.add(menuHotelReportes);

        MenuBarSuperior.add(menuHotel);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/cliente24.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarCliente.setText("Agregar...");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemAgregarCliente);

        itemBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarCliente.setText("Buscar...");
        itemBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemBuscarCliente);

        itemEditarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarCliente.setText("Editar...");
        itemEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemEditarCliente);

        itemEliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarCliente.setText("Eliminar...");
        itemEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemEliminarCliente);
        menuCliente.add(jSeparator4);

        menuClienteReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuClienteReportes.setText("Reportes");
        menuClienteReportes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemReporteXNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemReporteXNombreCliente.setText("Listar por Nombre...");
        itemReporteXNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXNombreClienteActionPerformed(evt);
            }
        });
        menuClienteReportes.add(itemReporteXNombreCliente);

        itemReporteXTelefonoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemReporteXTelefonoCliente.setText("Listar por DNI...");
        itemReporteXTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXTelefonoClienteActionPerformed(evt);
            }
        });
        menuClienteReportes.add(itemReporteXTelefonoCliente);

        menuCliente.add(menuClienteReportes);

        MenuBarSuperior.add(menuCliente);

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/empleado24.png"))); // NOI18N
        menuEmpleado.setText("Empleado");
        menuEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarEmpleado.setText("Agregar...");
        itemAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemAgregarEmpleado);

        itemBuscarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarEmpleado.setText("Buscar...");
        itemBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemBuscarEmpleado);

        itemEditarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarEmpleado.setText("Editar...");
        itemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemEditarEmpleado);

        itemEliminarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarEmpleado.setText("Eliminar...");
        itemEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemEliminarEmpleado);
        menuEmpleado.add(jSeparator2);

        menuEmpleadoReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuEmpleadoReportes.setText("Reportes");
        menuEmpleadoReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXTipoEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXTipoEmpleado.setText("Listar por Nombre...");
        itemReporteXTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXTipoEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleadoReportes.add(itemReporteXTipoEmpleado);

        itemReporteXNivelEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXNivelEmpleado.setText("Listar por Tipo...");
        itemReporteXNivelEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXNivelEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleadoReportes.add(itemReporteXNivelEmpleado);

        menuEmpleado.add(menuEmpleadoReportes);

        MenuBarSuperior.add(menuEmpleado);

        menuEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/estancia24.png"))); // NOI18N
        menuEstancia.setText("Estancia");
        menuEstancia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarEstancia.setText("Agregar...");
        itemAgregarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemAgregarEstancia);

        itemBuscarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarEstancia.setText("Buscar...");
        itemBuscarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemBuscarEstancia);

        itemEditarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarEstancia.setText("Editar...");
        itemEditarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemEditarEstancia);

        itemEliminarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarEstancia.setText("Eliminar...");
        itemEliminarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemEliminarEstancia);
        menuEstancia.add(jSeparator5);

        menuEstanciaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuEstanciaReportes.setText("Reportes");
        menuEstanciaReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXFechaInicioEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXFechaInicioEstancia.setText("Buscar por Fecha de Inicio...");
        menuEstanciaReportes.add(itemReporteXFechaInicioEstancia);

        itemReporteXClienteEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXClienteEstancia.setText("Buscar por Cliente...");
        menuEstanciaReportes.add(itemReporteXClienteEstancia);

        menuEstancia.add(menuEstanciaReportes);

        MenuBarSuperior.add(menuEstancia);

        menuFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/factura24.png"))); // NOI18N
        menuFactura.setText("Factura");
        menuFactura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarFactura.setText("Agregar...");
        itemAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemAgregarFactura);

        itemBuscarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarFactura.setText("Buscar...");
        itemBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemBuscarFactura);

        itemEditarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarFactura.setText("Editar...");
        itemEditarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemEditarFactura);

        itemEliminarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarFactura.setText("Eliminar...");
        itemEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemEliminarFactura);
        menuFactura.add(jSeparator6);

        menuFacturaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuFacturaReportes.setText("Reportes");
        menuFacturaReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXFechaFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXFechaFactura.setText("Buscar por Fecha...");
        menuFacturaReportes.add(itemReporteXFechaFactura);

        itemReporteXClienteFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXClienteFactura.setText("Buscar por Cliente...");
        itemReporteXClienteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXClienteFacturaActionPerformed(evt);
            }
        });
        menuFacturaReportes.add(itemReporteXClienteFactura);

        menuFactura.add(menuFacturaReportes);

        MenuBarSuperior.add(menuFactura);

        menuHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/habitacion24.png"))); // NOI18N
        menuHabitacion.setText("Habitación");
        menuHabitacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHabitacionActionPerformed(evt);
            }
        });

        itemAgregarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarHabitacion.setText("Agregar...");
        itemAgregarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemAgregarHabitacion);

        itemBuscarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarHabitacion.setText("Buscar...");
        itemBuscarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemBuscarHabitacion);

        itemEditarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarHabitacion.setText("Editar...");
        itemEditarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemEditarHabitacion);

        itemEliminarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarHabitacion.setText("Eliminar...");
        itemEliminarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemEliminarHabitacion);
        menuHabitacion.add(jSeparator7);

        menuHabitacionReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuHabitacionReportes.setText("Reportes");
        menuHabitacionReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXTipoHabitacion.setText("Buscar por Tipo...");
        menuHabitacionReportes.add(itemReporteXTipoHabitacion);

        itemReporteXDisponibilidadHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXDisponibilidadHabitacion.setText("Buscar por Disponibilidad...");
        itemReporteXDisponibilidadHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXDisponibilidadHabitacionActionPerformed(evt);
            }
        });
        menuHabitacionReportes.add(itemReporteXDisponibilidadHabitacion);

        menuHabitacion.add(menuHabitacionReportes);

        MenuBarSuperior.add(menuHabitacion);

        menuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reserva24.png"))); // NOI18N
        menuReserva.setText("Reserva");
        menuReserva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarReserva.setText("Agregar...");
        itemAgregarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemAgregarReserva);

        itemBuscarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarReserva.setText("Buscar...");
        itemBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemBuscarReserva);

        itemEditarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarReserva.setText("Editar...");
        itemEditarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemEditarReserva);

        itemEliminarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarReserva.setText("Eliminar...");
        itemEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemEliminarReserva);
        menuReserva.add(jSeparator8);

        menuReservaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuReservaReportes.setText("Reportes");
        menuReservaReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXClienteReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXClienteReserva.setText("Buscar por Cliente...");
        menuReservaReportes.add(itemReporteXClienteReserva);

        itemReporteXFechaReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXFechaReserva.setText("Buscar por Fecha...");
        itemReporteXFechaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteXFechaReservaActionPerformed(evt);
            }
        });
        menuReservaReportes.add(itemReporteXFechaReserva);

        menuReserva.add(menuReservaReportes);

        MenuBarSuperior.add(menuReserva);

        menuSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/suplemento24.png"))); // NOI18N
        menuSuplemento.setText("Suplemento");
        menuSuplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemAgregarSuplemento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarSuplemento.setText("Agregar...");
        itemAgregarSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarSuplementoActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemAgregarSuplemento);

        itemBuscarSuplemento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/busccar20.png"))); // NOI18N
        itemBuscarSuplemento.setText("Buscar...");
        itemBuscarSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarSuplementoActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemBuscarSuplemento);

        itemEditarSuplemento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/modificar20.png"))); // NOI18N
        itemEditarSuplemento.setText("Editar...");
        itemEditarSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarSuplementoActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemEditarSuplemento);

        itemEliminarSuplemento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/eliminar20.png"))); // NOI18N
        itemEliminarSuplemento.setText("Eliminar...");
        itemEliminarSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarSuplementoActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemEliminarSuplemento);
        menuSuplemento.add(jSeparator9);

        menuSuplementoReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/gui/img/reporte20.png"))); // NOI18N
        menuSuplementoReportes.setText("Reportes");
        menuSuplementoReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXTipoSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXTipoSuplemento.setText("Buscar por Tipo...");
        menuSuplementoReportes.add(itemReporteXTipoSuplemento);

        itemReporteXImporteSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXImporteSuplemento.setText("Buscar por Importe...");
        menuSuplementoReportes.add(itemReporteXImporteSuplemento);

        menuSuplemento.add(menuSuplementoReportes);

        MenuBarSuperior.add(menuSuplemento);

        setJMenuBar(MenuBarSuperior);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarHotelActionPerformed
        VentanaCrudHotel ventana = new VentanaCrudHotel(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("agregar");
        ventana.setVisible(true);

    }//GEN-LAST:event_itemAgregarHotelActionPerformed

    private void itemEditarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarHotelActionPerformed
        VentanaCrudHotel ventana = new VentanaCrudHotel(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("editar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarHotelActionPerformed

    private void itemAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmpleadoActionPerformed
        VentanaCrudEmpleado ventana = new VentanaCrudEmpleado(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("agregar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarEmpleadoActionPerformed

    private void itemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleadoActionPerformed
        VentanaCrudEmpleado ventana = new VentanaCrudEmpleado(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("editar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarEmpleadoActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
        VentanaCrudCliente ventana = new VentanaCrudCliente(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("agregar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void itemEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarClienteActionPerformed
        VentanaCrudCliente ventana = new VentanaCrudCliente(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("editar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarClienteActionPerformed

    private void itemAgregarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEstanciaActionPerformed
        VentanaCrudEstancia ventana = new VentanaCrudEstancia(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarEstanciaActionPerformed

    private void itemEditarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEstanciaActionPerformed
        VentanaCrudEstancia ventana = new VentanaCrudEstancia(this, true);
        ventana.setAccion("editar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarEstanciaActionPerformed

    private void itemAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarFacturaActionPerformed
        VentanaCrudFactura ventana = new VentanaCrudFactura(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarFacturaActionPerformed

    private void itemEditarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarFacturaActionPerformed
        VentanaCrudFactura ventana = new VentanaCrudFactura(this, true);
        ventana.setAccion("editar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarFacturaActionPerformed

    private void itemAgregarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarHabitacionActionPerformed
        VentanaCrudHabitacion ventana = new VentanaCrudHabitacion(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarHabitacionActionPerformed

    private void itemEditarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarHabitacionActionPerformed
        VentanaCrudHabitacion ventana = new VentanaCrudHabitacion(this, true);
        ventana.setAccion("editar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarHabitacionActionPerformed

    private void itemAgregarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarReservaActionPerformed
        VentanaCrudReserva ventana = new VentanaCrudReserva(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarReservaActionPerformed

    private void itemEditarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarReservaActionPerformed
        VentanaCrudReserva ventana = new VentanaCrudReserva(this, true);
        ventana.setAccion("editar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarReservaActionPerformed

    private void itemAgregarSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarSuplementoActionPerformed
        VentanaCrudSuplemento ventana = new VentanaCrudSuplemento(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarSuplementoActionPerformed

    private void itemEditarSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarSuplementoActionPerformed
        VentanaCrudSuplemento ventana = new VentanaCrudSuplemento(this, true);
        ventana.setAccion("editar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarSuplementoActionPerformed

    private void itemReporteXClienteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXClienteFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXClienteFacturaActionPerformed

    private void itemReporteXDisponibilidadHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXDisponibilidadHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXDisponibilidadHabitacionActionPerformed

    private void itemReporteXFechaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXFechaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXFechaReservaActionPerformed

    private void itemBuscarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarHotelActionPerformed
        VentanaCrudHotel ventana = new VentanaCrudHotel(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("buscar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarHotelActionPerformed

    private void itemEliminarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarHotelActionPerformed
        VentanaCrudHotel ventana = new VentanaCrudHotel(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("eliminar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarHotelActionPerformed

    private void itemBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarEmpleadoActionPerformed
        VentanaCrudEmpleado ventana = new VentanaCrudEmpleado(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("buscar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarEmpleadoActionPerformed

    private void itemEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEmpleadoActionPerformed
        VentanaCrudEmpleado ventana = new VentanaCrudEmpleado(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("eliminar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarEmpleadoActionPerformed

    private void itemBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarClienteActionPerformed
        VentanaCrudCliente ventana = new VentanaCrudCliente(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("buscar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarClienteActionPerformed

    private void itemEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarClienteActionPerformed
        VentanaCrudCliente ventana = new VentanaCrudCliente(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setAccion("eliminar");
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarClienteActionPerformed

    private void itemReporteXNombreHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXNombreHotelActionPerformed
        VentanaReporteHotelNombre ventana = new VentanaReporteHotelNombre(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_itemReporteXNombreHotelActionPerformed

    private void itemReporteXCategoriaHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXCategoriaHotelActionPerformed
        VentanaReporteHotelCategoria ventana = new VentanaReporteHotelCategoria(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_itemReporteXCategoriaHotelActionPerformed

    private void itemReporteXNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXNombreClienteActionPerformed
        VentanaReporteClienteNombre ventana = new VentanaReporteClienteNombre(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemReporteXNombreClienteActionPerformed

    private void itemReporteXTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXTelefonoClienteActionPerformed
        VentanaReporteClienteDni ventana = new VentanaReporteClienteDni(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemReporteXTelefonoClienteActionPerformed

    private void itemReporteXTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXTipoEmpleadoActionPerformed
        VentanaReporteEmpleadoNombre ventana = new VentanaReporteEmpleadoNombre(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemReporteXTipoEmpleadoActionPerformed

    private void itemReporteXNivelEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXNivelEmpleadoActionPerformed
        VentanaReporteEmpleadoTipo ventana = new VentanaReporteEmpleadoTipo(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemReporteXNivelEmpleadoActionPerformed

    private void menuHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHabitacionActionPerformed

    private void itemBuscarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarHabitacionActionPerformed
        VentanaCrudHabitacion ventana = new VentanaCrudHabitacion(this, true);
        ventana.setAccion("buscar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarHabitacionActionPerformed

    private void itemEliminarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarHabitacionActionPerformed
        VentanaCrudHabitacion ventana = new VentanaCrudHabitacion(this, true);
        ventana.setAccion("eliminar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarHabitacionActionPerformed

    private void itemBuscarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarEstanciaActionPerformed
        VentanaCrudEstancia ventana = new VentanaCrudEstancia(this, true);
        ventana.setAccion("buscar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarEstanciaActionPerformed

    private void itemEliminarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEstanciaActionPerformed
        VentanaCrudEstancia ventana = new VentanaCrudEstancia(this, true);
        ventana.setAccion("eliminar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarEstanciaActionPerformed

    private void itemBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarReservaActionPerformed
        VentanaCrudReserva ventana = new VentanaCrudReserva(this, true);
        ventana.setAccion("buscar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarReservaActionPerformed

    private void itemEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarReservaActionPerformed
        VentanaCrudReserva ventana = new VentanaCrudReserva(this, true);
        ventana.setAccion("eliminar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarReservaActionPerformed

    private void itemBuscarSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarSuplementoActionPerformed
        VentanaCrudSuplemento ventana = new VentanaCrudSuplemento(this, true);
        ventana.setAccion("agregar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarSuplementoActionPerformed

    private void itemEliminarSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarSuplementoActionPerformed
        VentanaCrudSuplemento ventana = new VentanaCrudSuplemento(this, true);
        ventana.setAccion("eliminar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarSuplementoActionPerformed

    private void itemBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarFacturaActionPerformed
        VentanaCrudFactura ventana = new VentanaCrudFactura(this, true);
        ventana.setAccion("buscar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemBuscarFacturaActionPerformed

    private void itemEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarFacturaActionPerformed
        VentanaCrudFactura ventana = new VentanaCrudFactura(this, true);
        ventana.setAccion("eliminar");
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarFacturaActionPerformed

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarSuperior;
    private javax.swing.JMenuItem itemAgregarCliente;
    private javax.swing.JMenuItem itemAgregarEmpleado;
    private javax.swing.JMenuItem itemAgregarEstancia;
    private javax.swing.JMenuItem itemAgregarFactura;
    private javax.swing.JMenuItem itemAgregarHabitacion;
    private javax.swing.JMenuItem itemAgregarHotel;
    private javax.swing.JMenuItem itemAgregarReserva;
    private javax.swing.JMenuItem itemAgregarSuplemento;
    private javax.swing.JMenuItem itemBuscarCliente;
    private javax.swing.JMenuItem itemBuscarEmpleado;
    private javax.swing.JMenuItem itemBuscarEstancia;
    private javax.swing.JMenuItem itemBuscarFactura;
    private javax.swing.JMenuItem itemBuscarHabitacion;
    private javax.swing.JMenuItem itemBuscarHotel;
    private javax.swing.JMenuItem itemBuscarReserva;
    private javax.swing.JMenuItem itemBuscarSuplemento;
    private javax.swing.JMenuItem itemEditarCliente;
    private javax.swing.JMenuItem itemEditarEmpleado;
    private javax.swing.JMenuItem itemEditarEstancia;
    private javax.swing.JMenuItem itemEditarFactura;
    private javax.swing.JMenuItem itemEditarHabitacion;
    private javax.swing.JMenuItem itemEditarHotel;
    private javax.swing.JMenuItem itemEditarReserva;
    private javax.swing.JMenuItem itemEditarSuplemento;
    private javax.swing.JMenuItem itemEliminarCliente;
    private javax.swing.JMenuItem itemEliminarEmpleado;
    private javax.swing.JMenuItem itemEliminarEstancia;
    private javax.swing.JMenuItem itemEliminarFactura;
    private javax.swing.JMenuItem itemEliminarHabitacion;
    private javax.swing.JMenuItem itemEliminarHotel;
    private javax.swing.JMenuItem itemEliminarReserva;
    private javax.swing.JMenuItem itemEliminarSuplemento;
    private javax.swing.JMenuItem itemReporteXCategoriaHotel;
    private javax.swing.JMenuItem itemReporteXClienteEstancia;
    private javax.swing.JMenuItem itemReporteXClienteFactura;
    private javax.swing.JMenuItem itemReporteXClienteReserva;
    private javax.swing.JMenuItem itemReporteXDisponibilidadHabitacion;
    private javax.swing.JMenuItem itemReporteXFechaFactura;
    private javax.swing.JMenuItem itemReporteXFechaInicioEstancia;
    private javax.swing.JMenuItem itemReporteXFechaReserva;
    private javax.swing.JMenuItem itemReporteXImporteSuplemento;
    private javax.swing.JMenuItem itemReporteXNivelEmpleado;
    private javax.swing.JMenuItem itemReporteXNombreCliente;
    private javax.swing.JMenuItem itemReporteXNombreHotel;
    private javax.swing.JMenuItem itemReporteXTelefonoCliente;
    private javax.swing.JMenuItem itemReporteXTipoEmpleado;
    private javax.swing.JMenuItem itemReporteXTipoHabitacion;
    private javax.swing.JMenuItem itemReporteXTipoSuplemento;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuClienteReportes;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuEmpleadoReportes;
    private javax.swing.JMenu menuEstancia;
    private javax.swing.JMenu menuEstanciaReportes;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenu menuFacturaReportes;
    private javax.swing.JMenu menuHabitacion;
    private javax.swing.JMenu menuHabitacionReportes;
    private javax.swing.JMenu menuHotel;
    private javax.swing.JMenu menuHotelReportes;
    private javax.swing.JMenu menuReserva;
    private javax.swing.JMenu menuReservaReportes;
    private javax.swing.JMenu menuSuplemento;
    private javax.swing.JMenu menuSuplementoReportes;
    // End of variables declaration//GEN-END:variables
}

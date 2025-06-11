
package co.edu.udec.poo.hotelsafaris.vistas.gui;


public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaGeneral
     */
    public VentanaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBarSuperior = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemBuscarUsuario = new javax.swing.JMenuItem();
        itemEditarUsuario = new javax.swing.JMenuItem();
        itemEliminarUsuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuUsuarioReporte = new javax.swing.JMenu();
        itemReporteXNombreUsuario = new javax.swing.JMenuItem();
        itemReporteXCategoriaUsuario = new javax.swing.JMenuItem();
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
        itemAgregarEmpleado5 = new javax.swing.JMenuItem();
        itemBuscarEmpleado5 = new javax.swing.JMenuItem();
        itemEditarEmpleado5 = new javax.swing.JMenuItem();
        itemEliminarEmpleado5 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuSuplementoReportes = new javax.swing.JMenu();
        itemReporteXTipoSuplemento = new javax.swing.JMenuItem();
        itemReporteXImporteSuplemento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Hotelera");

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/usuario24.png"))); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarUsuario.setText("Agregar...");
        itemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemAgregarUsuario);

        itemBuscarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarUsuario.setText("Buscar...");
        menuUsuario.add(itemBuscarUsuario);

        itemEditarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarUsuario.setText("Editar...");
        itemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemEditarUsuario);

        itemEliminarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarUsuario.setText("Eliminar...");
        menuUsuario.add(itemEliminarUsuario);
        menuUsuario.add(jSeparator3);

        menuUsuarioReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
        menuUsuarioReporte.setText("Reportes");
        menuUsuarioReporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXNombreUsuario.setText("Buscar por Nombre...");
        menuUsuarioReporte.add(itemReporteXNombreUsuario);

        itemReporteXCategoriaUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXCategoriaUsuario.setText("Buscar por Categoría...");
        menuUsuarioReporte.add(itemReporteXCategoriaUsuario);

        menuUsuario.add(menuUsuarioReporte);

        MenuBarSuperior.add(menuUsuario);

        menuHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/hotel24.png"))); // NOI18N
        menuHotel.setText("Hotel");
        menuHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarHotel.setText("Agregar...");
        itemAgregarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemAgregarHotel);

        itemBuscarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarHotel.setText("Buscar...");
        menuHotel.add(itemBuscarHotel);

        itemEditarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarHotel.setText("Editar...");
        itemEditarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarHotelActionPerformed(evt);
            }
        });
        menuHotel.add(itemEditarHotel);

        itemEliminarHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarHotel.setText("Eliminar...");
        menuHotel.add(itemEliminarHotel);
        menuHotel.add(jSeparator1);

        menuHotelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
        menuHotelReportes.setText("Reportes");
        menuHotelReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXNombreHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXNombreHotel.setText("Buscar por Nombre...");
        menuHotelReportes.add(itemReporteXNombreHotel);

        itemReporteXCategoriaHotel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXCategoriaHotel.setText("Buscar por Categoría...");
        menuHotelReportes.add(itemReporteXCategoriaHotel);

        menuHotel.add(menuHotelReportes);

        MenuBarSuperior.add(menuHotel);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/cliente24.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarCliente.setText("Agregar...");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemAgregarCliente);

        itemBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarCliente.setText("Buscar...");
        menuCliente.add(itemBuscarCliente);

        itemEditarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarCliente.setText("Editar...");
        itemEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemEditarCliente);

        itemEliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarCliente.setText("Eliminar...");
        menuCliente.add(itemEliminarCliente);
        menuCliente.add(jSeparator4);

        menuClienteReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
        menuClienteReportes.setText("Reportes");
        menuClienteReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXNombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXNombreCliente.setText("Buscar por Nombre...");
        menuClienteReportes.add(itemReporteXNombreCliente);

        itemReporteXTelefonoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXTelefonoCliente.setText("Buscar por Telefono...");
        menuClienteReportes.add(itemReporteXTelefonoCliente);

        menuCliente.add(menuClienteReportes);

        MenuBarSuperior.add(menuCliente);

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/empleado24.png"))); // NOI18N
        menuEmpleado.setText("Empleado");
        menuEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarEmpleado.setText("Agregar...");
        itemAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemAgregarEmpleado);

        itemBuscarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarEmpleado.setText("Buscar...");
        menuEmpleado.add(itemBuscarEmpleado);

        itemEditarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarEmpleado.setText("Editar...");
        itemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(itemEditarEmpleado);

        itemEliminarEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarEmpleado.setText("Eliminar...");
        menuEmpleado.add(itemEliminarEmpleado);
        menuEmpleado.add(jSeparator2);

        menuEmpleadoReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
        menuEmpleadoReportes.setText("Reportes");
        menuEmpleadoReportes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemReporteXTipoEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXTipoEmpleado.setText("Buscar por Tipo...");
        menuEmpleadoReportes.add(itemReporteXTipoEmpleado);

        itemReporteXNivelEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemReporteXNivelEmpleado.setText("Buscar por Nivel Educativo...");
        menuEmpleadoReportes.add(itemReporteXNivelEmpleado);

        menuEmpleado.add(menuEmpleadoReportes);

        MenuBarSuperior.add(menuEmpleado);

        menuEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/estancia24.png"))); // NOI18N
        menuEstancia.setText("Estancia");
        menuEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarEstancia.setText("Agregar...");
        itemAgregarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemAgregarEstancia);

        itemBuscarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarEstancia.setText("Buscar...");
        menuEstancia.add(itemBuscarEstancia);

        itemEditarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarEstancia.setText("Editar...");
        itemEditarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEstanciaActionPerformed(evt);
            }
        });
        menuEstancia.add(itemEditarEstancia);

        itemEliminarEstancia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarEstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarEstancia.setText("Eliminar...");
        menuEstancia.add(itemEliminarEstancia);
        menuEstancia.add(jSeparator5);

        menuEstanciaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
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

        menuFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/factura24.png"))); // NOI18N
        menuFactura.setText("Factura");
        menuFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarFactura.setText("Agregar...");
        itemAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemAgregarFactura);

        itemBuscarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarFactura.setText("Buscar...");
        menuFactura.add(itemBuscarFactura);

        itemEditarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarFactura.setText("Editar...");
        itemEditarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(itemEditarFactura);

        itemEliminarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarFactura.setText("Eliminar...");
        menuFactura.add(itemEliminarFactura);
        menuFactura.add(jSeparator6);

        menuFacturaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
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

        menuHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/habitacion24.png"))); // NOI18N
        menuHabitacion.setText("Habitación");
        menuHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarHabitacion.setText("Agregar...");
        itemAgregarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemAgregarHabitacion);

        itemBuscarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarHabitacion.setText("Buscar...");
        menuHabitacion.add(itemBuscarHabitacion);

        itemEditarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarHabitacion.setText("Editar...");
        itemEditarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarHabitacionActionPerformed(evt);
            }
        });
        menuHabitacion.add(itemEditarHabitacion);

        itemEliminarHabitacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarHabitacion.setText("Eliminar...");
        menuHabitacion.add(itemEliminarHabitacion);
        menuHabitacion.add(jSeparator7);

        menuHabitacionReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
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

        menuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reserva24.png"))); // NOI18N
        menuReserva.setText("Reserva");
        menuReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarReserva.setText("Agregar...");
        itemAgregarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemAgregarReserva);

        itemBuscarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarReserva.setText("Buscar...");
        menuReserva.add(itemBuscarReserva);

        itemEditarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarReserva.setText("Editar...");
        itemEditarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarReservaActionPerformed(evt);
            }
        });
        menuReserva.add(itemEditarReserva);

        itemEliminarReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarReserva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarReserva.setText("Eliminar...");
        menuReserva.add(itemEliminarReserva);
        menuReserva.add(jSeparator8);

        menuReservaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
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

        menuSuplemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/suplemento24.png"))); // NOI18N
        menuSuplemento.setText("Suplemento");
        menuSuplemento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        itemAgregarEmpleado5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarEmpleado5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemAgregarEmpleado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/agregarRegistro20.png"))); // NOI18N
        itemAgregarEmpleado5.setText("Agregar...");
        itemAgregarEmpleado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmpleado5ActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemAgregarEmpleado5);

        itemBuscarEmpleado5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscarEmpleado5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemBuscarEmpleado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/busccar20.png"))); // NOI18N
        itemBuscarEmpleado5.setText("Buscar...");
        menuSuplemento.add(itemBuscarEmpleado5);

        itemEditarEmpleado5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarEmpleado5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEditarEmpleado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/modificar20.png"))); // NOI18N
        itemEditarEmpleado5.setText("Editar...");
        itemEditarEmpleado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEmpleado5ActionPerformed(evt);
            }
        });
        menuSuplemento.add(itemEditarEmpleado5);

        itemEliminarEmpleado5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarEmpleado5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        itemEliminarEmpleado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/eliminar20.png"))); // NOI18N
        itemEliminarEmpleado5.setText("Eliminar...");
        menuSuplemento.add(itemEliminarEmpleado5);
        menuSuplemento.add(jSeparator9);

        menuSuplementoReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/hotelsafaris/vistas/img/reporte20.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarHotelActionPerformed

    private void itemEditarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarHotelActionPerformed

    private void itemAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarEmpleadoActionPerformed

    private void itemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarEmpleadoActionPerformed

    private void itemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuarioActionPerformed
        VentanaUsuarios ventana = new VentanaUsuarios(this, true);
    }//GEN-LAST:event_itemAgregarUsuarioActionPerformed

    private void itemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarUsuarioActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void itemEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarClienteActionPerformed

    private void itemAgregarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarEstanciaActionPerformed

    private void itemEditarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarEstanciaActionPerformed

    private void itemAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarFacturaActionPerformed

    private void itemEditarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarFacturaActionPerformed

    private void itemAgregarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarHabitacionActionPerformed

    private void itemEditarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarHabitacionActionPerformed

    private void itemAgregarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarReservaActionPerformed

    private void itemEditarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarReservaActionPerformed

    private void itemAgregarEmpleado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmpleado5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarEmpleado5ActionPerformed

    private void itemEditarEmpleado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleado5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarEmpleado5ActionPerformed

    private void itemReporteXClienteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXClienteFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXClienteFacturaActionPerformed

    private void itemReporteXDisponibilidadHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXDisponibilidadHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXDisponibilidadHabitacionActionPerformed

    private void itemReporteXFechaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteXFechaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteXFechaReservaActionPerformed

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
    private javax.swing.JMenuItem itemAgregarEmpleado5;
    private javax.swing.JMenuItem itemAgregarEstancia;
    private javax.swing.JMenuItem itemAgregarFactura;
    private javax.swing.JMenuItem itemAgregarHabitacion;
    private javax.swing.JMenuItem itemAgregarHotel;
    private javax.swing.JMenuItem itemAgregarReserva;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenuItem itemBuscarCliente;
    private javax.swing.JMenuItem itemBuscarEmpleado;
    private javax.swing.JMenuItem itemBuscarEmpleado5;
    private javax.swing.JMenuItem itemBuscarEstancia;
    private javax.swing.JMenuItem itemBuscarFactura;
    private javax.swing.JMenuItem itemBuscarHabitacion;
    private javax.swing.JMenuItem itemBuscarHotel;
    private javax.swing.JMenuItem itemBuscarReserva;
    private javax.swing.JMenuItem itemBuscarUsuario;
    private javax.swing.JMenuItem itemEditarCliente;
    private javax.swing.JMenuItem itemEditarEmpleado;
    private javax.swing.JMenuItem itemEditarEmpleado5;
    private javax.swing.JMenuItem itemEditarEstancia;
    private javax.swing.JMenuItem itemEditarFactura;
    private javax.swing.JMenuItem itemEditarHabitacion;
    private javax.swing.JMenuItem itemEditarHotel;
    private javax.swing.JMenuItem itemEditarReserva;
    private javax.swing.JMenuItem itemEditarUsuario;
    private javax.swing.JMenuItem itemEliminarCliente;
    private javax.swing.JMenuItem itemEliminarEmpleado;
    private javax.swing.JMenuItem itemEliminarEmpleado5;
    private javax.swing.JMenuItem itemEliminarEstancia;
    private javax.swing.JMenuItem itemEliminarFactura;
    private javax.swing.JMenuItem itemEliminarHabitacion;
    private javax.swing.JMenuItem itemEliminarHotel;
    private javax.swing.JMenuItem itemEliminarReserva;
    private javax.swing.JMenuItem itemEliminarUsuario;
    private javax.swing.JMenuItem itemReporteXCategoriaHotel;
    private javax.swing.JMenuItem itemReporteXCategoriaUsuario;
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
    private javax.swing.JMenuItem itemReporteXNombreUsuario;
    private javax.swing.JMenuItem itemReporteXTelefonoCliente;
    private javax.swing.JMenuItem itemReporteXTipoEmpleado;
    private javax.swing.JMenuItem itemReporteXTipoHabitacion;
    private javax.swing.JMenuItem itemReporteXTipoSuplemento;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
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
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuUsuarioReporte;
    // End of variables declaration//GEN-END:variables
}

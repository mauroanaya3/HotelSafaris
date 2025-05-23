package co.edu.udec.poo.hotelsafaris;

import co.edu.udec.poo.hotelsafaris.modelo.crud.*;
import co.edu.udec.poo.hotelsafaris.modelo.entidades.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Empleados");
            System.out.println("3. Gestionar Suplementos");
            System.out.println("4. Gestionar Actividades");
            System.out.println("5. Gestionar Estancias");
            System.out.println("6. Gestionar Facturas");
            System.out.println("7. Gestionar Reservas");
            System.out.println("8. Gestionar Habitaciones");
            System.out.println("9. Gestionar Hoteles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 ->
                    menuClientes(entrada);
                case 2 ->
                    menuEmpleados(entrada);
                case 3 ->
                    menuSuplementos(entrada);
                case 4 ->
                    menuActividades(entrada);
                case 5 ->
                    menuEstancias(entrada);
                case 6 ->
                    menuFacturas(entrada);
                case 7 ->
                    menuReservas(entrada);
                case 8 ->
                    menuHabitaciones(entrada);
                case 9 ->
                    menuHoteles(entrada);
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        entrada.close();
    }

    // Menu Clientes
    public static void menuClientes(Scanner entrada) {
        int opcion;

        do {
            System.out.println("\n--- CRUD CLIENTES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("DNI: ");
                        String dni = entrada.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Direccion: ");
                        String direccion = entrada.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = entrada.nextLine();

                        Cliente c = new Cliente(dni, nombre, direccion, telefono);
                        ClienteCrud.agregar(c);
                        System.out.println("Cliente agregado correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Ingrese DNI a buscar: ");
                        String dni = entrada.nextLine();
                        Cliente c = ClienteCrud.buscar(dni);
                        System.out.println("Cliente encontrado: " + c);
                    }
                    case 3 -> {
                        System.out.print("Ingrese DNI del cliente a editar: ");
                        String dni = entrada.nextLine();
                        Cliente c = ClienteCrud.buscar(dni);

                        System.out.print("Nuevo nombre: ");
                        c.setNombre(entrada.nextLine());
                        System.out.print("Nueva direccion: ");
                        c.setDireccion(entrada.nextLine());
                        System.out.print("Nuevo telefono: ");
                        c.setTelefono(entrada.nextLine());

                        ClienteCrud.editar(c);
                        System.out.println("Cliente editado correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Ingrese DNI a eliminar: ");
                        String dni = entrada.nextLine();
                        ClienteCrud.eliminar(dni);
                        System.out.println("Cliente eliminado correctamente.");
                    }
                    case 5 -> {
                        for (Cliente c : ClienteCrud.listarTodo()) {
                            System.out.println(c);
                        }
                    }
                    case 6 ->
                        System.out.println("Total clientes: " + ClienteCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 7);
    }

    // Menu Empleados
    public static void menuEmpleados(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD EMPLEADOS ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("DNI: ");
                        String dni = entrada.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Direccion: ");
                        String direccion = entrada.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = entrada.nextLine();
                        System.out.print("Nivel educativo: ");
                        String nivel = entrada.nextLine();
                        System.out.print("Tipo: ");
                        String tipo = entrada.nextLine();
                        Empleado e = new Empleado(dni, nombre, direccion, telefono, nivel, tipo, null);
                        EmpleadoCrud.agregar(e);
                        System.out.println("Empleado agregado correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Ingrese DNI a buscar: ");
                        Empleado e = EmpleadoCrud.buscar(entrada.nextLine());
                        System.out.println("Empleado encontrado: " + e);
                    }
                    case 3 -> {
                        System.out.print("Ingrese DNI del empleado a editar: ");
                        Empleado e = EmpleadoCrud.buscar(entrada.nextLine());
                        System.out.print("Nuevo nombre: ");
                        e.setNombre(entrada.nextLine());
                        System.out.print("Nueva direccion: ");
                        e.setDireccion(entrada.nextLine());
                        System.out.print("Nuevo telefono: ");
                        e.setTelefono(entrada.nextLine());
                        System.out.print("Nuevo nivel educativo: ");
                        e.setNivelEducativo(entrada.nextLine());
                        System.out.print("Nuevo tipo: ");
                        e.setTipo(entrada.nextLine());
                        EmpleadoCrud.editar(e);
                        System.out.println("Empleado editado correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Ingrese DNI a eliminar: ");
                        EmpleadoCrud.eliminar(entrada.nextLine());
                        System.out.println("Empleado eliminado correctamente.");
                    }
                    case 5 ->
                        EmpleadoCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total empleados: " + EmpleadoCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Suplementos
    public static void menuSuplementos(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD SUPLEMENTOS ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Tipo de suplemento: ");
                        String tipo = entrada.nextLine();
                        System.out.print("Importe: ");
                        double importe = entrada.nextDouble();
                        entrada.nextLine();
                        Suplemento s = new Suplemento(tipo, importe);
                        SuplementoCrud.agregar(s);
                        System.out.println("Suplemento agregado correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Ingrese tipo a buscar: ");
                        Suplemento s = SuplementoCrud.buscar(entrada.nextLine());
                        System.out.println("Suplemento encontrado: " + s);
                    }
                    case 3 -> {
                        System.out.print("Ingrese tipo del suplemento a editar: ");
                        Suplemento s = SuplementoCrud.buscar(entrada.nextLine());
                        System.out.print("Nuevo importe: ");
                        s.setImporte(entrada.nextDouble());
                        entrada.nextLine();
                        SuplementoCrud.editar(s);
                        System.out.println("Suplemento editado correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Ingrese tipo a eliminar: ");
                        SuplementoCrud.eliminar(entrada.nextLine());
                        System.out.println("Suplemento eliminado correctamente.");
                    }
                    case 5 ->
                        SuplementoCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total suplementos: " + SuplementoCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Actividades
    public static void menuActividades(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD ACTIVIDADES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Código: ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = entrada.nextLine();
                        System.out.print("Horario: ");
                        String horario = entrada.nextLine();
                        System.out.print("¿Es gratuito? (true/false): ");
                        boolean gratuito = entrada.nextBoolean();
                        entrada.nextLine();
                        System.out.print("Precio: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();
                        Actividad a = new Actividad(codigo, nombre, descripcion, horario, new ArrayList<>(), gratuito, precio, null);
                        ActividadCrud.agregar(a);
                        System.out.println("Actividad agregada correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Ingrese código a buscar: ");
                        Actividad a = ActividadCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Actividad encontrada: " + a);
                    }
                    case 3 -> {
                        System.out.print("Ingrese código de la actividad a editar: ");
                        Actividad a = ActividadCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Nuevo nombre: ");
                        a.setNombre(entrada.nextLine());
                        System.out.print("Nueva descripción: ");
                        a.setDescripcion(entrada.nextLine());
                        System.out.print("Nuevo horario: ");
                        a.setHorario(entrada.nextLine());
                        System.out.print("¿Es gratuito? (true/false): ");
                        a.setGratuito(entrada.nextBoolean());
                        entrada.nextLine();
                        System.out.print("Nuevo precio: ");
                        a.setPrecio(entrada.nextDouble());
                        entrada.nextLine();
                        ActividadCrud.editar(a);
                        System.out.println("Actividad editada correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Ingrese código a eliminar: ");
                        ActividadCrud.eliminar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Actividad eliminada correctamente.");
                    }
                    case 5 ->
                        ActividadCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total actividades: " + ActividadCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Estancias
    public static void menuSuplementos(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD SUPLEMENTOS ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Tipo de suplemento: ");
                        String tipo = entrada.nextLine();
                        System.out.print("Importe: ");
                        double importe = entrada.nextDouble();
                        entrada.nextLine();
                        Suplemento s = new Suplemento(tipo, importe);
                        SuplementoCrud.agregar(s);
                        System.out.println("Suplemento agregado correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Ingrese tipo a buscar: ");
                        Suplemento s = SuplementoCrud.buscar(entrada.nextLine());
                        System.out.println("Suplemento encontrado: " + s);
                    }
                    case 3 -> {
                        System.out.print("Ingrese tipo del suplemento a editar: ");
                        Suplemento s = SuplementoCrud.buscar(entrada.nextLine());
                        System.out.print("Nuevo importe: ");
                        s.setImporte(entrada.nextDouble());
                        entrada.nextLine();
                        SuplementoCrud.editar(s);
                        System.out.println("Suplemento editado correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Ingrese tipo a eliminar: ");
                        SuplementoCrud.eliminar(entrada.nextLine());
                        System.out.println("Suplemento eliminado correctamente.");
                    }
                    case 5 ->
                        SuplementoCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total suplementos: " + SuplementoCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Actividades
    public static void menuFacturas(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD FACTURAS ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("ID factura: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("ID de estancia existente: ");
                        Estancia estancia = EstanciaCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Fecha de emisión: ");
                        String fecha = entrada.nextLine();
                        System.out.print("Total habitaciones: ");
                        double totalHabitaciones = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Total suplementos: ");
                        double totalSuplementos = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Total actividades: ");
                        double totalActividades = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Anticipo descontado: ");
                        double anticipo = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Total a pagar: ");
                        double totalPagar = entrada.nextDouble();
                        entrada.nextLine();

                        Factura f = new Factura(id, estancia, fecha, totalHabitaciones, totalSuplementos,
                                totalActividades, anticipo, totalPagar);
                        FacturaCrud.agregar(f);
                        System.out.println("Factura agregada correctamente.");
                    }
                    case 2 -> {
                        System.out.print("ID a buscar: ");
                        Factura f = FacturaCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Factura encontrada: " + f);
                    }
                    case 3 -> {
                        System.out.print("ID de la factura a editar: ");
                        Factura f = FacturaCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Nueva fecha de emisión: ");
                        f.setFechaEmision(entrada.nextLine());
                        System.out.print("Nuevo total habitaciones: ");
                        f.setTotalHabitaciones(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("Nuevo total suplementos: ");
                        f.setTotalSuplementos(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("Nuevo total actividades: ");
                        f.setTotalActividades(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("Nuevo anticipo descontado: ");
                        f.setAnticipoDescontado(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("Nuevo total a pagar: ");
                        f.setTotalPagar(entrada.nextDouble());
                        entrada.nextLine();
                        FacturaCrud.editar(f);
                        System.out.println("Factura editada correctamente.");
                    }
                    case 4 -> {
                        System.out.print("ID a eliminar: ");
                        FacturaCrud.eliminar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Factura eliminada correctamente.");
                    }
                    case 5 ->
                        FacturaCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total facturas: " + FacturaCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Reservas
    public static void menuReservas(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD RESERVAS ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("ID de reserva: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("DNI del cliente: ");
                        Cliente cliente = ClienteCrud.buscar(entrada.nextLine());
                        System.out.print("Código del hotel: ");
                        Hotel hotel = HotelCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Fecha inicio: ");
                        String fechaInicio = entrada.nextLine();
                        System.out.print("Fecha fin: ");
                        String fechaFin = entrada.nextLine();
                        System.out.print("Anticipo: ");
                        double anticipo = entrada.nextDouble();
                        entrada.nextLine();

                        Reserva r = new Reserva(id, cliente, hotel, new ArrayList<>(), fechaInicio, fechaFin, anticipo, false, "Pendiente");
                        ReservaCrud.agregar(r);
                        System.out.println("Reserva agregada correctamente.");
                    }
                    case 2 -> {
                        System.out.print("ID a buscar: ");
                        Reserva r = ReservaCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Reserva encontrada: " + r);
                    }
                    case 3 -> {
                        System.out.print("ID de la reserva a editar: ");
                        Reserva r = ReservaCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Nueva fecha inicio: ");
                        r.setFechaInicio(entrada.nextLine());
                        System.out.print("Nueva fecha fin: ");
                        r.setFechaFin(entrada.nextLine());
                        System.out.print("Nuevo anticipo: ");
                        r.setAnticipo(entrada.nextDouble());
                        entrada.nextLine();
                        System.out.print("¿Confirmada? (true/false): ");
                        r.setConfirmada(entrada.nextBoolean());
                        entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        r.setEstado(entrada.nextLine());
                        ReservaCrud.editar(r);
                        System.out.println("Reserva editada correctamente.");
                    }
                    case 4 -> {
                        System.out.print("ID a eliminar: ");
                        ReservaCrud.eliminar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Reserva eliminada correctamente.");
                    }
                    case 5 ->
                        ReservaCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total reservas: " + ReservaCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Habitaciones
    public static void menuHabitaciones(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD HABITACIONES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Número de habitación: ");
                        int numero = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Tipo: ");
                        String tipo = entrada.nextLine();
                        System.out.print("Disponible (true/false): ");
                        boolean disponible = entrada.nextBoolean();
                        entrada.nextLine();
                        System.out.print("Precio base: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();

                        Habitacion h = new Habitacion(numero, tipo, disponible, precio, new ArrayList<>(), null);
                        HabitacionCrud.agregar(h);
                        System.out.println("Habitación agregada correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Número a buscar: ");
                        Habitacion h = HabitacionCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Habitación encontrada: " + h);
                    }
                    case 3 -> {
                        System.out.print("Número de la habitación a editar: ");
                        Habitacion h = HabitacionCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Nuevo tipo: ");
                        h.setTipo(entrada.nextLine());
                        System.out.print("Disponible (true/false): ");
                        h.setDisponible(entrada.nextBoolean());
                        entrada.nextLine();
                        System.out.print("Nuevo precio base: ");
                        h.setPrecioBase(entrada.nextDouble());
                        entrada.nextLine();
                        HabitacionCrud.editar(h);
                        System.out.println("Habitación editada correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Número a eliminar: ");
                        HabitacionCrud.eliminar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Habitación eliminada correctamente.");
                    }
                    case 5 ->
                        HabitacionCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total habitaciones: " + HabitacionCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

    // Menu Hoteles
    public static void menuHoteles(Scanner entrada) {
        int opcion;
        do {
            System.out.println("\n--- CRUD HOTELES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar todos");
            System.out.println("6. Contar todos");
            System.out.println("7. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Código del hotel: ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Categoría: ");
                        String categoria = entrada.nextLine();
                        System.out.print("Direccion: ");
                        String direccion = entrada.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = entrada.nextLine();

                        Hotel h = new Hotel(codigo, nombre, categoria, direccion, telefono, null);
                        HotelCrud.agregar(h);
                        System.out.println("Hotel agregado correctamente.");
                    }
                    case 2 -> {
                        System.out.print("Código a buscar: ");
                        Hotel h = HotelCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Hotel encontrado: " + h);
                    }
                    case 3 -> {
                        System.out.print("Código del hotel a editar: ");
                        Hotel h = HotelCrud.buscar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.print("Nuevo nombre: ");
                        h.setNombre(entrada.nextLine());
                        System.out.print("Nueva categoría: ");
                        h.setCategoria(entrada.nextLine());
                        System.out.print("Nueva direccion: ");
                        h.setDireccion(entrada.nextLine());
                        System.out.print("Nuevo telefono: ");
                        h.setTelefono(entrada.nextLine());
                        HotelCrud.editar(h);
                        System.out.println("Hotel editado correctamente.");
                    }
                    case 4 -> {
                        System.out.print("Código a eliminar: ");
                        HotelCrud.eliminar(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Hotel eliminado correctamente.");
                    }
                    case 5 ->
                        HotelCrud.listarTodo().forEach(System.out::println);
                    case 6 ->
                        System.out.println("Total hoteles: " + HotelCrud.contar());
                    case 7 ->
                        System.out.println("Volviendo al menu principal...");
                    default ->
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }

}

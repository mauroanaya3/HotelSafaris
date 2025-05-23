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
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> menuClientes(entrada);
                case 2 -> menuEmpleados(entrada);
                case 3 -> menuSuplementos(entrada);
                case 4 -> menuActividades(entrada);
                case 5 -> menuEstancias(entrada);
                case 6 -> menuFacturas(entrada);
                case 7 -> menuReservas(entrada);
                case 8 -> menuHabitaciones(entrada);
                case 9 -> menuHoteles(entrada);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
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
            System.out.println("7. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("DNI: ");
                        String dni = entrada.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Dirección: ");
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
                        System.out.print("Nueva dirección: ");
                        c.setDireccion(entrada.nextLine());
                        System.out.print("Nuevo teléfono: ");
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
                    case 6 -> System.out.println("Total clientes: " + ClienteCrud.contar());
                    case 7 -> System.out.println("Volviendo al menú principal...");
                    default -> System.out.println("Opción no válida.");
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
        System.out.println("7. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        opcion = entrada.nextInt(); entrada.nextLine();

        try {
            switch (opcion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = entrada.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Dirección: ");
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
                    System.out.print("Nueva dirección: ");
                    e.setDireccion(entrada.nextLine());
                    System.out.print("Nuevo teléfono: ");
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
                case 5 -> EmpleadoCrud.listarTodo().forEach(System.out::println);
                case 6 -> System.out.println("Total empleados: " + EmpleadoCrud.contar());
                case 7 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
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
        System.out.println("7. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        opcion = entrada.nextInt(); entrada.nextLine();

        try {
            switch (opcion) {
                case 1 -> {
                    System.out.print("Tipo de suplemento: ");
                    String tipo = entrada.nextLine();
                    System.out.print("Importe: ");
                    double importe = entrada.nextDouble(); entrada.nextLine();
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
                    s.setImporte(entrada.nextDouble()); entrada.nextLine();
                    SuplementoCrud.editar(s);
                    System.out.println("Suplemento editado correctamente.");
                }
                case 4 -> {
                    System.out.print("Ingrese tipo a eliminar: ");
                    SuplementoCrud.eliminar(entrada.nextLine());
                    System.out.println("Suplemento eliminado correctamente.");
                }
                case 5 -> SuplementoCrud.listarTodo().forEach(System.out::println);
                case 6 -> System.out.println("Total suplementos: " + SuplementoCrud.contar());
                case 7 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
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
        System.out.println("7. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        opcion = entrada.nextInt(); entrada.nextLine();

        try {
            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    int codigo = entrada.nextInt(); entrada.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = entrada.nextLine();
                    System.out.print("Horario: ");
                    String horario = entrada.nextLine();
                    System.out.print("¿Es gratuito? (true/false): ");
                    boolean gratuito = entrada.nextBoolean(); entrada.nextLine();
                    System.out.print("Precio: ");
                    double precio = entrada.nextDouble(); entrada.nextLine();
                    Actividad a = new Actividad(codigo, nombre, descripcion, horario, new ArrayList<>(), gratuito, precio, null);
                    ActividadCrud.agregar(a);
                    System.out.println("Actividad agregada correctamente.");
                }
                case 2 -> {
                    System.out.print("Ingrese código a buscar: ");
                    Actividad a = ActividadCrud.buscar(entrada.nextInt()); entrada.nextLine();
                    System.out.println("Actividad encontrada: " + a);
                }
                case 3 -> {
                    System.out.print("Ingrese código de la actividad a editar: ");
                    Actividad a = ActividadCrud.buscar(entrada.nextInt()); entrada.nextLine();
                    System.out.print("Nuevo nombre: "); a.setNombre(entrada.nextLine());
                    System.out.print("Nueva descripción: "); a.setDescripcion(entrada.nextLine());
                    System.out.print("Nuevo horario: "); a.setHorario(entrada.nextLine());
                    System.out.print("¿Es gratuito? (true/false): "); a.setGratuito(entrada.nextBoolean()); entrada.nextLine();
                    System.out.print("Nuevo precio: "); a.setPrecio(entrada.nextDouble()); entrada.nextLine();
                    ActividadCrud.editar(a);
                    System.out.println("Actividad editada correctamente.");
                }
                case 4 -> {
                    System.out.print("Ingrese código a eliminar: ");
                    ActividadCrud.eliminar(entrada.nextInt()); entrada.nextLine();
                    System.out.println("Actividad eliminada correctamente.");
                }
                case 5 -> ActividadCrud.listarTodo().forEach(System.out::println);
                case 6 -> System.out.println("Total actividades: " + ActividadCrud.contar());
                case 7 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    } while (opcion != 7);
}

    // Menu Estancias
    
}

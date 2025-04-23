package co.edu.udec.poo.hotelsafaris;


import co.edu.udec.poo.hotelsafaris.modelo.entidades.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("123456789", "Carlos Pérez", "Calle 123, Cartagena", "3001234567");

        // Crear hotel
        Hotel hotel1 = new Hotel(1, "Safari'S Caribe", "5", "Cartagena, Colombia", "6051234567", null);

        // Crear director del hotel
        Empleado director = new Empleado("987654321", "Lucía Mendoza", "Centro Histórico", "3059876543",
                "Profesional", "director", hotel1);
        hotel1.setDirector(director);
        hotel1.agregarEmpleado(director);

        // Crear habitación
        Habitacion hab1 = new Habitacion(101, "doble", true, 250000, hotel1);
        Suplemento s1 = new Suplemento("vista al mar", 50000);
        hab1.agregarSuplemento(s1);
        hotel1.agregarHabitacion(hab1);

        // Mostrar datos básicos
        System.out.println("=== CLIENTE ===\n" + cliente1);
        System.out.println("\n=== HOTEL ===\n" + hotel1);
        System.out.println("\n=== HABITACIÓN ===\n" + hab1);

        // Crear reserva
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(hab1);
        Date hoy = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        cal.add(Calendar.DAY_OF_MONTH, 2); // 2 días después
        Date fin = cal.getTime();

        Reserva reserva = new Reserva(1, cliente1, hotel1, habitaciones, hoy, fin, 100000, true, "Activa");

        // Crear estancia basada en la reserva
        Estancia estancia = new Estancia(1, reserva, habitaciones, hoy, fin);

        // Crear actividad y asignarla
        List<String> dias = Arrays.asList("Lunes", "Miércoles");
        Actividad act1 = new Actividad(101, "Tour Playa Blanca", "Excursión guiada", "10:00 AM",
                dias, false, 60000, director);
        estancia.agregarActividad(act1);

        // Crear factura de la estancia
        Factura factura = new Factura(1, estancia, new Date(), reserva.calcularPrecio());

        // Mostrar resultados
        System.out.println("\n=== RESERVA ===\n" + reserva);
        System.out.println("\n=== ESTANCIA ===\n" + estancia);
        System.out.println("\n=== FACTURA ===\n" + factura);
    }
}

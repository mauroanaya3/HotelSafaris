
package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Habitacion;
import java.util.ArrayList;

public class HabitacionCrud {
    private static ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();

    public static void agregar(Habitacion habitacion) throws Exception {
        for (Habitacion h : listaHabitaciones) {
            if (h.getNumero() == habitacion.getNumero()) {
                throw new Exception("Ya existe una habitación con número: " + habitacion.getNumero());
            }
        }
        listaHabitaciones.add(habitacion);
    }

    public static Habitacion buscar(int numero) throws Exception {
        for (Habitacion h : listaHabitaciones) {
            if (h.getNumero() == numero) {
                return h;
            }
        }
        throw new Exception("Habitación no encontrada con número: " + numero);
    }

    public static void editar(Habitacion habitacion) throws Exception {
        Habitacion existente = buscar(habitacion.getNumero());
        existente.setTipo(habitacion.getTipo());
        existente.setDisponible(habitacion.isDisponible());
        existente.setPrecioBase(habitacion.getPrecioBase());
        existente.setSuplementos(habitacion.getSuplementos());
        existente.setHotel(habitacion.getHotel());
    }

    public static void eliminar(int numero) throws Exception {
        Habitacion h = buscar(numero);
        listaHabitaciones.remove(h);
    }

    public static ArrayList<Habitacion> listarTodo() throws Exception {
        if (listaHabitaciones.isEmpty()) {
            throw new Exception("No hay habitaciones registradas.");
        }
        return listaHabitaciones;
    }

    public static int contar() {
        return listaHabitaciones.size();
    }
}

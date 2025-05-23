package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Reserva;
import java.util.ArrayList;

public class ReservaCrud {
    private static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public static void agregar(Reserva reserva) throws Exception {
        for (Reserva r : listaReservas) {
            if (r.getId() == reserva.getId()) {
                throw new Exception("Ya existe una reserva con ID: " + reserva.getId());
            }
        }
        listaReservas.add(reserva);
    }

    public static Reserva buscar(int id) throws Exception {
        for (Reserva r : listaReservas) {
            if (r.getId() == id) {
                return r;
            }
        }
        throw new Exception("Reserva no encontrada con ID: " + id);
    }

    public static void editar(Reserva reserva) throws Exception {
        Reserva existente = buscar(reserva.getId());
        existente.setCliente(reserva.getCliente());
        existente.setHotel(reserva.getHotel());
        existente.setHabitacionesReservadas(reserva.getHabitacionesReservadas());
        existente.setFechaInicio(reserva.getFechaInicio());
        existente.setFechaFin(reserva.getFechaFin());
        existente.setAnticipo(reserva.getAnticipo());
        existente.setConfirmada(reserva.isConfirmada());
        existente.setEstado(reserva.getEstado());
    }

    public static void eliminar(int id) throws Exception {
        Reserva r = buscar(id);
        listaReservas.remove(r);
    }

    public static ArrayList<Reserva> listarTodo() throws Exception {
        if (listaReservas.isEmpty()) {
            throw new Exception("No hay reservas registradas.");
        }
        return listaReservas;
    }

    public static int contar() {
        return listaReservas.size();
    }
}

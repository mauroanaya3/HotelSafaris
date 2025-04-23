package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.*;

public class Estancia {
    private int id;
    private Reserva reserva;
    private List<Habitacion> habitacionesOcupadas;
    private Date fechaInicio;
    private Date fechaFin;
    List<Actividad> actividadesContratadas;

    public Estancia(int id, Reserva reserva, List<Habitacion> habitacionesOcupadas,
                    Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.reserva = reserva;
        this.habitacionesOcupadas = habitacionesOcupadas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.actividadesContratadas = new ArrayList<>();
    }

    public void agregarActividad(Actividad a) {
        actividadesContratadas.add(a);
    }

    public double calcularTotalEstancia() {
        double totalHabitaciones = habitacionesOcupadas.stream()
                .mapToDouble(Habitacion::calcularPrecioTotal)
                .sum();
        double totalActividades = actividadesContratadas.stream()
                .mapToDouble(Actividad::calcularCostoCliente)
                .sum();
        return totalHabitaciones + totalActividades;
    }

    public boolean validarCondicionesReserva() {
        return reserva != null && reserva.validarFechas();
    }

    @Override
    public String toString() {
        return "Estancia ID: " + id +
               "\nReserva: " + reserva +
               "\nFecha Ingreso: " + fechaInicio +
               "\nFecha Salida: " + fechaFin +
               "\nActividades: " + actividadesContratadas.size();
    }
}

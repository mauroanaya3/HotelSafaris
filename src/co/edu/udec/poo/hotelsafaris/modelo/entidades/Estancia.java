package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.*;
import java.util.logging.Logger;

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
    
    public Estancia() {}

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

    public int getId() {
        return id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public List<Habitacion> getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public List<Actividad> getActividadesContratadas() {
        return actividadesContratadas;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setHabitacionesOcupadas(List<Habitacion> habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setActividadesContratadas(List<Actividad> actividadesContratadas) {
        this.actividadesContratadas = actividadesContratadas;
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

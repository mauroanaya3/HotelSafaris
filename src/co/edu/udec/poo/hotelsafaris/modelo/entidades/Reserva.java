package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.*;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Hotel hotel;
    private List<Habitacion> habitacionesReservadas;
    private Date fechaInicio;
    private Date fechaFin;
    private double anticipo;
    private boolean confirmada;
    private String estado;

    public Reserva(int id, Cliente cliente, Hotel hotel, List<Habitacion> habitacionesReservadas,
                   Date fechaInicio, Date fechaFin, double anticipo, boolean confirmada, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.hotel = hotel;
        this.habitacionesReservadas = habitacionesReservadas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.anticipo = anticipo;
        this.confirmada = confirmada;
        this.estado = estado;
    }

    public boolean validarFechas() {
        return fechaInicio.before(fechaFin);
    }

    public double calcularPrecio() {
        return habitacionesReservadas.stream()
                .mapToDouble(Habitacion::calcularPrecioTotal)
                .sum();
    }

    public void cancelarReserva(String motivo) {
        this.estado = "Cancelada - " + motivo;
        this.confirmada = false;
    }

    @Override
    public String toString() {
        return "Reserva #" + id + "\nCliente: " + cliente.getNombre() +
               "\nHotel: " + hotel.getNombre() +
               "\nEstado: " + estado +
               "\nConfirmada: " + confirmada +
               "\nAnticipo: $" + anticipo;
    }
}

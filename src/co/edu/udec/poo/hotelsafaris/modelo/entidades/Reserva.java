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

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public List<Habitacion> getHabitacionesReservadas() {
        return habitacionesReservadas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public double getAnticipo() {
        return anticipo;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setHabitacionesReservadas(List<Habitacion> habitacionesReservadas) {
        this.habitacionesReservadas = habitacionesReservadas;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

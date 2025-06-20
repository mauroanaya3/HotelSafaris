package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;
    private double precioBase;
    private List<Suplemento> suplementos = new ArrayList<>();
    private Hotel hotel;

    public Habitacion(int numero, String tipo, boolean disponible, double precioBase, Hotel hotel) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = disponible;
        this.precioBase = precioBase;
        this.hotel = hotel;
    }
    
    public Habitacion() {}

    public void agregarSuplemento(Suplemento s) {
        suplementos.add(s);
    }

    public double calcularPrecioTotal() {
        return precioBase + suplementos.stream().mapToDouble(Suplemento::getImporte).sum();
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public List<Suplemento> getSuplementos() {
        return suplementos;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setSuplementos(List<Suplemento> suplementos) {
        this.suplementos = suplementos;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /*@Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") - Precio base: $" + precioBase +
               "\nDisponibilidad: " + (disponible ? "Sí" : "No") +
               "\nSuplementos: " + suplementos.toString();
    }*/
    
    @Override
    public String toString() {
        return "Habitación " + numero + " - " + 
               (hotel != null ? hotel.getNombre() : "Sin hotel") + 
               " (" + (disponible ? "Disponible" : "Ocupada") + ")";
    }
}

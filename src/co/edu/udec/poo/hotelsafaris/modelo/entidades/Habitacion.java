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

    public void agregarSuplemento(Suplemento s) {
        suplementos.add(s);
    }

    public double calcularPrecioTotal() {
        return precioBase + suplementos.stream().mapToDouble(Suplemento::getImporte).sum();
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") - Precio base: $" + precioBase +
               "\nDisponibilidad: " + (disponible ? "Sí" : "No") +
               "\nSuplementos: " + suplementos.toString();
    }
}

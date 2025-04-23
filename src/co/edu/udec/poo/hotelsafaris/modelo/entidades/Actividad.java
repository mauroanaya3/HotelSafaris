package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.List;

public class Actividad {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String horario;
    private List<String> diasSemana;
    private boolean gratuito;
    private double precio;
    private Empleado animador;

    public Actividad(int codigo, String nombre, String descripcion, String horario,
                     List<String> diasSemana, boolean gratuito, double precio, Empleado animador) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.diasSemana = diasSemana;
        this.gratuito = gratuito;
        this.precio = precio;
        this.animador = animador;
    }

    public double calcularCostoCliente() {
        return gratuito ? 0.0 : precio;
    }

    public String verDetalles() {
        return nombre + " - " + descripcion + " (" + horario + ")";
    }

    @Override
    public String toString() {
        return "Actividad: " + nombre +
               "\nHorario: " + horario +
               "\nAnimador: " + (animador != null ? animador.getNombre() : "Sin asignar");
    }
}

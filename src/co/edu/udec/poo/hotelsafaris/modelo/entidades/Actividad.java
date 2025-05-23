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

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public double getPrecio() {
        return precio;
    }

    public Empleado getAnimador() {
        return animador;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setDiasSemana(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAnimador(Empleado animador) {
        this.animador = animador;
    }

    @Override
    public String toString() {
        return "Actividad: " + nombre +
               "\nHorario: " + horario +
               "\nAnimador: " + (animador != null ? animador.getNombre() : "Sin asignar");
    }
}

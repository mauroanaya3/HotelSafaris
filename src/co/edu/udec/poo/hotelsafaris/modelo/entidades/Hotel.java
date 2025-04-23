package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int codigo;
    private String nombre;
    private String categoria;
    private String direccion;
    private String telefono;
    private Empleado director;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Habitacion> habitaciones = new ArrayList<>();

    public Hotel(int codigo, String nombre, String categoria, String direccion, String telefono, Empleado director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Hotel: " + nombre + " (" + categoria + " estrellas)\nDirección: " + direccion +
               "\nTeléfono: " + telefono +
               "\nDirector: " + (director != null ? director.getNombre() : "No asignado") +
               "\nHabitaciones: " + habitaciones.size() +
               "\nEmpleados: " + empleados.size();
    }
}

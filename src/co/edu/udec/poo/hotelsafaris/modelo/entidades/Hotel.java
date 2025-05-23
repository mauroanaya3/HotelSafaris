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

    public int getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Empleado getDirector() {
        return director;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
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

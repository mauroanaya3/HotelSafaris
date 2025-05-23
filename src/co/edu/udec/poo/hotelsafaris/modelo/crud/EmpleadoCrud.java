package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Empleado;
import java.util.ArrayList;

public class EmpleadoCrud {
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public static void agregar(Empleado empleado) throws Exception {
        for (Empleado e : listaEmpleados) {
            if (e.getDni().equals(empleado.getDni())) {
                throw new Exception("Ya existe un empleado con DNI: " + empleado.getDni());
            }
        }
        listaEmpleados.add(empleado);
    }

    public static Empleado buscar(String dni) throws Exception {
        for (Empleado e : listaEmpleados) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        throw new Exception("Empleado no encontrado con DNI: " + dni);
    }

    public static void editar(Empleado empleado) throws Exception {
        Empleado existente = buscar(empleado.getDni());
        existente.setNombre(empleado.getNombre());
        existente.setDireccion(empleado.getDireccion());
        existente.setTelefono(empleado.getTelefono());
        existente.setNivelEducativo(empleado.getNivelEducativo());
        existente.setTipo(empleado.getTipo());
        existente.setHotel(empleado.getHotel());
    }

    public static void eliminar(String dni) throws Exception {
        Empleado e = buscar(dni);
        listaEmpleados.remove(e);
    }

    public static ArrayList<Empleado> listarTodo() throws Exception {
        if (listaEmpleados.isEmpty()) {
            throw new Exception("No hay empleados registrados.");
        }
        return listaEmpleados;
    }

    public static int contar() {
        return listaEmpleados.size();
    }
}

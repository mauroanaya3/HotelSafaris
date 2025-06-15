package co.edu.udec.poo.hotelsafaris.modelo.crud;

//

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Cliente;
import java.util.ArrayList;

public class ClienteCrud {
    
     private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void agregar(Cliente cliente) throws Exception {
        for (Cliente c : listaClientes) {
            if (c.getDni().equals(cliente.getDni())) {
                throw new Exception("El cliente con DNI " + cliente.getDni() + " ya existe.");
            }
        }
        listaClientes.add(cliente);
    }

    public static Cliente buscar(String dni) throws Exception {
        for (Cliente c : listaClientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        throw new Exception("Cliente con DNI " + dni + " no encontrado.");
    }
    
  public static ArrayList<Cliente> buscarPorNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            return listarTodo(); // Devuelve todos si la busqueda esta en blanco
        }

        ArrayList<Cliente> resultados = new ArrayList<>();

        for (Cliente c : listaClientes) {
            if (c.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                resultados.add(c);
            }
        }

        if (resultados.isEmpty()) {
            throw new Exception("No se encontraron clientes con el nombre: " + nombre);
        }

        return resultados;
    }
     

     public static ArrayList<Cliente> buscarPorDni(String dni) throws Exception {
        if (dni == null || dni.trim().isEmpty()) {
            return listarTodo(); // Devuelve todos si la busqueda esta en blanco
        }

        ArrayList<Cliente> resultados = new ArrayList<>();

        for (Cliente c : listaClientes) {
            if (c.getDni().toLowerCase().contains(dni.toLowerCase())) {
                resultados.add(c);
            }
        }

        if (resultados.isEmpty()) {
            throw new Exception("No se encontraron clientes con el DNI: " + dni);
        }

        return resultados;
    }


    public static void editar(Cliente cliente) throws Exception {
        Cliente c = buscar(cliente.getDni());
        c.setNombre(cliente.getNombre());
        c.setDireccion(cliente.getDireccion());
        c.setTelefono(cliente.getTelefono());
    }

    public static void eliminar(String dni) throws Exception {
        Cliente c = buscar(dni);
        listaClientes.remove(c);
    }

    public static ArrayList<Cliente> listarTodo() throws Exception {
        if (listaClientes.isEmpty()) {
            throw new Exception("No hay clientes registrados.");
        }
        return listaClientes;
    }

    public static int contar() {
        return listaClientes.size();
    }
}

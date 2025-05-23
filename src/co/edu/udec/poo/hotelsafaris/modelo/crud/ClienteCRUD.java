
package co.edu.udec.poo.hotelsafaris.modelo.crud;


import co.edu.udec.poo.hotelsafaris.modelo.entidades.Cliente;
import java.util.ArrayList;

public class ClienteCRUD {
    
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

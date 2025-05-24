package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Hotel;
import java.util.ArrayList;

public class HotelCrud {

    private static ArrayList<Hotel> listaHoteles = new ArrayList<>();

    public static void agregar(Hotel hotel) throws Exception {
        for (Hotel h : listaHoteles) {
            if (h.getCodigo() == hotel.getCodigo()) {
                throw new Exception("Ya existe un hotel con código: " + 
                        hotel.getCodigo());
            }
        }
        listaHoteles.add(hotel);
    }

    public static Hotel buscar(int codigo) throws Exception {
        for (Hotel h : listaHoteles) {
            if (h.getCodigo() == codigo) {
                return h;
            }
        }
        throw new Exception("Hotel no encontrado con código: " + codigo);
    }

    public static void editar(Hotel hotel) throws Exception {
        Hotel existente = buscar(hotel.getCodigo());
        existente.setNombre(hotel.getNombre());
        existente.setCategoria(hotel.getCategoria());
        existente.setDireccion(hotel.getDireccion());
        existente.setTelefono(hotel.getTelefono());
        existente.setDirector(hotel.getDirector());
    }

    public static void eliminar(int codigo) throws Exception {
        Hotel h = buscar(codigo);
        listaHoteles.remove(h);
    }

    public static ArrayList<Hotel> listarTodo() throws Exception {
        if (listaHoteles.isEmpty()) {
            throw new Exception("No hay hoteles registrados.");
        }
        return listaHoteles;
    }

    public static int contar() {
        return listaHoteles.size();
    }
}

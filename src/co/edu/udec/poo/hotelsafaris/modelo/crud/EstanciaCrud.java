package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Estancia;
import java.util.ArrayList;

public class EstanciaCrud {
    private static ArrayList<Estancia> listaEstancias = new ArrayList<>();

    public static void agregar(Estancia estancia) throws Exception {
        for (Estancia e : listaEstancias) {
            if (e.getId() == estancia.getId()) {
                throw new Exception("Ya existe una estancia con ID: " + estancia.getId());
            }
        }
        listaEstancias.add(estancia);
    }

    public static Estancia buscar(int id) throws Exception {
        for (Estancia e : listaEstancias) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new Exception("Estancia no encontrada con ID: " + id);
    }

    public static void editar(Estancia estancia) throws Exception {
        Estancia existente = buscar(estancia.getId());
        existente.setReserva(estancia.getReserva());
        existente.setHabitacionesOcupadas(estancia.getHabitacionesOcupadas());
        existente.setFechaInicio(estancia.getFechaInicio());
        existente.setFechaFin(estancia.getFechaFin());
        existente.setActividadesContratadas(estancia.getActividadesContratadas());
    }

    public static void eliminar(int id) throws Exception {
        Estancia e = buscar(id);
        listaEstancias.remove(e);
    }

    public static ArrayList<Estancia> listarTodo() throws Exception {
        if (listaEstancias.isEmpty()) {
            throw new Exception("No hay estancias registradas.");
        }
        return listaEstancias;
    }

    public static int contar() {
        return listaEstancias.size();
    }
}

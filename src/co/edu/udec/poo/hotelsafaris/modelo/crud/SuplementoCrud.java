
package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Suplemento;
import java.util.ArrayList;

public class SuplementoCrud {
    private static ArrayList<Suplemento> listaSuplementos = new ArrayList<>();

    public static void agregar(Suplemento suplemento) throws Exception {
        for (Suplemento s : listaSuplementos) {
            if (s.getTipo().equalsIgnoreCase(suplemento.getTipo())) {
                throw new Exception("Ya existe un suplemento con tipo: " + suplemento.getTipo());
            }
        }
        listaSuplementos.add(suplemento);
    }

    public static Suplemento buscar(String tipo) throws Exception {
        for (Suplemento s : listaSuplementos) {
            if (s.getTipo().equalsIgnoreCase(tipo)) {
                return s;
            }
        }
        throw new Exception("Suplemento no encontrado con tipo: " + tipo);
    }

    public static void editar(Suplemento suplemento) throws Exception {
        Suplemento existente = buscar(suplemento.getTipo());
        existente.setImporte(suplemento.getImporte());
    }

    public static void eliminar(String tipo) throws Exception {
        Suplemento s = buscar(tipo);
        listaSuplementos.remove(s);
    }

    public static ArrayList<Suplemento> listarTodo() throws Exception {
        if (listaSuplementos.isEmpty()) {
            throw new Exception("No hay suplementos registrados.");
        }
        return listaSuplementos;
    }

    public static int contar() {
        return listaSuplementos.size();
    }
}

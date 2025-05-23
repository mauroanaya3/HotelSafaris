package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Actividad;
import java.util.ArrayList;

public class ActividadCrud {

    private static ArrayList<Actividad> listaActividades = new ArrayList<>();

    public static void agregar(Actividad actividad) throws Exception {
        for (Actividad a : listaActividades) {
            if (a.getCodigo() == actividad.getCodigo()) {
                throw new Exception("Ya existe una actividad con código: " + actividad.getCodigo());
            }
        }
        listaActividades.add(actividad);
    }

    public static Actividad buscar(int codigo) throws Exception {
        for (Actividad a : listaActividades) {
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        throw new Exception("Actividad no encontrada con código: " + codigo);
    }
    
    public static void editar(Actividad actividad) throws Exception {
        Actividad existente = buscar(actividad.getCodigo());
        existente.setNombre(actividad.getNombre());
        existente.setDescripcion(actividad.getDescripcion());
        existente.setHorario(actividad.getHorario());
        existente.setDiasSemana(actividad.getDiasSemana());
        existente.setGratuito(actividad.isGratuito());
        existente.setPrecio(actividad.getPrecio());
        existente.setAnimador(actividad.getAnimador());
    }
    
    public static void eliminar(int codigo) throws Exception {
        Actividad a = buscar(codigo);
        listaActividades.remove(a);
    }

    public static ArrayList<Actividad> listarTodo() throws Exception {
        if (listaActividades.isEmpty()) {
            throw new Exception("No hay actividades registradas.");
        }
        return listaActividades;
    }

    public static int contar() {
        return listaActividades.size();
    }
}

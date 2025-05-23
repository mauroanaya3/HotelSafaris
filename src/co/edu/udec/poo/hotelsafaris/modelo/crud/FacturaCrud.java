package co.edu.udec.poo.hotelsafaris.modelo.crud;

import co.edu.udec.poo.hotelsafaris.modelo.entidades.Factura;
import java.util.ArrayList;

public class FacturaCrud {
    private static ArrayList<Factura> listaFacturas = new ArrayList<>();

    public static void agregar(Factura factura) throws Exception {
        for (Factura f : listaFacturas) {
            if (f.getId() == factura.getId()) {
                throw new Exception("Ya existe una factura con ID: " + factura.getId());
            }
        }
        listaFacturas.add(factura);
    }

    public static Factura buscar(int id) throws Exception {
        for (Factura f : listaFacturas) {
            if (f.getId() == id) {
                return f;
            }
        }
        throw new Exception("Factura no encontrada con ID: " + id);
    }

    public static void editar(Factura factura) throws Exception {
        Factura existente = buscar(factura.getId());
        existente.setEstancia(factura.getEstancia());
        existente.setFechaEmision(factura.getFechaEmision());
        existente.setTotalHabitaciones(factura.getTotalHabitaciones());
        existente.setTotalSuplementos(factura.getTotalSuplementos());
        existente.setTotalActividades(factura.getTotalActividades());
        existente.setAnticipoDescontado(factura.getAnticipoDescontado());
        existente.setTotalPagar(factura.getTotalPagar());
    }

    public static void eliminar(int id) throws Exception {
        Factura f = buscar(id);
        listaFacturas.remove(f);
    }

    public static ArrayList<Factura> listarTodo() throws Exception {
        if (listaFacturas.isEmpty()) {
            throw new Exception("No hay facturas registradas.");
        }
        return listaFacturas;
    }

    public static int contar() {
        return listaFacturas.size();
    }
}

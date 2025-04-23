package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.Date;

public class Factura {
    private int id;
    private Estancia estancia;
    private Date fechaEmision;
    private double totalHabitaciones;
    private double totalSuplementos;
    private double totalActividades;
    private double anticipoDescontado;
    private double totalPagar;

    public Factura(int id, Estancia estancia, Date fechaEmision, double anticipoDescontado) {
        this.id = id;
        this.estancia = estancia;
        this.fechaEmision = fechaEmision;
        this.anticipoDescontado = anticipoDescontado;
        calcularTotal();
    }

    public void calcularTotal() {
        this.totalHabitaciones = estancia.calcularTotalEstancia();
        this.totalSuplementos = 0; // podría extraerse por habitación
        this.totalActividades = estancia.actividadesContratadas.stream()
                .mapToDouble(Actividad::calcularCostoCliente).sum();
        this.totalPagar = totalHabitaciones + totalActividades - anticipoDescontado;
    }

    public String generarFactura() {
        return "Factura #" + id +
               "\nFecha: " + fechaEmision +
               "\nTotal habitaciones: $" + totalHabitaciones +
               "\nTotal actividades: $" + totalActividades +
               "\nAnticipo descontado: $" + anticipoDescontado +
               "\nTOTAL A PAGAR: $" + totalPagar;
    }

    @Override
    public String toString() {
        return generarFactura();
    }
}

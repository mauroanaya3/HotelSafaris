package co.edu.udec.poo.hotelsafaris.modelo.entidades;

import java.util.Date;
import java.util.logging.Logger;

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

    public int getId() {
        return id;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public double getTotalHabitaciones() {
        return totalHabitaciones;
    }

    public double getTotalSuplementos() {
        return totalSuplementos;
    }

    public double getTotalActividades() {
        return totalActividades;
    }

    public double getAnticipoDescontado() {
        return anticipoDescontado;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTotalHabitaciones(double totalHabitaciones) {
        this.totalHabitaciones = totalHabitaciones;
    }

    public void setTotalSuplementos(double totalSuplementos) {
        this.totalSuplementos = totalSuplementos;
    }

    public void setTotalActividades(double totalActividades) {
        this.totalActividades = totalActividades;
    }

    public void setAnticipoDescontado(double anticipoDescontado) {
        this.anticipoDescontado = anticipoDescontado;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return generarFactura();
    }
}

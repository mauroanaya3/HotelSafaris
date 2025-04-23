package co.edu.udec.poo.hotelsafaris.modelo.entidades;

public class Suplemento {
    private String tipo;
    private double importe;

    public Suplemento(String tipo, double importe) {
        this.tipo = tipo;
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Suplemento: " + tipo + " ($" + importe + ")";
    }
}


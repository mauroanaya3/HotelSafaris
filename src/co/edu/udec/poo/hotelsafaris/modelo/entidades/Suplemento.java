package co.edu.udec.poo.hotelsafaris.modelo.entidades;

public class Suplemento {
    private String tipo;
    private double importe;

    public Suplemento(String tipo, double importe) {
        this.tipo = tipo;
        this.importe = importe;
    }

    public Suplemento() {}
    
    public double getImporte() {
        return importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return tipo + " ($" + importe + ")";
    }
}


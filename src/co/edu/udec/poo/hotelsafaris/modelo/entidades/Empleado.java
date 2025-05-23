package co.edu.udec.poo.hotelsafaris.modelo.entidades;

public class Empleado extends Persona {
    private String nivelEducativo;
    private String tipo;
    private Hotel hotel;

    public Empleado(String dni, String nombre, String direccion, String telefono,
                    String nivelEducativo, String tipo, Hotel hotel) {
        super(dni, nombre, direccion, telefono);
        this.nivelEducativo = nivelEducativo;
        this.tipo = tipo;
        this.hotel = hotel;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public String getTipo() {
        return tipo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

   
    @Override
    public String toString() {
        return "Empleado\n" + super.toString() +
               "\nNivel educativo: " + nivelEducativo +
               "\nTipo: " + tipo +
               "\nHotel asignado: " + (hotel != null ? hotel.getNombre() : "Sin asignar");
    }
}

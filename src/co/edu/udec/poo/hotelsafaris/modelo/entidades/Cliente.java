package co.edu.udec.poo.hotelsafaris.modelo.entidades;

public class Cliente extends Persona {
    public Cliente() {
        super();
    }

    public Cliente(String dni, String nombre, String direccion, String telefono) {
        super(dni, nombre, direccion, telefono);
    }

   @Override
    public String toString() {
        return "Cliente\n" + super.toString();
    }
}


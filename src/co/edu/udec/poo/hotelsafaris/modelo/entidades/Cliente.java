package co.edu.udec.poo.hotelsafaris.modelo.entidades;

public class Cliente extends Persona {
    public Cliente() {
        super();
    }

    public Cliente(String dni, String nombre, String direccion, String telefono) {
        super(dni, nombre, direccion, telefono);
    }
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

   @Override
    public String toString() {
        return "Cliente\n" + super.toString();
    }
}



package co.edu.udec.poo.hotelsafaris.modelo.entidades;

/**
 *
 * @author mauro
 */

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public Persona() {}

    public Persona(String dni, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nDNI: " + dni +
               "\nDirección: " + direccion +
               "\nTeléfono: " + telefono;
    }
}

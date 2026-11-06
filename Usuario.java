/**
 * Clase Usuario: persona que solicita libros prestados.
 */
public class Usuario {
    // Atributos
    private String nombre;
    private String cedula;

    // Constructor
    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}

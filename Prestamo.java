/**
 * Clase Prestamo: colabora con Usuario y Libro.
 */
public class Prestamo {
    // Atributos (objetos de otras clases)
    private Usuario usuario;
    private Libro libro;

    // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Intenta registrar el préstamo y muestra un mensaje según el resultado
    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: \"" + libro.getTitulo()
                    + "\" fue prestado a " + usuario.getNombre()
                    + " (C.I. " + usuario.getCedula() + ").");
        } else {
            System.out.println("Préstamo rechazado: \"" + libro.getTitulo()
                    + "\" no está disponible para " + usuario.getNombre() + ".");
        }
    }
}

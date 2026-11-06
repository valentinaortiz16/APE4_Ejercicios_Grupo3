/**
 * Clase Libro: controla si está disponible para préstamo.
 */
public class Libro {
    // Atributos
    private String titulo;
    private boolean disponible;

    // Constructor: todo libro nuevo está disponible
    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    // Intenta prestar el libro; retorna true si estaba disponible
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    // Marca el libro como disponible nuevamente
    public void devolver() {
        disponible = true;
    }
}

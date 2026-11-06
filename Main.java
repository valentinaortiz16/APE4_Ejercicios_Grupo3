/**
 * Ejercicio 5: Biblioteca.
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ariel Chanatasig", "1850123456");
        Usuario usuario2 = new Usuario("Paulo Escobar", "1850654321");
        Libro libro = new Libro("Java programación: teoría y ejemplos");

        // Dos usuarios intentan pedir el mismo libro
        Prestamo prestamo1 = new Prestamo(usuario1, libro);
        Prestamo prestamo2 = new Prestamo(usuario2, libro);

        prestamo1.registrar(); // se presta
        prestamo2.registrar(); // no está disponible
    }
}

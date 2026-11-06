/**
 * Clase Producto: nombre, precio y stock disponible.
 */
public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Reduce el stock solo si hay suficiente; retorna true si lo logró
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    // Muestra los datos del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}

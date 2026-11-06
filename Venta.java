/**
 * Clase Venta: recibe un Producto como parámetro (objeto como parámetro).
 */
public class Venta {
    // Atributo
    private int cantidad;

    // Constructor
    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Aplica la venta: reduce el stock y muestra el total a pagar
    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.getPrecio();
            System.out.println("Venta realizada. Total a pagar: $" + total);
        }
    }
}

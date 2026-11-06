/**
 * Clase Rectangulo: métodos con distintos tipos de retorno.
 */
public class Rectangulo {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Retorna el área (double)
    public double calcularArea() {
        return base * altura;
    }

    // Retorna el perímetro (double)
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Retorna true si la base es igual a la altura (boolean)
    public boolean esCuadrado() {
        return base == altura;
    }

    // Retorna una descripción del rectángulo (String)
    public String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    // Imprime todos los resultados (void)
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + (esCuadrado() ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }
}

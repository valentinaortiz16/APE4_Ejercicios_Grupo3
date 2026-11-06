/**
 * Clase Cuenta: titular y saldo, con operación de transferencia.
 */
public class Cuenta {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Suma dinero a la cuenta
    public void depositar(double monto) {
        saldo += monto;
    }

    // Resta dinero solo si hay fondos suficientes
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    // Transfiere dinero a otra cuenta (objeto como parámetro) solo si hay fondos
    public void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.getTitular());
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de " + titular);
        }
    }

    // Muestra los datos de la cuenta
    public void mostrarCuenta() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}

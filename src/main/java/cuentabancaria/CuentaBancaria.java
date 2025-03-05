package cuentabancaria;

/**
 * Representa una cuenta bancaria con operaciones básicas como depositar y retirar dinero.
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * CuentaBancaria cuenta = new CuentaBancaria();
 * cuenta.depositar(1000);
 * boolean exito = cuenta.retirar(500);
 * System.out.println("Retiro exitoso: " + exito);
 * }</pre>
 *
 * @author Juan Pérez
 * @version 1.1
 * @see Cliente
 */
public class CuentaBancaria {

    private double saldo;

    /**
     * Constructor que inicializa la cuenta con un saldo de cero.
     */
    public CuentaBancaria() {
        saldo = 0;
    }

    /**
     * Deposita una cantidad en la cuenta
     * @param cantidad cantidad de dinero a ingresar
     * @throws IllegalArgumentException en caso de que la cantidad indicada sea un valor negativo
     */
    public void depositar(double cantidad) {
        if( cantidad < 0 ) {
            // System.out.println("El saldo no puede ser negativo");
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        saldo += cantidad;
    }



    /**
     * Retira una cantidad de la cuenta si hay saldo suficiente.
     *
     * @param cantidad Monto a retirar.
     * @return {@code true} si la operación fue exitosa, {@code false} si no hay saldo suficiente.
     * @throws IllegalArgumentException si la cantidad es negativa.
     */
    public boolean retirar(double cantidad) {
        //si la cantidad a retirar es menor que 0
        if( cantidad < 0 ) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        // Saldo suficiente
        if( saldo >= cantidad ) {
            saldo -= cantidad;
            return true;
        }
        // Saldo insuficiente
        return false;

    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo disponible en la cuenta.
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Transfiere dinero de esta cuenta a otra cuenta bancaria.
     *
     * @param destino Cuenta destino a la que se transferirá el dinero. Debe ser una instancia de {@link CuentaBancaria}.
     * @param monto Cantidad a transferir.
     * @return {@code true} si la transferencia fue exitosa, {@code false} en caso contrario.
     * @throws IllegalArgumentException si el monto es negativo o si la cuenta destino es {@code null}.
     */
    public boolean transferir(CuentaBancaria destino, double monto) {
        if (destino == null) {
            throw new IllegalArgumentException("La cuenta destino no puede ser null");
        }
        if (monto < 0) {
            throw new IllegalArgumentException("El monto a transferir debe ser positivo");
        }
        if (this.retirar(monto)) {
            destino.depositar(monto);
            return true;
        }
        return false;
    }
}
package Cajero;

public class CuentaBancaria {
    private Cliente titular;
    private double saldo;
    private double saldoActual = 0;

    public CuentaBancaria(Cliente titular) {
        this.titular = titular;
        this.saldo = saldoActual;
    }

    public void depositar(double montoDepositar) {
        if (montoDepositar > 0) {
            saldo += montoDepositar;
        }
    }

    public void retirar(double montoRetirar) {
        if (montoRetirar > 0 && montoRetirar <= saldo) {
            saldo -= montoRetirar;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}

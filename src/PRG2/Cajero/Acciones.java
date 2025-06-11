package Cajero;

import java.util.Scanner;

public class Acciones {
    
    public void mostrar() {
        cleanScreen();
        System.out.println("\n--- Menú del Cajero ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Elegí una opción: ");
    }
    
    public boolean ejecutar(int opcion, CuentaBancaria cuentaBancaria) {
        Scanner scanner = new Scanner(System.in);
        
        if (opcion == 1) {
            System.out.println("Saldo actual: $" + cuentaBancaria.getSaldo());
        } else if (opcion == 2) {
            System.out.print("Monto a depositar: ");
            double montoDepositar = scanner.nextDouble();
            cuentaBancaria.depositar(montoDepositar);
        } else if (opcion == 3) {
            System.out.print("Monto a retirar: ");
            double montoRetirar = scanner.nextDouble();
            cuentaBancaria.retirar(montoRetirar);
        } else if (opcion == 4) {
            System.out.println("¡Hasta luego!");
            return true;
        } else {
            System.out.println("Opción inválida.");
        }
        return false;

    }

    public void cleanScreen() {
        try {
            Thread.sleep(3000); 
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
        } catch (InterruptedException e) {
            System.out.println("Error CleanScreen");
        }
    }

}

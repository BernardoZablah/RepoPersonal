package Cajero;

import java.util.Scanner;

public class MainMenu {

    private Cliente cliente;
    private CuentaBancaria cuentaBancaria;
    private Acciones acciones;

    public MainMenu() {
        cliente = new Cliente(null, null);
        cuentaBancaria = new CuentaBancaria(cliente);
        acciones = new Acciones();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            acciones.mostrar();
            int opcion = scanner.nextInt();

            salir = acciones.ejecutar(opcion, cuentaBancaria);
        }

        scanner.close();
    }

}

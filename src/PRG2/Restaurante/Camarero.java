package Restaurante;

import java.util.Scanner;

public class Camarero {

    private Scanner scanner = new Scanner(System.in);

    public Orden tomarOrden() {
        System.out.println("Bienvenido al restaurante. Vamos a tomar su orden.");

        System.out.println("Elige tipo de pan:");
        System.out.println("1. Brioche");
        System.out.println("2. Integral");
        int opcionPan = scanner.nextInt();
        scanner.nextLine();
        String tipoPan = (opcionPan == 1) ? "Brioche" : "Integral";
        Pan pan = new Pan(tipoPan);

        System.out.println("Elige tipo de carne:");
        System.out.println("1. Res");
        System.out.println("2. Pollo");
        int opcionCarne = scanner.nextInt();
        scanner.nextLine();
        String tipoCarne = (opcionCarne == 1) ? "Res" : "Pollo";

        System.out.println("Elige cocción:");
        System.out.println("1. Poco hecha");
        System.out.println("2. Medio hecha");
        System.out.println("3. Muy hecha");
        int opcionCoccion = scanner.nextInt();
        scanner.nextLine();
        String coccion = (opcionCoccion == 1) ? "Poco hecha" : (opcionCoccion == 2) ? "Medio hecha" : "Muy hecha";
        Carne carne = new Carne(tipoCarne, coccion);

        Extra[] extras = new Extra[4];
        String[] disponibles = {
                "Queso Cheddar", "Queso Azul", "Huevo", "Mayonesa", "Ketchup"
        };

        for (int i = 0; i < extras.length; i++) {
            System.out.println("Elige extra #" + (i + 1) + ":");
            for (int j = 0; j < disponibles.length; j++) {
                System.out.println((j + 1) + ". " + disponibles[j]);
            }
            int opcionExtra = scanner.nextInt();
            scanner.nextLine();

            System.out.println("¿Cuánta cantidad?");
            System.out.println("1. Poco");
            System.out.println("2. Mucho");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            String nombreExtra = disponibles[opcionExtra - 1];
            String cantidadTexto = (cantidad == 1) ? "poco" : "mucho";

            extras[i] = new Extra(nombreExtra, cantidadTexto);
        }

        return new Orden(pan, carne, extras);
    }

    public void servirHamburguesa(Hamburguesa hamburguesa) {
        System.out.println("\nSirviendo hamburguesa...");
        System.out.println(hamburguesa.describir());
        hamburguesa.mostrar();
    }
}

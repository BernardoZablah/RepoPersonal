import java.util.Scanner;

public class Montacargas {
    public static void main(String[] args) {

        final int PLANTA_INICIO_DIA = 0;
        final int PLANTA_MAXIMA = 9;
        int plantaActual = PLANTA_INICIO_DIA;
        boolean montacargasEncendido = true;

        imprimirSimulacion("Detenido", plantaActual, plantaActual);

        while (montacargasEncendido) {
            int nivelDeseado = solicitarNivel();

            if (nivelDeseado < 0 || nivelDeseado > PLANTA_MAXIMA) {
                System.out.println("Nivel fuera de rango. Terminando programa.");
                montacargasEncendido = false;
            } else if (nivelDeseado != plantaActual) {
                moverMontagargas(plantaActual, nivelDeseado);
                plantaActual = nivelDeseado;
            }

            if (montacargasEncendido) {
                imprimirSimulacion("Detenido", plantaActual, plantaActual);
            }
        }
    }

    private static void imprimirSimulacion(String estado, int plantaActual, int destino) {
        final int PLANTA_MAXIMA = 9;

        limpiarConsola();

        for (int i = PLANTA_MAXIMA; i >= 0; i--) {
            if (i == plantaActual) {
                if (estado.startsWith("Subiendo")) {
                    System.out.printf("%d    [^ %d ^]%n", i, destino);
                } else if (estado.startsWith("Bajando")) {
                    System.out.printf("%d    [v %d v]%n", i, destino);
                } else {
                    System.out.printf("%d    [ --- ]%n", i);
                }
            } else {
                System.out.printf("%d     |   |%n", i);
            }
        }

        System.out.println("-----------------");
        System.out.println("En planta " + plantaActual);
        System.out.println(estado);
    }

    private static void pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static void moverMontagargas(int nivelActual, int nivelDeseado) {
        int paso = (nivelDeseado > nivelActual) ? 1 : -1;
        String estado = (paso > 0) ? "Subiendo a planta " + nivelDeseado : "Bajando a planta " + nivelDeseado;

        for (int i = nivelActual + paso; (paso > 0 ? i <= nivelDeseado : i >= nivelDeseado); i += paso) {
            imprimirSimulacion(estado, i, nivelDeseado);
            pausar(500);
        }
    }

    private static int solicitarNivel() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la planta de destino (0–9): ");
        while (!entrada.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entre 0 y 9: ");
            entrada.next();
        }
        int nivel = entrada.nextInt();
        entrada.nextLine();
        return nivel;
    }
}

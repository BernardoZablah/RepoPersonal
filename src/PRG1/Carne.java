import java.util.Scanner;

public class Carne {
    public static void main(String[] args) {
        final int SUMA_PAR = 0;
        final int SUMA_IMPAR = 1;
        final int SUMA_TOTAL = 2;

        int[] carnet = pedirCarne();
        int[] sumas = calcularPosiciones(carnet);
        int[] problemas = definirProblemas(sumas[SUMA_PAR], sumas[SUMA_IMPAR], sumas[SUMA_TOTAL]);
        imprimirResultados(problemas);
    }

    private static int[] pedirCarne() {
        Scanner entrada = new Scanner(System.in);
        int[] carnet = new int[10];

        System.out.println("Ingrese los 10 números del carnet separados por espacio:");
        for (int i = 0; i < 10; i++) {
            carnet[i] = entrada.nextInt();
        }

        entrada.close();
        return carnet;
    }

    private static int[] calcularPosiciones(int[] carnet) {
        int sumaPar = 0;
        int sumaImpar = 0;

        for (int i = 0; i < carnet.length; i++) {
            if (i % 2 == 0) {
                sumaPar += carnet[i];
            } else {
                sumaImpar += carnet[i];
            }
        }

        int sumaTotal = sumaPar + sumaImpar;
        return new int[] { sumaPar, sumaImpar, sumaTotal };
    }

    private static int[] definirProblemas(int sumaPar, int sumaImpar, int sumaTotal) {
        int problema1 = (sumaImpar / 6) + 1;
        int problema2 = (sumaPar / 6) + 1;
        int problema3 = (sumaTotal / 6) + 1;

        do {
            if (problema1 == problema2)
                problema1++;
            if (problema1 == problema3)
                problema1++;
            if (problema2 == problema3)
                problema3++;
            if (problema1 > 6)
                problema1 = 1;
            if (problema2 > 6)
                problema2 = 1;
            if (problema3 > 6)
                problema3 = 1;
        } while (problema1 == problema2 || problema1 == problema3 || problema2 == problema3);

        return new int[] { problema1, problema2, problema3 };
    }

    private static void imprimirResultados(int[] problemas) {
        System.out.println("Problema 1: " + problemas[0]);
        System.out.println("Problema 2: " + problemas[1]);
        System.out.println("Problema 3: " + problemas[2]);
    }
}

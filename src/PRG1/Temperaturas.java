import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];

        pedirTemperaturas(temperaturas);

        double temperaturaMaxima = calcularMaxima(temperaturas);
        double temperaturaMinima = calcularMinima(temperaturas);
        double temperaturaMedia = calcularMedia(temperaturas);

        imprimirResultados(temperaturaMaxima, temperaturaMinima, temperaturaMedia);

    }

    private static void pedirTemperaturas(double[] temperaturas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa las 7 temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }
        entrada.close();
    }

    private static double calcularMaxima(double[] temperaturas) {
        double maxima = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }
        }
        return maxima;
    }

    private static double calcularMinima(double[] temperaturas) {
        double minima = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
            }
        }
        return minima;

    }

    private static double calcularMedia(double[] temperaturas) {
        double suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }
        return suma / temperaturas.length;
    }

    private static void imprimirResultados(double temperaturaMaxima, double temperaturaMinima,
            double temperaturaMedia) {
        System.out.println("\nResultados:");
        System.out.println("Temperatura máxima: " + temperaturaMaxima);
        System.out.println("Temperatura mínima: " + temperaturaMinima);
        System.out.println("Temperatura media: " + temperaturaMedia);
    }
}
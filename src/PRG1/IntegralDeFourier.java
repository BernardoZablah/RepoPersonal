import java.util.Scanner;

public class IntegralDeFourier {
    public static void main(String[] args) {

        final int LIMITE_INFERIOR = 0;
        final int LIMITE_SUPERIOR = 1;
        double resultadoIntegral;

        double rangos[] = pedirLimites();
        resultadoIntegral = calcularIntegral(rangos[LIMITE_INFERIOR], rangos[LIMITE_SUPERIOR]);
        imprimirResultados(resultadoIntegral);

    }

    private static double[] pedirLimites() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el límite inferior (a): ");
        double limiteInferior = entrada.nextDouble();
        System.out.print("Ingresa el límite superior (b): ");
        double limiteSuperior = entrada.nextDouble();
        return new double[] { limiteInferior, limiteSuperior };

    }

    private static double calcularIntegral(double limiteInferior, double limiteSuperior) {

        final int SUBINTERVALOS = 1000;
        final double FACTOR_EXTREMOS = 0.5;
        double anchoSubintervalo = (limiteSuperior - limiteInferior) / SUBINTERVALOS;
        double sumaAproximada = FACTOR_EXTREMOS
                * (evaluarFuncionIntegrando(limiteInferior) + evaluarFuncionIntegrando(limiteSuperior));

        for (int i = 1; i < SUBINTERVALOS; i++) {
            double puntoActual = limiteInferior + i * anchoSubintervalo;
            sumaAproximada += evaluarFuncionIntegrando(puntoActual);
        }

        return sumaAproximada * anchoSubintervalo;

    }

    private static double evaluarFuncionIntegrando(double variableIndependiente) {

        final double CONSTANTE_ESCALONADO = 1.59;
        double termino1 = Math.sin(variableIndependiente / CONSTANTE_ESCALONADO);
        double termino2 = 0.33 * Math.sin(3 * variableIndependiente / CONSTANTE_ESCALONADO);
        double termino3 = 0.2 * Math.sin(5 * variableIndependiente / CONSTANTE_ESCALONADO);

        return 5 * (termino1 + termino2 + termino3);

    }

    private static void imprimirResultados(double resultadoIntegral) {
        System.out.printf("El resultado de la integral es: %.6f%n", resultadoIntegral);
    }
}

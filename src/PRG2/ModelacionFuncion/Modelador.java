package ModelacionFuncion;

public class Modelador {

    public void derivarPolinomio(double[] coeficientes) {
        System.out.print("Derivada: ");
        for (int i = 1; i < coeficientes.length; i++) {
            double derivado = coeficientes[i] * i;
            if (derivado != 0) {
                System.out.print(derivado + "x^" + (i - 1));
                if (i < coeficientes.length - 1) {
                    System.out.print(" + ");
                }
            }
        }
        System.out.println();
    }

    public void IntegrarPolinomio(double[] coeficientes) {
        System.out.print("Integral: ");
        for (int i = 0; i < coeficientes.length; i++) {
            double integrado = coeficientes[i] / (i + 1);
            if (integrado != 0) {
                System.out.print(integrado + "x^" + (i + 1));
                if (i < coeficientes.length - 1) {
                    System.out.print(" + ");
                }
            }
        }
        System.out.println(" + C");
    }

}

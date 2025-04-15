package ModelacionFuncion;

import java.util.Scanner;

public class Usuario {

    private String polinomioString;
    private double[] coeficientes;

    public String getPolinomio() {
        return polinomioString != null ? polinomioString : "No definido";
    }

    public double[] getCoeficientes() {
        return coeficientes;
    }

    public void setPolinomio() {
        Scanner scanner = new Scanner(System.in);

        int grado = scanner.nextInt();

        coeficientes = new double[grado + 1]; // Asignar al campo de la clase

        for (int i = grado; i >= 0; i--) {
            System.out.print("Coeficiente para x^" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        StringBuilder polinomioStr = new StringBuilder();

        for (int i = grado; i >= 0; i--) {
            double coef = coeficientes[i];
            if (coef == 0)
                continue;

            if (polinomioStr.length() > 0) {
                polinomioStr.append(coef > 0 ? " + " : " - ");
            } else if (coef < 0) {
                polinomioStr.append("-");
            }

            double absCoef = Math.abs(coef);

            if (i == 0) {
                polinomioStr.append(absCoef);
            } else if (i == 1) {
                polinomioStr.append(absCoef == 1 ? "x" : absCoef + "x");
            } else {
                polinomioStr.append(absCoef == 1 ? "x^" + i : absCoef + "x^" + i);
            }
        }

        polinomioString = polinomioStr.toString(); // Asignar el string al campo
    }

}

package ModelacionFuncion;

public class InterfazMenu {

    public void mostrar() {
        System.out.println("========= MENÚ PRINCIPAL =========");
        System.out.println("1. Ingresar polinomio");
        System.out.println("2. Ver polinomio actual");
        System.out.println("3. Derivar polinomio");
        System.out.println("4. Integrar polinomio");
        System.out.println("5. Salir");
        System.out.println("==================================");
        System.out.print("Selecciona una opción: ");
    }

    public boolean ejecutarMenu(int opcion, Usuario usuario, Modelador modelador) {
        if (opcion == 1) {
            System.out.print("Ingresa el grado del polinomio: ");
            usuario.setPolinomio();
        } else if (opcion == 2) {
            System.out.println("Polinomio actual: " + usuario.getPolinomio());
        } else if (opcion == 3) {
            System.out.println("Derivando polinomio...");
            modelador.derivarPolinomio(usuario.getCoeficientes());
        } else if (opcion == 4) {
            System.out.println("Integrando polinomio...");
            modelador.IntegrarPolinomio(usuario.getCoeficientes());
        } else if (opcion == 5) {
            System.out.println("Saliendo del programa. ¡Hasta luego!");
            return true; 
        }  else {
            System.out.println("Opción inválida. Intenta de nuevo.");
        }
        return false; 

    }

}

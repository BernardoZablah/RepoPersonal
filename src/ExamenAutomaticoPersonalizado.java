import java.util.Scanner;

public class ExamenAutomaticoPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CONFIGURACION = "[1] Configuracion";
        final String EJECUCUCION_DEL_TEST = "[2] Ejecucion del test";
        final String SALIR_DEL_SISTEMA = "[3] Salir del sistema";
        
        int seleccionUsuario =0;

        do{
        System.out.println(CONFIGURACION);
        System.out.println(EJECUCUCION_DEL_TEST);
        System.out.println(SALIR_DEL_SISTEMA);

        seleccionUsuario = scanner.nextInt();

        if (seleccionUsuario==1){






        } else if (seleccionUsuario == 2){







        } else if (seleccionUsuario == 3){
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Seleccione una opcion valida");
        }

        } while( seleccionUsuario != 3);
    
        scanner.close();
    }
}

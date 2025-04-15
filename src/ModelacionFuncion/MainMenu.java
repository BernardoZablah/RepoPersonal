package ModelacionFuncion;

import java.util.Scanner;

public class MainMenu {

    private InterfazMenu interfazMenu;
    private Modelador modelador;
    private Usuario usuario;

    public MainMenu() {
        interfazMenu = new InterfazMenu();
        modelador = new Modelador();
        usuario = new Usuario();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            interfazMenu.mostrar();
            int opcion = scanner.nextInt();

            salir = interfazMenu.ejecutarMenu(opcion, usuario, modelador);
        }
    }

}

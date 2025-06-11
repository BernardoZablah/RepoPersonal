package EscuelaHerencia;

public class Estudiante extends Persona {
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy estudiante de " + grado);
    }
}

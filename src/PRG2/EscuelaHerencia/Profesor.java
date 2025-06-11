package EscuelaHerencia;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;

    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy profesor de " + especialidad);
    }
}

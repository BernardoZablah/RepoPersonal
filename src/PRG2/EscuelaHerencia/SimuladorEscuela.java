package EscuelaHerencia;

public class SimuladorEscuela {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Ana", 17, "2º Bachillerato");
        Persona profesor = new Profesor("Carlos", 45, "Matemáticas");

        estudiante.presentarse();
        profesor.presentarse();
    }
}
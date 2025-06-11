package Restaurante;

public class Ingrediente {
    protected String nombre;
    protected String representacion;

    public Ingrediente(String nombre, String representacion) {
        this.nombre = nombre;
        this.representacion = representacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public String describir() {
        return nombre;
    }

    public void mostrar() {
        System.out.println(representacion);
    }
}
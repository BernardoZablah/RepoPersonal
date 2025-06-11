package Restaurante;

public class Carne extends Ingrediente {
    private String coccion;

    public Carne(String tipo, String coccion) {
        super(tipo, tipo.equals("Res") ? "::::::::::::" : ";;;;;;;;;;;;");
        this.coccion = coccion;
    }

    @Override
    public String describir() {
        return nombre + " (" + coccion + ")";
    }
}
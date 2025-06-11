package Restaurante;

public class Extra extends Ingrediente {
    private String cantidadTexto;

    public Extra(String nombreExtra, String cantidadTexto) {
        super(nombreExtra, calcularRepresentacion(nombreExtra));
        this.cantidadTexto = cantidadTexto;
    }

    @Override
    public String describir() {
        return cantidadTexto + " de " + nombre;
    }

    private static String calcularRepresentacion(String nombre) {
        if (nombre.equals("Queso Cheddar")) {
            return "============";
        } else if (nombre.equals("Queso Azul")) {
            return "-.-.-.-.-.-.";
        } else if (nombre.equals("Huevo")) {
            return "~-~-(  )~-~-";
        } else if (nombre.equals("Mayonesa")) {
            return "~=~~=~~=~~=~";
        } else if (nombre.equals("Ketchup")) {
            return "ooOooOooOooO";
        } else {
            return "???????";
        }
    }
}

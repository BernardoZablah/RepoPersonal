package Restaurante;

public class Hamburguesa {
    private Pan pan;
    private Carne carne;
    private Extra[] extras;

    public Hamburguesa(Pan pan, Carne carne, Extra[] extras) {
        this.pan = pan;
        this.carne = carne;
        this.extras = extras;
    }

    public String describir() {
        String descripcion = "Sale una " + pan.getNombre() + ", " + carne.describir();
        for (int i = 0; i < extras.length; i++) {
            descripcion += ", " + extras[i].describir();
        }
        descripcion += "!!!";
        return descripcion;
    }

    public void mostrar() {
        pan.mostrar();
        carne.mostrar();
        for (int i = 0; i < extras.length; i++) {
            extras[i].mostrar();
        }
        pan.mostrar();
    }
}

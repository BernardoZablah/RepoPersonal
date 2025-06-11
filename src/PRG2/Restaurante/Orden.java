package Restaurante;

public class Orden {
    private Pan pan;
    private Carne carne;
    private Extra[] extras;

    public Orden(Pan pan, Carne carne, Extra[] extras) {
        this.pan = pan;
        this.carne = carne;
        this.extras = extras;
    }

    public Pan getPan() {
        return pan;
    }

    public Carne getCarne() {
        return carne;
    }

    public Extra[] getExtras() {
        return extras;
    }
}

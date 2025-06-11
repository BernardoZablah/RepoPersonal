package Restaurante;

public class Pan extends Ingrediente {

    public Pan(String tipo) {
        super(tipo, tipo.equals("Brioche") ? "##############" : "||||||||||||||");
    }
}
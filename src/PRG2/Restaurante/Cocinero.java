package Restaurante;

public class Cocinero {

    public Hamburguesa prepararHamburguesa(Orden orden) {
        System.out.println("Preparando la hamburguesa...");
        Hamburguesa hamburguesa = new Hamburguesa(orden.getPan(), orden.getCarne(), orden.getExtras());
        System.out.println("Hamburguesa lista!");
        return hamburguesa;
    }
}

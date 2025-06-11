package Restaurante;

public class Restaurante {
    private Cocinero cocinero;
    private Camarero camarero;

    public Restaurante() {
        this.cocinero = new Cocinero();
        this.camarero = new Camarero();
    }

    public void abrir() {
        Restaurante restaurante = new Restaurante();
        restaurante.atenderCliente();
    }

    private void atenderCliente() {
        Orden orden = camarero.tomarOrden();
        Hamburguesa hamburguesa = cocinero.prepararHamburguesa(orden);
        camarero.servirHamburguesa(hamburguesa);
    }
}
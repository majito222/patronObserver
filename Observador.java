interface Observador {
    void notificar(Pedido pedido);
}

class Cliente implements Observador {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("¡Hola " + nombre + "! Su pedido " + pedido.getPlato() + " está listo.");
    }
}
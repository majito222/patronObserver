class Cocinero {

    private Restaurante restaurante;

    public Cocinero(Restaurante restaurante) {
        this.restaurante = restaurante;
        restaurante.registrarObservador(this);
    }

    public void prepararPedido(Pedido pedido) {
        // Simular la preparación del pedido
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        restaurante.notificarPedidoListo(pedido);
    }
}
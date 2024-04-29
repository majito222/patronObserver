public class Main {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("María");

        Pedido pedido1 = new Pedido("Hamburguesa");
        Pedido pedido2 = new Pedido("Pizza");

        restaurante.agregarPedido(pedido1);
        restaurante.agregarPedido(pedido2);
    }
}
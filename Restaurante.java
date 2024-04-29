import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Observador> observadores;
    private List<Pedido> pedidos;
    private Cocinero cocinero;

    public Restaurante() {
        this.observadores = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cocinero = new Cocinero(this);
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        cocinero.prepararPedido(pedido);
    }

    public void registrarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void notificarPedidoListo(Pedido pedido) {
        for (Observador observador : observadores) {
            observador.notificar(pedido);
        }
    }
}


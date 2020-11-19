import java.util.ArrayList;

public class pedidoController {

    private ArrayList<Pedido> pedidos;

    public pedidoController() {
        pedidos = new ArrayList<Pedido>();
    }

    public boolean cadastraPedido(Pedido p) {
        return pedidos.add(p);
    }

    public void listaPedidos() {
        int cont = 0;
        while(cont < pedidos.size()) {
            System.out.println(pedidos.get(cont).exibeDados());
            cont++;
        }
    }
}

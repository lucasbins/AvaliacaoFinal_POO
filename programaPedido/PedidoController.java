import java.util.ArrayList;

public class PedidoController {

    private ArrayList<Pedido> pedidos;

    public PedidoController() {
        pedidos = new ArrayList<Pedido>();
    }

    public boolean cadastraServico(Pedido p) {
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

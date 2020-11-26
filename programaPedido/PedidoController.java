import java.util.ArrayList;

public class PedidoController {

    private ArrayList<Pedido> pedidos;

    public PedidoController() {
        pedidos = new ArrayList<Pedido>();
    }

    public boolean cadastraPedido(Pedido p) {
        return pedidos.add(p);
    }

    public void listaPedidos() {
        int cont = 0;
        while(cont < pedidos.size()) {
            System.out.println(cont+1+" "+pedidos.get(cont).exibeDados());
            cont++;
        }
    }
    
    public Pedido buscaPedido(int num) {
        Pedido p = null;
        p = pedidos.get(num);
        return p;
    }
    
    public int buscaPedidosStatus(boolean status){
        int total = 0, cont = 0;
        while(cont < pedidos.size()) {
            if(pedidos.get(cont).getStatus() == status){
              System.out.println(cont+1+" "+pedidos.get(cont).exibeDados());
              total++;
            }
            cont++;
        }
        return total;
    }
    
    public int buscaPedidosPagamento(boolean status){
        int total=0, cont = 0;
        while(cont < pedidos.size()) {
            if(pedidos.get(cont).getPagamento() == status){
              System.out.println(cont+1+" "+pedidos.get(cont).exibeDados());
              total++;
            }
            cont++;
        }  
        return total;
    }
    
    public boolean removePedido(int codigo){
        Pedido p = pedidos.get(codigo);
        return pedidos.remove(p);
    }
    
    public int totalPedidos(){
        return pedidos.size();
    }
}

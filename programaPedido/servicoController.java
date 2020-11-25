import java.util.ArrayList;

public class ServicoController {

    private ArrayList<Servico> servicos;

    public ServicoController() {
        servicos = new ArrayList<Servico>();
    }

    public boolean cadastraServico(Servico s) {
        return servicos.add(s);
    }
    
    public Servico buscaServico(int num) {
        Servico ser = null;
        ser = servicos.get(num);
        return ser;
    }

    public void listaServicos() {
        int cont = 0;
        while(cont < servicos.size()) {
            System.out.println(servicos.get(cont).exibeDados());
            cont++;
        }
    }
    
    public void listaSimplesServico(){
        int cont = 0;
        while(cont < servicos.size()) {
            String dados = cont+1 + " - " + servicos.get(cont).getTipo();
            System.out.println(dados);
            cont++;
        }
    }
    
    public boolean removeServico(int codigo){
        Servico s = servicos.get(codigo);
        return servicos.remove(s);
    }
}

import java.util.ArrayList;

public class servicoController {

    private ArrayList<Servico> servicos;

    public servicoController() {
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
            String dados = cont + " - " + servicos.get(cont).getTipo();
            System.out.println(dados);
            cont++;
        }
    }
}

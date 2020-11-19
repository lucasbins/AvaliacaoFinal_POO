import java.util.ArrayList;

public class servicoController {

    private ArrayList<Servico> servicos;

    public servicoController() {
        servicos = new ArrayList<Servico>();
    }

    public boolean cadastraServico(Servico s) {
        return servicos.add(s);
    }

    public void listaServicos() {
        int cont = 0;
        while(cont < servicos.size()) {
            System.out.println(servicos.get(cont).exibeDados());
            cont++;
        }
    }
}

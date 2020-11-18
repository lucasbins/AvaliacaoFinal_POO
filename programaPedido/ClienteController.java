import java.util.ArrayList;

public class ClienteController {

    private ArrayList<PessoaJuridica> pessoasJuridicas;
    private ArrayList<PessoaFisica> pessoasFisicas;

    public ClienteController() {
        pessoasJuridicas = new ArrayList<PessoaJuridica>();
        pessoasFisicas = new ArrayList<PessoaFisica>();

    }

    public boolean cadastraPf(PessoaFisica pf) {
        return pessoasFisicas.add(pf);
    }

    public boolean cadastraPj(PessoaJuridica pj) {
        return pessoasJuridicas.add(pj);
    }

    public void listaPj() {
        int cont = 0;
        while(cont < pessoasJuridicas.size()) {
            System.out.println(pessoasJuridicas.get(cont).exibeDados());
            cont++;
        }
    }

    public void listaPf() {
        int cont = 0;
        while(cont < pessoasFisicas.size()) {
            System.out.println(pessoasFisicas.get(cont).exibeDados());
            cont++;
        }
    }

    public PessoaFisica buscaClientePf(int num) {
        PessoaFisica pf = null;
        pf = pessoasFisicas.get(num);
        return pf;
    }

    public PessoaJuridica buscaClientePj(int num) {
        PessoaJuridica pj = null;
        pj = pessoasJuridicas.get(num);
        return pj;
    }

}

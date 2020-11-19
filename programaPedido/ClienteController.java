import java.util.ArrayList;

public class clienteController {

    private ArrayList<pessoaJuridica> pessoasJuridicas;
    private ArrayList<pessoaFisica> pessoasFisicas;

    public clienteController() {
        pessoasJuridicas = new ArrayList<pessoaJuridica>();
        pessoasFisicas = new ArrayList<pessoaFisica>();

    }

    public boolean cadastraPf(pessoaFisica pf) {
        return pessoasFisicas.add(pf);
    }

    public boolean cadastraPj(pessoaJuridica pj) {
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

    public pessoaFisica buscaClientePf(int num) {
        pessoaFisica pf = null;
        pf = pessoasFisicas.get(num);
        return pf;
    }
    
    public void listaSimplesPf(){
        int cont = 0;
        while(cont < pessoasFisicas.size()) {
            String dados = cont + " - " + pessoasFisicas.get(cont).getNome();
            System.out.println(dados);
            cont++;
        }
    }

    public pessoaJuridica buscaClientePj(int num) {
        pessoaJuridica pj = null;
        pj = pessoasJuridicas.get(num);
        return pj;
    }

}

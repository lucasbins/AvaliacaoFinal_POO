public class PessoaFisica extends Cliente
{
    String cpf;

    public PessoaFisica(String nome, String email, String telefone, String cpf)
    {
        super (nome, email, telefone);

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String exibeDados() {
        String dados = "Cliente:"+this.nome+"\nCPF: "+this.cpf+"\nEmail: "+this.email+"\nTelefone: "+this.telefone;
        return dados;
    }
}


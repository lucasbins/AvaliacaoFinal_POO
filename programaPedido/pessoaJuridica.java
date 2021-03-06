public class PessoaJuridica extends Cliente
{
    String cnpj;

    public PessoaJuridica(String nome, String email, String telefone, String cnpj)
    {
        super (nome, email, telefone);

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String exibeDados() {
        String dados = "\nCliente:"+this.nome+"\nCNPJ: "+this.cnpj+"\nEmail: "+this.email+"\nTelefone: "+this.telefone;
        return dados;
    }

}
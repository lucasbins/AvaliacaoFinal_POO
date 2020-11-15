public class pessoaJuridica extends Cliente
{
    String cnpj;
    
    public pessoaJuridica(String nome, String email, String telefone, String cnpj)
    {
        super (nome, email, telefone);
        
        this.cnpj = cnpj;
    }

  
}
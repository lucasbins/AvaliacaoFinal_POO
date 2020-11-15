public class pessoaFisica extends Cliente
{
    String cpf;
    
    public pessoaFisica(String nome, String email, String telefone, String Cpf)
    {
        super (nome, email, telefone);
        
        this.cpf = cpf;
    }

  
}

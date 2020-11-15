
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{
    String nome;
    String email;
    String telefone;
    
    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getTelefone(){return telefone;}
    
    
}

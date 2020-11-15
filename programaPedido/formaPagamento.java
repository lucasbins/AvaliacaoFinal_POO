public class formaPagamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int idForma;
    String forma;
    String descricao;
    
    
    public formaPagamento(int idForma, String forma, String descricao)
    {
        this.idForma = idForma;
        this.forma = forma;
        this.descricao = descricao;
    }
    
    public String exibePagamento(){
        return "Forma de pagamento " + forma;
    }
}

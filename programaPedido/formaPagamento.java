public class formaPagamento
{
    String forma;
    String descricao;

    public formaPagamento(String forma, String descricao)
    {
        this.forma = forma;
        this.descricao = descricao;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String exibeDados(){
        return "Forma de pagamento " + forma;
    }
}

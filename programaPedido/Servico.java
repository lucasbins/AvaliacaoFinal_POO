public class Servico
{
    String tipo;
    Double valorHora;
    String descricao;

    public Servico(String tipo, Double valorHora, String descricao)
    {
        this.tipo = tipo;
        this.valorHora = valorHora;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String exibeDados(){
        return "Serviço: " + tipo + "Valor Hora: " + valorHora;
    }

}

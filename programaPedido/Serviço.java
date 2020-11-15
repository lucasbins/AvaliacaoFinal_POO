public class Serviço
{
    String tipo;
    Double valorHora;
    String descricao;
    
    public Serviço(String tipo, Double valorHora, String descricao)
    {
        this.tipo = tipo;
        this.valorHora = valorHora;
        this.descricao = descricao;
    }

    public String exibeServico(){
        return "Serviço: " + tipo + "Valor Hora: " + valorHora;
    }
}

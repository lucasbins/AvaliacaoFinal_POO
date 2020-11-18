
public class Pedido {
    private Cliente cliente;
    private Servico servico;
    private double horas;
    private FormaPagamento formaPagamento;
    private char status;

    public Pedido(Cliente cliente, Servico servico, double horas, FormaPagamento formaPagamento, char status) {
        this.cliente = cliente;
        this.servico = servico;
        this.horas = horas;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double valorPedido( double valorHora) {
        return this.horas*valorHora;
    }

    public String exibeDados() {
        String dados = "Cliente:"+this.cliente.getNome()+"\nServico: "+this.servico.getTipo()+" - "+servico.getDescricao()+"\nHoras: "+this.horas+"\nPagamento:"+this.formaPagamento.getForma();
        String descricao_status = "Finalizado";
        if(this.status == 'P') {
            descricao_status = "Pendente";
        }
        dados = dados+"\nStatus: "+descricao_status;
        return dados;
    }
}

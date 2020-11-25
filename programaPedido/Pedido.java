    
    public class Pedido {
    private Cliente cliente;
    private Servico servico;
    private double horas;
    private boolean pagamento ;
    private boolean status;
    
    public Pedido(Cliente cliente, Servico servico, double horas, boolean pagamento, boolean status) {
        this.cliente = cliente;
        this.servico = servico;
        this.horas = horas;
        this.pagamento = pagamento;
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
    
    public boolean getPagamento() {
        return pagamento;
    }
    
    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public double valorPedido( double valorHora) {
        return this.horas*valorHora;
    }
    
    public String exibeDados() {
        String dados = "Cliente:"+this.cliente.getNome()+"\nServico: "+this.servico.getTipo()+" - "+servico.getDescricao()+"\nHoras: "+this.horas;
        String descricao_pagamento = "Pago";
        String descricao_status = "Finalizado";
        if(this.status == false) {
            descricao_status = "Pendente";
        }
        if(this.pagamento == false){
            descricao_pagamento = "Pendente";
        }
        
        dados = dados+"\nStatus: "+descricao_status+"\nStatus de Pagamento:"+descricao_pagamento;
        return dados;
    }
}

    
/**
* Escreva a descrição da classe Aplicação aqui.
* 
* @author Brenda Barbosa e Lucas Bins
* @version 1
*/
import java.util.Scanner;
import java.io.IOException;
public class Aplicacao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    
    public static void main(String[] args)throws IOException {
        int tipoCliente, cod, opc1, opc2, opc3 = 1;
    
        Scanner teclado = new Scanner(System.in);
    
        ClienteController cliente = new ClienteController();
        PedidoController pedido = new PedidoController();
        ServicoController servico = new ServicoController();
    
        do {
            System.out.print ('\u000C');
            menuPrincipal();
            opc1 = teclado.nextInt();
    
            switch (opc1) {
                case 0:
                    System.out.print ('\u000C');
                    System.out.println("Programa finalizado");
                break;
                case 1://CRUD PEDIDO
                    System.out.print ('\u000C');
                    menuPedidos();
                    opc2 = teclado.nextInt();
                    switch(opc2){
                        case 1://Cadastra o Pedido
                            System.out.print ('\u000C');
                            System.out.println("1-Buscar Cliente");
                            System.out.println("2-Cadastrar Novo Cliente");
                            opc3 = teclado.nextInt();
                            switch(opc3){
                                case 1:
                                    tipoCliente = listaClientesSimples(cliente);//lista os cliente com Codigo e Nome
                                    System.out.println("Digite o código do cliente: ");
                                    cod = teclado.nextInt()-1;
                                    cadastraPedido(pedido,cliente,servico, cod, tipoCliente);
                                    System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                                    break;
                    
                                case 2:
                                    tipoCliente = cadastraCliente(cliente);
                                    System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                                    System.in.read();
                                    if(tipoCliente ==1){
                                        cod = cliente.ultimoCadastroPf();
                                        cadastraPedido(pedido,cliente,servico, cod, tipoCliente);
                                        System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                                    }else if(tipoCliente == 2){
                                        cod = cliente.ultimoCadastroPf();
                                        cadastraPedido(pedido,cliente,servico, cod, tipoCliente);
                                        System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                                    }
                                    
                                break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                        break;
                        case 2://Lista Pedido
                            System.out.print ('\u000C');
                            listaPedidos(pedido);
                            System.in.read();
                        break;
                        case 3: //Busca Pedidos 
                            System.out.print ('\u000C');
                            System.out.print ("Buscar Pedidos\n");
                            System.out.println("1-Pedidos Pendentes");
                            System.out.println("2-Pedidos Finalizados");
                            System.out.println("3-Pedidos Pagos");
                            System.out.println("4-Pedidos sem Pagamento");
                            int tipoBusca = teclado.nextInt();
                            buscaPedido(pedido,tipoBusca);
                            System.in.read();
                        break;
                        case 4: //Excluir Pedidos
                            System.out.print ('\u000C');
                            excluiPedido(pedido);
                            System.out.println("\nExcluído com sucesso \nPressione enter para continuar");
                            System.in.read();
                        break;
                        default:
                            System.out.println("\nOpção inválida");
                        break;
                    }
                break;
    
                case 2://CRUD CLIENTE
                    System.out.print ('\u000C');
                    menuClientes();
                    opc2 = teclado.nextInt();
                
                    switch(opc2){
                        case 1:
                            cadastraCliente(cliente);
                            System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                            System.in.read();
                        break;
                    
                        case 2:
                            listaClientes(cliente);
                            System.out.println("\nPressione enter para continuar");
                            System.in.read();
                        break;
                        case 3: //Excluir Cliente
                            System.out.print ('\u000C');
                            System.out.println("Excluir pessoa Física(1) ou Jurídica(2)");
                            int tipoClienteExcluir = teclado.nextInt();
                            excluiCliente(cliente,tipoClienteExcluir);
                            System.out.println("\nExcluído com sucesso \nPressione enter para continuar");
                            System.in.read();
                        break;
                        default:
                        System.out.println("Opção inválida");
                        break;
                        
                    }
    
                break;
    
                case 3://CRUD SERVICO
                    System.out.print ('\u000C');
                    menuServicos();
                    opc2 = teclado.nextInt();
                    switch(opc2){
                        case 1:
                            cadastraServico(servico);
                            System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                            System.in.read();
                        break;
                        case 2:
                            listaServico(servico);
                            System.out.println("\nPressione enter para continuar");
                            System.in.read();
                        break;
                        case 3: 
                            System.out.print ('\u000C');
                            excluiServico(servico);
                            System.out.println("\nExcluído com sucesso \nPressione enter para continuar");
                            System.in.read();
                        break;
                        default:
                        System.out.println("Opção inválida");
                    }
                break;
    
                default:
                System.out.println("Opção inválida");
            }
        }while(opc1 != 0);
        System.exit(0);
    
    }
    
    public static int cadastraCliente(ClienteController cc) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastrar pessoa Física(1) ou Jurídica(2)");
        int tipoCliente = teclado.nextInt();
        teclado.nextLine();
        if(tipoCliente == 1) {
            System.out.println("Informe o nome");
            String nome = teclado.nextLine();
            
            System.out.println("Informe o email");
            String email = teclado.nextLine();
            
            System.out.println("Informe o telefone");
            String telefone = teclado.nextLine();
            
            System.out.println("Informe o CPF");
            String cpf = teclado.nextLine();
            PessoaFisica pf = new PessoaFisica(nome,email,telefone,cpf);
            cc.cadastraPf(pf);
            
        }else if(tipoCliente == 2){
            System.out.println("Informe o nome");
            String nome = teclado.nextLine();
            
            System.out.println("Informe o email");
            String email = teclado.nextLine();
            
            System.out.println("Informe o telefone");
            String telefone = teclado.nextLine();
            
            System.out.println("Informe o cnpj");
            String cnpj = teclado.nextLine();
    
            PessoaJuridica pj = new PessoaJuridica(nome,email,telefone,cnpj);
            cc.cadastraPj(pj);
        }else {
            System.out.println("Opção inválida");
        }
        return tipoCliente;
    }
    
    public static void cadastraServico(ServicoController ss){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastro de Serviço: ");
        
        System.out.println("Tipo de Serviço");
        String tipo = teclado.nextLine();
        System.out.println("Valor por Hora");
        Double valorHora = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Descrição do Serviço");
        String descricao = teclado.nextLine();
        
        Servico s = new Servico(tipo,valorHora,descricao);
        ss.cadastraServico(s);
    }
    
    //cadastra o pedido  com o codigo do cliente.
    public static void cadastraPedido(PedidoController pp, ClienteController cc, ServicoController ss, int cod, int tipoCliente){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cadastro de Pedido: ");
        listaServicoSimples(ss);
        System.out.println("Tipo de Serviços: ");
        int tipoServico = teclado.nextInt()-1;
        Servico servico = ss.buscaServico(tipoServico);
        
        System.out.println("Quantidade de horas de Trabalho: ");
        Double horas = teclado.nextDouble();
        
        System.out.println("Pagamento já realizado? (S)im / (N)ao");
        String status_pagamento = teclado.next();
        boolean pagamento = false;
        if(status_pagamento.equals("S") || status_pagamento.equals("s")){
            pagamento = true;
        }
                
        System.out.println("Pedido finalizado? (S)im / (N)ao");
        String status_pedido = teclado.next();
        boolean status = false;
        if(status_pedido.equals("S") || status_pedido.equals("s")){
            status = true;
        }
        Cliente c;
        if(tipoCliente == 1){
            c = cc.buscaClientePf(cod);
        }else{
            c = cc.buscaClientePj(cod);
        }
        Pedido p = new Pedido(c,servico,horas,pagamento,status);
        pp.cadastraPedido(p);
    }
    
    public static void buscaPedido(PedidoController pp, int tipo){
        System.out.print ('\u000C');
        Scanner teclado = new Scanner(System.in);
        int cod; 
        String opc;
        boolean alterar_status = true;
        switch(tipo){
            case 1:
                System.out.println("\nPedidos pendentes\n");
                pp.buscaPedidosStatus(false);
                alterar_status = true;
            break;
            case 2:
                System.out.println("\nPedidos finalizados\n");
                pp.buscaPedidosStatus(true);
                alterar_status = false;
            break;
            case 3:
                System.out.println("\nPedidos pagos\n");
                pp.buscaPedidosPagamento(true);
                alterar_status = false;
            break;
            case 4:
                System.out.println("\nPedidos com pagamentos pendentes\n");
                pp.buscaPedidosPagamento(false);
                alterar_status = true;
            default:
                System.out.println("\nOpção inválida");
            break;
        }
               
        System.out.println("\nDeseja atualizar o status de algum pedido? (S)im / (N)ão");
        opc = teclado.next();
        if(opc.equals("S") || opc.equals("s")){
            System.out.println("\nInforme o codigo do pedido");
            cod = teclado.nextInt()-1;
            Pedido pedido = pp.buscaPedido(cod);
            if(tipo <=2){
                pedido.setStatus(alterar_status);  
            }else{
                pedido.setPagamento(alterar_status);  
            }
            System.out.println("\nPedido atualizado com sucesso");
        }
    }
    
    public static void listaPedidos(PedidoController pp) {
        System.out.println("\nTodos os Pedidos");
        pp.listaPedidos();
    }
    
    public static void listaServico(ServicoController ss) {
        System.out.println("\nTodos os Tipos de Serviços");
        ss.listaServicos();
    }
    
    public static void listaServicoSimples(ServicoController ss) {
        System.out.println("\nTodos os Tipos de Serviços");
        ss.listaSimplesServico();
    }
    
    public static void listaClientes(ClienteController cc) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Listar pessoa Física(1) ou Jurídica(2)");
        int tipoCliente = teclado.nextInt();
        if(tipoCliente == 1) {
            cc.listaPf();
        }else if(tipoCliente == 2){
            cc.listaPj();
        }else{
            System.out.println("Opção inválida");
        }
    }
    
    public static int listaClientesSimples(ClienteController cc) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Listar pessoa Física(1) ou Jurídica(2)");
        int tipoCliente = teclado.nextInt();
        if(tipoCliente == 1) {
            cc.listaSimplesPf();
        }else if(tipoCliente == 2){
            cc.listaSimplesPj();
        }else{
            System.out.println("Opção inválida");
        }
        return tipoCliente;
    }
    
    public static void excluiPedido(PedidoController pp){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Excluir pedido");
        listaPedidos(pp);
        System.out.println("\nInforme o código do pedido a ser excluído");
        int codPedido = teclado.nextInt()-1;
        pp.removePedido(codPedido);
    }
    
    public static void excluiCliente(ClienteController cc, int tipo){
        Scanner teclado = new Scanner(System.in);
        if(tipo == 1){
            cc.listaSimplesPf();
            System.out.println("\nInforme o código do pedido a ser excluído");
            int codCliente = teclado.nextInt()-1;
            cc.removePf(codCliente);
        }else{
            cc.listaSimplesPj();
            System.out.println("\nInforme o código do pedido a ser excluído");
            int codCliente = teclado.nextInt()-1;
            cc.removePj(codCliente);
        }
    }
    
    public static void excluiServico(ServicoController ss){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nExcluir Servico\n");
        listaServicoSimples(ss);
        System.out.println("\nInforme o código do servico a ser excluído");
        int codServico = teclado.nextInt()-1;
        ss.removeServico(codServico);
    }
    
    public static void menuPrincipal() {
        System.out.println("Menu");
        System.out.println("1 - Pedidos");
        System.out.println("2 - Clientes");
        System.out.println("3 - Serviços");
        System.out.println("0 - Sair");
    }

    public static void menuPedidos() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar Pedidos");
        System.out.println("2 - Listar Pedidos");
        System.out.println("3 - Buscar Pedidos");
        System.out.println("4 - Excluir pedido");
        System.out.println("0 - Voltar");

    }

    public static void menuClientes() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar clientes");
        System.out.println("2 - Listar clientes");
        System.out.println("3 - Excluir cliente");
        System.out.println("0 - Voltar");
    }

    public static void menuServicos() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar servico");
        System.out.println("2 - Listar servico");
        System.out.println("3 - Excluir servico");
        System.out.println("0 - Voltar");
    }
}


/**
 * Escreva a descrição da classe Aplicação aqui.
 * 
 * @author Brenda Barbosa e Lucas Bins
 * @version 1
 */
import java.util.Scanner;
import java.io.IOException;
public class aplicacao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    public static void main(String[] args)throws IOException {
        int opc1,opc2,opc3 = 1;

        Scanner teclado = new Scanner(System.in);

        formaPagamento pagamento1 = new formaPagamento("Transferencia","Descrição transferencia");
        formaPagamento pagamento2 = new formaPagamento("Em dinheiro","Descricão pagamento em dinheiro");

        clienteController cliente = new clienteController();
        pedidoController pedido = new pedidoController();
        servicoController servico = new servicoController();

        do {
            System.out.print ('\u000C');
            menuPrincipal();
            opc1 = teclado.nextInt();

            switch (opc1) {
                case 0:
                    System.out.print ('\u000C');
                    System.out.println("Saindo");
                break;
                case 1:
                    System.out.print ('\u000C');
                    menuPedidos();
                    opc2 = teclado.nextInt();
                    switch(opc2){
                        case 1:
                            System.out.print ('\u000C');
                            System.out.println("1-Buscar Cliente");
                            System.out.println("2-Cadastrar Novo Cliente");
                            opc3 = teclado.nextInt();
                            switch(opc3){
                                case 1:
                                    cliente.listaSimplesPf(); //Busca somente o codigo e nome do cliente
                                   
                                    break;
                    
                                case 2:
                                    cadastraCliente(cliente);
                                    System.out.println("\nCadastrado com Sucesso \nPressione enter para continuar");
                                    System.in.read();
                                break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                        break;
                    }
                    System.out.println("Aqui vem pedidos");
                break;

                case 2:
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
                    
                        default:
                        System.out.println("Opção inválida");
                    }

                break;

                case 3:
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

    public static void cadastraCliente(clienteController cc) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastrar pessoa Física(1) ou Jurídica(2)");
        int tipoCliente = teclado.nextInt();
        teclado.nextLine();
        if(tipoCliente == 1) {
            System.out.println("Informe o nome, email, telefone e cpf");
            String nome = teclado.nextLine();
            String email = teclado.nextLine();
            String telefone = teclado.nextLine();
            String cpf = teclado.nextLine();
            pessoaFisica pf = new pessoaFisica(nome,email,telefone,cpf);
            cc.cadastraPf(pf);
        }else if(tipoCliente == 2){
            System.out.println("Informe o nome");
            String nome = teclado.nextLine();
            System.out.println("Informe o email");

            String email = teclado.nextLine();
            System.out.println("Informe o telefone");

            String cnpj = teclado.nextLine();
            System.out.println("Informe e cnpj");

            String telefone = teclado.nextLine();
            pessoaJuridica pj = new pessoaJuridica(nome,email,telefone,cnpj);
            cc.cadastraPj(pj);
        }else {
            System.out.println("Opção inválida");
        }

    }
    
    public static void cadastraServico(servicoController ss){
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
    public static void cadastraPedido(pedidoController pp, int num){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastro de Pedido: ");
        
        
    }
    
    public static void listaServico(servicoController ss) {
        System.out.println("\nTodos os Tipos de Serviços");
        ss.listaServicos();
    }
    
    public static void listaClientes(clienteController cc) {
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

    public static void menuPrincipal() {
        System.out.println("Menu");
        System.out.println("1 - Pedidos");
        System.out.println("2 - Clientes");
        System.out.println("3 - Serviços");
    }

    public static void menuPedidos() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar Pedidos");
        System.out.println("2 - Listar Pedidos");
        System.out.println("3 - Pedidos em Aberto");
        System.out.println("3 - Pedidos sem Pagamento");
    }

    public static void menuClientes() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar clientes");
        System.out.println("2 - Listar clientes");
    }

    public static void menuServicos() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar servico");
        System.out.println("2 - Listar servico");
        System.out.println("0 - Voltar");
    }
}

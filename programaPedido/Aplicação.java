
/**
 * Escreva a descrição da classe Aplicação aqui.
 * 
 * @author Brenda Barbosa e Lucas Bins
 * @version 1
 */
import java.util.Scanner;
public class Aplicação
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    public static void main(String[] args) {
        int opc1,opc2 = 1;

        Scanner teclado = new Scanner(System.in);

        FormaPagamento pagamento1 = new FormaPagamento("Transferencia","Descrição transferencia");
        FormaPagamento pagamento2 = new FormaPagamento("Em dinheiro","Descricão pagamento em dinheiro");

        ClienteController cliente = new ClienteController();
        PedidoController pedido = new PedidoController();

        do {
            menuPrincipal();
            opc1 = teclado.nextInt();

            switch (opc1) {
                case 0:
                System.out.println("Saindo");
                break;
                case 1:
                menuServicos();
                opc2 = teclado.nextInt();

                System.out.println("Aqui vem pedidos");
                break;

                case 2:
                menuClientes();
                opc2 = teclado.nextInt();
                if(opc2==1) {
                    cadastraCliente(cliente);
                }else if(opc2==2){
                    listaClientes(cliente);
                }else {
                    System.exit(0);
                }

                break;

                case 3:
                System.out.println("Aqui vem servicos");
                break;

                default:
                System.out.println("Opção inválida");
            }
        }while(opc1 != 0);
        System.exit(0);

    }

    public static void cadastraCliente(ClienteController cc) {
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
            PessoaFisica pf = new PessoaFisica(nome,email,telefone,cpf);
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
            PessoaJuridica pj = new PessoaJuridica(nome,email,telefone,cnpj);
            cc.cadastraPj(pj);
        }else {
            System.out.println("Opção inválida");
        }

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

    public static void menuPrincipal() {
        System.out.println("Menu");
        System.out.println("1 - Pedidos");
        System.out.println("2 - Clientes");
        System.out.println("3 - Serviços");
    }

    public static void menuPedidos() {
        System.out.println("Menu");
        System.out.println("1 - Opções pedido");
        System.out.println("2 - Clientes");
        System.out.println("3 - Serviços");
    }

    public static void menuClientes() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar clientes");
        System.out.println("2 - Listar clientes");
    }

    public static void menuServicos() {
        System.out.println("Menu");
        System.out.println("1 - Cadastrar servico");
    }
}

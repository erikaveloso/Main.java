import java.util.Scanner;
class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        double chequeEspecial = 1000.00;
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Cheque especial utilizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Conta Corrente ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Usar Cheque Especial");
            System.out.println("4. Exibir Dados");
            System.out.println("5. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a depositar: ");
                    double deposito = sc.nextDouble();
                    depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor a sacar: ");
                    double saque = sc.nextDouble();
                    sacar(saque);
                    break;
                case 3:
                    System.out.print("Valor do cheque especial: ");
                    double cheque = sc.nextDouble();
                    usarChequeEspecial(cheque);
                    break;
                case 4:
                    exibirDados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}

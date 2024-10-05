import java.util.Scanner;
class ContaPoupanca extends ContaBancaria {
    private final double selic;

    public ContaPoupanca(String titular, double selic) {
        super(titular);
        this.selic = selic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado. Novo saldo: R$ " + saldo);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Conta Poupança ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular Rendimento");
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
                    calcularRendimento();
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

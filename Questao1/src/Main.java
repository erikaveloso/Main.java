import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Informe:\n1 para Conta Corrente.\n2 para Conta Poupança.");
        int tipoConta = sc.nextInt();

        if (tipoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(titular);
            contaCorrente.menu();
        } else if (tipoConta == 2) {
            System.out.print("Informe a taxa Selic atual: ");
            double selic = sc.nextDouble();
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular, selic);
            contaPoupanca.menu();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Qual a distância percorrida?");
        c.setDistancia(dados.nextDouble());
        System.out.println("Qual o tempo de espera?");
        c.setTempoEspera(dados.nextInt());
        System.out.println("Qual o valor cobrado pela corrida?");
        c.setTarifaBase(dados.nextDouble());
        System.out.println("Digite o fator de demanda R$ (1,0 = normal, 1,5 = pico): ");
        c.setFatorDemanda(dados.nextDouble());
        c.calcularCorrida();
        c.exibirDetalhesCorrida();

    }
}
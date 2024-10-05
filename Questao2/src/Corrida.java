public class Corrida {
    private double distancia, tarifaBase, fatorDemanda, valorFinal;
    private int tempoEspera;

    public double getDistancia() {
        return distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void calcularCorrida(){
        valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida(){
        System.out.println("O valor final é: " + valorFinal);
        System.out.println("A distância é: " + distancia);
        System.out.println("O tempo de espera é: " + tempoEspera);
        System.out.println("A tarifa base é: " + tarifaBase);
        System.out.println("O fator da demanda é: " + fatorDemanda);
    }
}

package Interfaces;

public class Barco implements Veiculo, VeiculoAquatico {
    @Override
    public void mover() {
        System.out.println("Estou sobre escrevendo o método que está no meu pai (veiculo)");
    }

    @Override
    public void nadar() {
        System.out.println("O barco está nadando.");
    }
}

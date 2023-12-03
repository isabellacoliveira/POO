public class Quadrilatero {
    private double[][] pontos = new double[4][2];

    public Quadrilatero(double[][] pontos) {
        if (pontos.length != 4 || pontos[0].length != 2) {
            throw new IllegalArgumentException("Um quadrilátero deve ter quatro pontos, cada um com duas coordenadas (x, y).");
        }

        this.pontos = pontos;
    }

    public double[][] getPontos() {
        return pontos;
    }
}
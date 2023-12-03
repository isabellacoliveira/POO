public class Trapezio extends Quadrilatero {
    public Trapezio(double[][] pontos) {
        super(pontos);
    }

    public double calcularArea() {
        double baseMaior = Math.max(getPontos()[1][0], getPontos()[2][0]) - Math.min(getPontos()[0][0], getPontos()[3][0]);
        double baseMenor = Math.min(getPontos()[1][0], getPontos()[2][0]) - Math.max(getPontos()[0][0], getPontos()[3][0]);
        double altura = Math.abs(getPontos()[0][1] - getPontos()[1][1]);

        return ((baseMaior + baseMenor) / 2) * altura;
    }
}

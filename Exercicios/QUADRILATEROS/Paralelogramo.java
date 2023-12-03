public class Paralelogramo extends Quadrilatero {
    public Paralelogramo(double[][] pontos) {
        super(pontos);
    }

    public double calcularArea() {
        double base = Math.abs(getPontos()[0][0] - getPontos()[1][0]);
        double altura = Math.abs(getPontos()[0][1] - getPontos()[3][1]);

        return base * altura;
    }
}
public class Main {
    public static void main(String[] args) {
        double[][] pontosQuadrado = { { 0, 0 }, { 0, 2 }, { 2, 2 }, { 2, 0 } };
        double[][] pontosRetangulo = { { 0, 0 }, { 0, 4 }, { 6, 4 }, { 6, 0 } };
        double[][] pontosParalelogramo = { { 0, 0 }, { 1, 3 }, { 5, 3 }, { 4, 0 } };
        double[][] pontosTrapezio = { { 0, 0 }, { 2, 4 }, { 6, 4 }, { 8, 0 } };

        Quadrado quadrado = new Quadrado(pontosQuadrado);
        Retangulo retangulo = new Retangulo(pontosRetangulo);
        Paralelogramo paralelogramo = new Paralelogramo(pontosParalelogramo);
        Trapezio trapezio = new Trapezio(pontosTrapezio);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Paralelogramo: " + paralelogramo.calcularArea());
        System.out.println("Área do Trapézio: " + trapezio.calcularArea());
    }
}







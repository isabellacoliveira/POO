package SobrecargaDeConstrutores;

public class Caixa {
    private double largura;
    private double altura;
    private double profundidade;

    public Caixa(double l, double a, double p) {
        largura = l;
        altura = a;
        profundidade = p;
    }

    public Caixa() {
        largura = altura = profundidade = 2;
    }

    public Caixa(double comprimento) {
        largura = altura = profundidade = comprimento;
    }

    public double volume(){
        return largura * altura * profundidade;
    }
}

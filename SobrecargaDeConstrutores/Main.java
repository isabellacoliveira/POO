package SobrecargaDeConstrutores;

public class Main {
    public static void main(String [] args){
        Caixa minhaCaixa = new Caixa(10, 15, 20);
        Caixa minhaCaixa2 = new Caixa();
        Caixa meuCubo = new Caixa(7);

        System.out.println("Volume de minhaCaixa" + minhaCaixa.volume());
        System.out.println("Volume de minhaCaixa2" + minhaCaixa2.volume());
        System.out.println("Volume de meuCubo" + meuCubo.volume());
    }
}

package PassagemDeParametrosPorValorEReferencia;

public class Main {
    public static void main(String [] args){
        Parametro ob = new Parametro(10, 30);
        int i = 5, j = 8;

        System.out.println("i = " + i + ", j = " + j);
        System.out.println(ob);
        ob.metodo(i, j);
        ob.metodo(ob);
        System.out.println("i = " + i + ", j = " + j);
        System.out.println(ob);

    }
}

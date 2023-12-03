package PassagemDeParametrosPorValorEReferencia;

public class Parametro {
    private int a;
    private int b;

    public Parametro(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "a = " + a + ", b = " + b;
    }

    public void metodo(int i, int j){
        i *= 2;
        j /= 2;
    }

    public void metodo(Parametro ob){
        ob.a *= 2;
        ob.b /= 2;
    }
}

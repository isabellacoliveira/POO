package ObjetosComoParametros;

public class ParametroObjeto {
    private int a;
    private int b;

    public ParametroObjeto(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ParametroObjeto(ParametroObjeto x) {
        a = x.a;
        b = x.b;
    }
   
    public boolean equals(ParametroObjeto ob){
        return a == ob.a && b == ob.b;
    }
}

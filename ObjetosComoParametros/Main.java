package ObjetosComoParametros;

public class Main {
    public static void main(String [] args){
        ParametroObjeto ob1 = new ParametroObjeto(10, 20);
        ParametroObjeto ob2 = new ParametroObjeto(-1, -20);
        ParametroObjeto ob3 = new ParametroObjeto(ob1);
        
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}

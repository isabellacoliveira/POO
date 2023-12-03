package ControleDeAcesso;

public class Main {
    public static void main(String [] args){
        ControleAcesso ob = new ControleAcesso();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 30; erro
        ob.setC(30);
        System.out.println("a, b e c" + ob.a + ob.b + ob.getC());
    }
}

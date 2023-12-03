package Overloading;

public class Main {
    public static void main(String [] args){
        OverloadDemo overloadDemo = new OverloadDemo();

        System.out.println("Quadrado do inteiro 7 = " + overloadDemo.quadrado(7));
        System.out.println("Quadrado do double 7.5 = " + overloadDemo.quadrado(7.5));
    }
}

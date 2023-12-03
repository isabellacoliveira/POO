package Overloading;

public class OverloadDemo {
    public int quadrado(int intValue){
        System.out.println("quadrado chamado com um valor inteiro:" + intValue);
        return intValue * intValue;
    }
    public double quadrado(double doubleValue){
        System.out.println("quadrado chamado com um valor double:" + doubleValue);
        return doubleValue * doubleValue;
    }
}

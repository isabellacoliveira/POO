package Interfaces;

public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();
        barco.mover();
        barco.nadar();

        // chamar o garbage collector 
        System.gc();
    }
}


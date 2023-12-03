package Objeto;

import Objeto.temperatura.*;

public class Main {
    public static void main(String[] args){
        Conversor c1 = new Conversor();
        System.out.println(c1.celsiusParaFarenheit());

        Conversor2 c2 = new Conversor2();
        System.out.println(c2.celsiusParaFarenheit(35));

        Conversor3 c3 = new Conversor3();
        System.out.println(c3.celsiusParaFarenheit(35.7));

        Conversor4 c4 = new Conversor4();
        System.out.println(c4.celsiusParaFarenheit(29.5));
        System.out.println(c4.farenheitParaCelsius(-20.4));
    }
}

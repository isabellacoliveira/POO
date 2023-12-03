package Objeto.temperatura;

public class Conversor4 {
    public double celsiusParaFarenheit(double c){
        return 9 * c / 5 + 32;
    }
    public double farenheitParaCelsius(double f){
        return 5 * (f - 32) / 9;
    }
}

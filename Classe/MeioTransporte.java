public class MeioTransporte {
    public String tipo;
    public String marca;
    public String modelo;
    public short numeroLugares;
    public float velocidadeAtual;

    // Construtor
    public MeioTransporte(String tipo, String marca, String modelo, short numeroLugares, float velocidadeAtual){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroLugares = numeroLugares;
        this.velocidadeAtual = velocidadeAtual;
    }

    // Métodos 
    public void iniciarViagem(){
        acelerar(40);
    }

    public void interromperViagem(){
        frear();
    }

    public void acelerar(float velocidade){
        velocidadeAtual = velocidade;
    }

    public float frear(){
        return velocidadeAtual = 0;
    }

    public float obterVelocidade(){
        return velocidadeAtual;
    }

    
}
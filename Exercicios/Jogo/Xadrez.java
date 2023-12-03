package aula4;

// Ao comentar a classe Xadrez, o Java tenta criar um construtor padrão para a classeXadrez, porém, levando em consideração 
// que a classe JogoDeTabuleiro não tem umconstrutor padrão (sem argumentos), isso levaria a um erro de compilação. Ao comentar 
// o construtor da classe Xadrez, o compilador não gera automaticamente umconstrutor padrão, pois já existe um construtor definido 
// na classe pai(JogoDeTabuleiro). Como essa classe pai não tem um construtor sem argumentos,você deve fornecer uma chamada 
// explícita ao construtor usando super(1) (comoestava no código original) ou criar um construtor sem argumentos na 
// classe JogoDeTabuleiro.

public class Xadrez extends JogoDeTabuleiro{    
    // Xadrez() {    
        // super(1);    
        // System.out.println("Construtor de Xadrez");    
    // }    
    
    public static void main(String[] args) 
    {        
        Xadrez x = new Xadrez();    
    }
}
package aula4;

// Levando em consideração que o construtor dessa classe, não chama o construtor daclasse pai (Jogo), quando omitimos a chamada,
//  o Java tende a inserir uma chamadaimplícita ao construtor padrão (sem argumentos) da classe pai. Mas se a classe pai não 
//  tiver um construtor padrão, isso resultará em um erro de compilação ao tentar criar umainstância de JogoDeTabuleiro sem 
//  passar um argumento para o construtor ou semchamar explicitamente super(i) no construtor de JogoDeTabuleiro.

public class JogoTabuleiro extends Jogo{    
    JogoTabuleiro(int i) {        
        // super(i);        
        System.out.println("Construtor de JogoDeTabuleiro");    
    }
}
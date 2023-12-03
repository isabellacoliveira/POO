POO

Qual é a principal diferença entre uma classe e um objeto em Java?
Uma classe é uma representação abstrata de um objeto.

Explique o conceito de encapsulamento em programação orientada a objetos e 
forneça um exemplo de como ele pode ser implementado em Java.

Encapsulamento é o conceito da POO que permite que ocultemos atributos e dados internos de uma classe, e evita também manipulações indesejadas. Sendo assim, é benéfico o utilizar pois, podemos ter o controle de acesso de cada um dos atributos e manipular a interface pública sem que isso afete outros objetos. 

public class Aluno {
    public String nome;
    private String matricula;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }
}

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Isabella", "123");

        // conseguimos acessar a propriedade nome 
        System.out.println(aluno.nome);

        // nã conseguimos acessar matricula pois ela está como private na classe
        // erro: The field Aluno.matricula is not visibleJava(33554503)
        // System.out.println(aluno.matricula);

        // porém o método está publico, então conseguimos acessar matricula através dele 
        System.out.println(aluno.getMatricula());
    }
}

Suponha que você está desenvolvendo um sistema de gerenciamento de biblioteca em 
Java. Crie uma classe chamada "Livro" com atributos relevantes e métodos para 
empréstimo e devolução de livros. Use o conceito de abstração para explicar como 
sua classe "Livro" pode ser uma representação abstrata de um livro real.

O conceito de abstração é fazer a representação de entidades do mundo real. Sendo assim, considerando que temos Dados e Processos (os tipos de abstração). Então os objetos podem ser considerados como representações do mundo real, de forma que conseguimos representar o estado do objeto, suas ligações com outras entidades, seu comportamento e sua identidade. Assim, Livro pode ser uma representação abstrata do mundo real. 

package biblioteca;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Assim que acaba", true);

        System.out.println(livro.emprestimo());
        System.out.println(livro.devolucao());
    }
}

package biblioteca;

public class Livro {
    public String nomeLivro;
    public boolean estaAlugado;

    public Livro(String nomeLivro, boolean estaAlugado) {
        this.nomeLivro = nomeLivro; 
        this.estaAlugado = estaAlugado; 
    }

    public boolean emprestimo(){
        return estaAlugado;
    }

    public boolean devolucao(){
        return !estaAlugado;
    }
}


Qual das seguintes afirmações é verdadeira sobre o histórico de Java?
Foi inicialmente chamada de "Oak".


Em programação orientada a objetos, qual é a principal finalidade da abstração?
Ocultar informações do usuário final.

Considere um sistema de automação residencial em Java, onde você tem dispositivos 
como lâmpadas, termostatos e persianas. Proponha uma classe chamada "Dispositivo" 
que sirva como uma classe base para todos os dispositivos. Defina os atributos e 
métodos que essa classe "Dispositivo" deve ter. Além disso, explique como você 
usaria a herança para criar classes específicas para cada tipo de dispositivo, 
como "Lâmpada" e "Termostato", que herdam da classe base "Dispositivo".

Usaria a herança usando a palavra reservada "extends", assim todas as subclasses filhas de dispositivos herdariam atributos e métodos da classe-pai Dispositivo. Fazendo isso, teremos um grau de especialização, pois estaremos criando classes mais específicas através de classes mais genéricas. 

package edificio;

public class Dispositivo {
    public String tipo;

    public Dispositivo(String tipo) {
        this.tipo = tipo;
    }
}

package edificio;

public class Lampada extends Dispositivo {
    public boolean estaAcesa;

    public Lampada(boolean estaAcesa) {
        super("Vidro");
        this.estaAcesa = estaAcesa;
    }

    public boolean acenderLampada(){
        return estaAcesa;
    }

    public boolean apagarLampada(){
        return !estaAcesa;
    }
}


package edificio;

public class Persiana extends Dispositivo {
    public boolean abertaOuFechada;
    
    public Persiana(boolean abertaOuFechada) {
        super("Cortina");
        this.abertaOuFechada = abertaOuFechada;
    }

    public boolean abrirPersiana(){
        return abertaOuFechada;
    }

    public boolean fecharPersiana(){
        return !abertaOuFechada;
    }

}

package edificio;

public class Termostato extends Dispositivo{
    public boolean ligar;

    public Termostato(boolean ligar) {
        super("Mede temperatura");
        this.ligar = ligar;
    }

    public boolean ligarTermostato(){
        return ligar;
    }
    public boolean desligarTermostato(){
        return !ligar;
    }
}

package edificio;

public class Main {
    public static void main(String[] args){
        Dispositivo dispositivo = new Dispositivo("teste");
        Lampada lampada = new Lampada(true);
        Termostato termostato = new Termostato(false);
        Persiana persiana = new Persiana(true);

        System.out.println(lampada.acenderLampada());
        System.out.println(lampada.apagarLampada());

        System.out.println(termostato.ligarTermostato());
        System.out.println(termostato.desligarTermostato());

        System.out.println(persiana.abrirPersiana());
        System.out.println(persiana.fecharPersiana());

    }
}

Qual dos seguintes é usado para criar uma instância de uma classe em Java?
O operador new.

O que é herança em programação orientada a objetos?
A capacidade de uma classe adquirir atributos e métodos de outra classe.

Descreva o papel dos construtores em Java. Como você define um construtor 
em uma classe e por que eles são importantes?

O principal papel do construtor é instanciar a classe, ou seja, ele é um conjunto 
de instruções que são executadas inicialmente ao chamar o construtor. Ele define 
valores padrões para os objetos e atribui valores aos atributos. São importantes 
para que possamos instanciar a classe java e para manipulação de subclasses. 

Dê um exemplo de como a herança é implementada em Java. Crie duas classes 
relacionadas e explique como uma classe filha pode herdar atributos e métodos 
da classe pai.

package heranca; 

public class Animal {
    public String tipo; 
    public String nomeCientifico;

    public Animal(String tipo, String nomeCientifico) {
        this.tipo = tipo;
        this.nomeCientifico = nomeCientifico;
    }

    public String barulho(){
        return "barulho do animal";
    }
}


package heranca;

public class Cachorro extends Animal {
    public String raca;
    
    public Cachorro(String raca, String tipo, String nomeCientifico) {
        super(tipo, nomeCientifico);
        this.raca = raca;
    }

    @Override
    public String barulho(){
        return "auauauau";
    }
}

package heranca;

public class Main {
    public static void main(String [] args){
        Cachorro cachorro = new Cachorro("Toby", "teste", "teste tambem");

        System.out.print(cachorro.barulho());
    }    
}

neste exemplo a classe pai é Animal, ao usar "extends" isso permite que a classe 
filha herde os atributos da classe pai. Assim, Animal passa a ser a superclasse 
e a Cachorro passa a ser a subclasse, depois, temos que declarar "super()" dentro 
da classe filha, e fazer com que a mesma receba os atributos da classe pai, caso 
não passemos nada para o super, neste caso isso resultará num erro de compilação. 
Isso porque o java irá procurar um construtor padrão da classe pai, mas neste 
caso o construtor de Animal não é padrão pois ele possui argumentos. 
E quanto aos métodos, os métodos da classe pai são sobreescritos na classe 
filha, usando a notação overriding, e o java passa a tratar ambos os métodos 
(objetos) , como se fossem um único. Isso abrange o conceito de Polimorfismo.


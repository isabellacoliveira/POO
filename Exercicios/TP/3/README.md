Uma classe abstrata Java é uma classe que não pode ser instanciada. Isso significa que você não pode criar novas instâncias de uma classe abstrata. Funciona como base para subclasses. Você deve aprender sobre a herança Java antes de tentar este desafio.

A seguir está um exemplo de classe abstrata:

 classe  abstrata Livro { 
    String  título ; 
    abstrato  void  setTitle ( String  s ); 
    String  getTítulo (){ 
        return  título ; 
    } 
}
Se você tentar criar uma instância desta classe como a linha a seguir, você receberá um erro:

Livro  novo_romance = novo  livro (); 
Você precisa criar outra classe que estenda a classe abstrata. Então você pode criar uma instância da nova classe.

Observe que o método setTitle também é abstrato e não possui corpo. Isso significa que você deve implementar o corpo desse método na classe filha.

No editor, fornecemos a classe abstrata Book e uma classe Main . Na classe Main, criamos uma instância de uma classe chamada MyBook . Sua tarefa é escrever apenas a classe MyBook .

Sua aula não deve ser pública.

Exemplo de entrada

A tale of two cities
Saída de amostra

The title is: A tale of two cities
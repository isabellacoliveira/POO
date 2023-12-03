A classe Java Iterator pode ajudá-lo a iterar cada elemento de uma coleção. Aqui está um exemplo simples:

importar  java.util.* ; 
Exemplo de classe pública  { 

    public  static  void  main ( String  [] args ){ 
        ArrayList  minhalista  =  new  ArrayList (); 
        minha lista . adicione ( "Olá" ); 
        minha lista . adicionar ( "Java" ); 
        minha lista . adicione ( "4" ); 
        Iterador  it  =  mylist . iterador (); 
        while ( it . hasNext ()){ 
            Elemento do objeto  = it . próximo (); Sistema . fora . println (( String ) elemento ); } } }  
            
        
    

Neste problema você precisa completar um método func . O método recebe um ArrayList como entrada. Nesse ArrayList há um ou mais números inteiros, então há uma string especial "###", depois disso há uma ou mais outras strings. Um exemplo de ArrayList pode ter esta aparência:

element[0]=>42
element[1]=>10
element[2]=>"###"
element[3]=>"Hello"
element[4]=>"Java"
Você deve modificar o método func editando at most 2 linespara que o código imprima apenas os elementos após a string especial "###". Para o exemplo acima a saída será:

Hello
Java
Nota: O stdin não contém a string "###" , ela é adicionada no método principal .

Para restaurar o código original no editor, clique no ícone superior esquerdo do editor e crie um novo buffer.
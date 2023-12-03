Usando herança , uma classe pode adquirir as propriedades de outras. Considere a seguinte classe Animal :

classe  Animal { 
    void  walk (){ 
        Sistema . fora . println ( "Estou andando" ); 
    } 
}
Esta classe possui apenas um método, walk . A seguir, queremos criar uma classe Bird que também possua um método fly . Fazemos isso usando a palavra-chave extends :

class  Bird  estende  Animal  { 
    void  fly ()  { 
        System . fora . println ( "Estou voando" ); 
    } 
}
Finalmente, podemos criar um objeto Bird que pode voar e andar .

 solução de classe  pública { public static void main ( String [] args ){
       

      Pássaro  pássaro  =  novo  Pássaro (); 
      pássaro . andar (); 
      pássaro . voar (); 
   } 
}
O código acima irá imprimir:

I am walking
I am flying
Isso significa que um objeto Bird possui todas as propriedades de um objeto Animal, bem como algumas propriedades exclusivas adicionais.

O código acima é fornecido para você em seu editor. Você deve adicionar um método sing à classe Bird e, em seguida, modificar o método main de acordo para que o código imprima as seguintes linhas:

I am walking
I am flying
I am singing
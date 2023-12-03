Quando uma subclasse herda de uma superclasse, ela também herda seus métodos; entretanto, também pode substituir os métodos da superclasse (bem como declarar e implementar novos). Considere a seguinte classe de esportes :

class  Esportes { 
    String  getName (){ 
        return  "Esportes Genéricos" ; 
    } 
    void  getNumberOfTeamMembers (){ 
        Sistema . fora . println (  "Cada equipe tem n jogadores em "  +  getName ()  ); 
    } 
}
A seguir, criamos uma classe Soccer que herda da classe Sports . Podemos substituir o método getName e retornar uma string diferente, específica da subclasse:

class  Futebol  estende  Esportes { 
    @Override 
    String  getName (){ 
        return  "Classe de Futebol" ; 
    } 
}
Nota: Ao substituir um método, você deve precedê-lo com a @Overrideanotação. O(s) parâmetro(s) e o tipo de retorno de um método substituído devem ser exatamente iguais aos do método herdado do supertipo.

Tarefa
Complete o código em seu editor escrevendo um método getNumberOfTeamMembers substituído que imprime a mesma instrução que o método getNumberOfTeamMembers da superclasse , exceto que ele substituicom(o número de jogadores em um time de futebol).

Formato de saída

Quando executado, seu código concluído deverá imprimir o seguinte:

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
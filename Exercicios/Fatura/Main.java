import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informações da Fatura: ");
        System.out.println("Por favor, insira o número da peça: ");
        String numeroPeca = leitor.nextLine();
        
        System.out.println("Por favor, insira a descrição da peça: ");
        String descricaoPeca = leitor.nextLine();
        
        Fatura minhaFatura = new Fatura(numeroPeca, descricaoPeca, 0, 0);
        
        System.out.println("Bem-vindo(a), ao Sistema de Cálculo de Faturas.");
        System.out.println("Por favor, digite a quantidade de itens comprados: ");
        int quantidadeItem = leitor.nextInt();
        
        System.out.println("Por favor, digite a o preço do(s) item(s) comprado(s): ");
        int precoItem = leitor.nextInt();
        
        minhaFatura.setQuantidadeDoItemComprado(quantidadeItem);
        minhaFatura.setPrecoPorItem(precoItem);
        
        int valorFatura = minhaFatura.obterValorFatura();
        
        System.out.println("Informações Inicializadas: ");
        System.out.println("Número de Peça: " + minhaFatura.getNumeroDePeca());
        System.out.println("Descrição da Peça: " + minhaFatura.getDescricaoDaPeca());
        System.out.println("Quantidade do Item Comprado: " + minhaFatura.getQuantidadeDoItemComprado());
        System.out.println("Preço por Item: " + minhaFatura.getPrecoPorItem());
        System.out.println("Valor da Fatura: " + valorFatura);
    }
}
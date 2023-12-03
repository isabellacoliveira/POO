public class Fatura {
    String numeroDePeca;
    String descricaoDaPeca;
    int quantidadeDoItemComprado;
    int precoPorItem;

    public Fatura(String numeroDePeca, String descricaoDaPeca, int quantidadeDoItemComprado, int precoPorItem) {
        this.numeroDePeca = numeroDePeca;
        this.descricaoDaPeca = descricaoDaPeca;
        this.quantidadeDoItemComprado = quantidadeDoItemComprado;
        this.precoPorItem = precoPorItem;
      }
    
      public String getNumeroDePeca() {
        return numeroDePeca;
      }
 
      public void getNumeroDePeca(String numeroDePeca) {
        this.numeroDePeca = numeroDePeca;
      }

      public String getDescricaoDaPeca() {
        return descricaoDaPeca;
      }
 
      public void setDescricaoDaPeca(String descricaoDaPeca) {
        this.descricaoDaPeca = descricaoDaPeca;
      }

      public int getQuantidadeDoItemComprado() {
        return quantidadeDoItemComprado;
      }
 
      public void setQuantidadeDoItemComprado(int quantidadeDoItemComprado) {
        this.quantidadeDoItemComprado = quantidadeDoItemComprado;
      }

      public int getPrecoPorItem() {
        return precoPorItem;
      }
 
      public void setPrecoPorItem(int precoPorItem) {
        this.precoPorItem = precoPorItem;
      }

      public int obterValorFatura() {
        if(quantidadeDoItemComprado < 0){
            quantidadeDoItemComprado = 0;
        }

        if(precoPorItem < 0){
            precoPorItem = 0;
        }


        return quantidadeDoItemComprado * precoPorItem;
      }

}
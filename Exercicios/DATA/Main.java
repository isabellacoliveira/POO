public class Main{
    public static void main(String[] args) {
        Data data1 = new Data(31, 12, 2023);
        Data data2 = new Data(1, 1, 2024);

        System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
        System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

        int comparacao = data1.compara(data2);
        if (comparacao == 0) {
            System.out.println("As datas são iguais.");
        } else if (comparacao == 1) {
            System.out.println("Data 1 é maior que Data 2.");
        } else {
            System.out.println("Data 2 é maior que Data 1.");
        }

        System.out.println("Mês da Data 1: " + data1.getMesExtenso());
        System.out.println("Ano bissexto para Data 1: " + data1.isBissexto());

        Data data1Clone = data1.clone();
        System.out.println("Clone da Data 1: " + data1Clone.getDia() + "/" + data1Clone.getMes() + "/" + data1Clone.getAno());
    }
}

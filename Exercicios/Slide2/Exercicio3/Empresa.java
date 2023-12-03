package Exercicios.Slide2.Exercicio3;

public class Empresa extends Empregado{
    public String razaoSocial;
    public String cnpj;
    public String fone;

    public Empresa(String razaoSocial, String cnpj, String fone, String nome, double salario, String empresa) {
        super(nome, salario, empresa);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.fone = fone;
    }
}

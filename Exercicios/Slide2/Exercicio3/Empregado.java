package Exercicios.Slide2.Exercicio3;

public class Empregado {
    public String nome;
    public double salario;
    public String empresa;

    public Empregado(String nome, double salario, String empresa) {
        this.nome = nome;
        this.salario = salario;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

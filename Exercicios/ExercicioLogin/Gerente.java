class Gerente extends Funcionario implements Autenticavel {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void autenticar() {
        System.out.println("Gerente autenticado.");
    }
}
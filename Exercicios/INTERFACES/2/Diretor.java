class Diretor extends Funcionario implements Autenticavel {
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void autenticar() {
        System.out.println("Diretor autenticado.");
    }
}
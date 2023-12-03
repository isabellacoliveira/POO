public class Main {
    public static void main(String[] args) {
        Secretario secretario = new Secretario("João", 3000);
        Diretor diretor = new Diretor("Carlos", 5000);
        Gerente gerente = new Gerente("Ana", 4000);
        Engenheiro engenheiro = new Engenheiro("Mário", 3500);
        Cliente cliente = new Cliente();

        secretario.autenticar();
        diretor.autenticar();
        gerente.autenticar();
        cliente.autenticar();
    }
}
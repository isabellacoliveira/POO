public class Main{
    public static void main(String[] args) {
        // Exemplo de uso do SistemaInterno
        SistemaInterno sistema = new SistemaInterno();
    
        // Implementação da interface Autenticavel em uma classe concreta (por exemplo, Usuario)
        Autenticavel usuario = new Usuario("usuario123");
    
        // Tentativa de login
        sistema.login(usuario, "usuario123"); // Deve imprimir "Login bem-sucedido!"
        sistema.login(usuario, "senhaErrada"); // Deve imprimir "Senha incorreta. Falha no login."
    }
}
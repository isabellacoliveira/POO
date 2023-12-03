
// Classe SistemaInterno
public class SistemaInterno {
    public boolean login(Autenticavel objetoAutenticavel, String senha) {
        if (objetoAutenticavel.autentica(senha)) {
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("Senha incorreta. Falha no login.");
            return false;
        }
    }
}
// Implementação da interface Autenticavel em uma classe concreta (por exemplo, Usuario)
class Usuario implements Autenticavel {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}
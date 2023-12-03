interface Autenticavel {
    boolean autentica(String senha){
        if(senha == 'Senha123'){
            return true; 
        }
        return false; 
    }
}
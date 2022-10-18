public class GerenciadorGerencia extends Gerenciador {

    @Override
    public void verificar(Email email) {
        if(email.getDestino().equalsIgnoreCase("gerencia@colmeira.com") ||
            email.getAssunto().equalsIgnoreCase("Gerência") ||
            email.getAssunto().equalsIgnoreCase("Gerencia")){
            System.out.println("Enviado para o departamento gerencial.");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}

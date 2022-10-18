public class GerenciadorComercial extends Gerenciador {
    @Override
    public void verificar(Email email) {
        if(email.getDestino().equalsIgnoreCase("comercial@colmeira.com") ||
            email.getAssunto().equalsIgnoreCase("Comercial")){
            System.out.println("Enviado para o departamento comercial.");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}

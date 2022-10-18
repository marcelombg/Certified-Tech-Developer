public class GerenciadorTecnico extends Gerenciador {

    @Override
    public void verificar(Email email) {
        if(email.getDestino().equalsIgnoreCase("tecnica@colmeira.com") ||
            email.getAssunto().equalsIgnoreCase("Técnico")||
                email.getAssunto().equalsIgnoreCase("Tecnico")){
            System.out.println("Enviado para o departamento técnico.");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}

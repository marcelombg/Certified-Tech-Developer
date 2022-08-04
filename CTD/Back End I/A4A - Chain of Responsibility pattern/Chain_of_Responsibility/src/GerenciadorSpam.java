public class GerenciadorSpam extends Gerenciador {

    @Override
    public void verificar(Email email){
        System.out.println("Marcado como spam");
    }
}

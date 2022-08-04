public class Peso extends Gerenciador{
    @Override
    public void verificar(Artigo artigo) {
        if(artigo.getPeso() > 1199 && artigo.getLote() < 1301){
            System.out.println("Peso está dentro do esperado");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(artigo);
                System.out.println("Peso está fora do esperado");
            }
        }
    }
}

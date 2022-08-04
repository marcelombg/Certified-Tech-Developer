public class Lote extends Gerenciador{
    @Override
    public void verificar(Artigo artigo) {
        if(artigo.getLote() > 999 && artigo.getLote() < 2001){
            System.out.println("Lote está dentro do esperado");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(artigo);
                System.out.println("Lote está fora do esperado");
            }
        }
    }
}

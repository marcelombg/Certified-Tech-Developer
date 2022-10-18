public class Embalagem extends Gerenciador {
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getEmbalagem().equalsIgnoreCase("saudável") ||
                artigo.getEmbalagem().equalsIgnoreCase("saudavel") ||
                artigo.getEmbalagem().equalsIgnoreCase("quase saudável") ||
                artigo.getEmbalagem().equalsIgnoreCase("quase saudavel")) {
            System.out.println("Embalagem está dentro do esperado");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(artigo);
                System.out.println("Embalagem está fora do esperado");
            }
        }
    }
}

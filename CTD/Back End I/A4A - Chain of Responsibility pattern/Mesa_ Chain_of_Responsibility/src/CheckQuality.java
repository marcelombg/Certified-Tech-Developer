public class CheckQuality {

    Gerenciador inicial;

    public CheckQuality(){
        this.inicial = new Lote();
        Gerenciador peso = new Peso();
        Gerenciador embalagem = new Embalagem();

        inicial.setGerenciadorSeguinte(peso);
        peso.setGerenciadorSeguinte(embalagem);
    }

    public void verificar(Artigo artigo){
        inicial.verificar(artigo);
    }

}

package Filmes;

public interface IGradeDeFilmes {
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException;

}

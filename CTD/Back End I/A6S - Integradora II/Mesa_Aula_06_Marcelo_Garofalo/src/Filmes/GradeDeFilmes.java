package Filmes;

public class GradeDeFilmes implements IGradeDeFilmes {

    @Override
    public Filme getFilme(String nomeFilme) {
        Filme f = null;

        switch (nomeFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "Argentina",
                        "www.wtiger.com");
                break;
            case "O Auto da Compadecida":
                f = new Filme("O Auto da Compadecida", "Brasil",
                        "www.auto.com.br");
                break;
            case "Batatinha":
                f = new Filme("Batatinha", "Colômbia",
                        "www.batatinha.com");
                break;
        }
        return f;
    }
}
import Filmes.FilmeNaoHabilitadoException;
import Filmes.GradeDeFilmes;
import Filmes.GradeDeFilmesProxy;
import Filmes.Ip;
import Series.Serie;
import Series.SerieNaoHabilitadaException;
import Series.SerieProxy;


public class Main {

    //Instanciando os filmes

    public static void main(String[] args) throws SerieNaoHabilitadaException, FilmeNaoHabilitadoException {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(20, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

        proxy.setIp(new Ip(60, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

        //Instanciando as séries

        SerieProxy serieProxy = new SerieProxy(new Serie());
        try{
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("Westworld"));
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("Westworld"));
            System.out.println(serieProxy.getSerie("Reacher"));
            System.out.println(serieProxy.getSerie("Black Bird"));
            System.out.println(serieProxy.getSerie("Black Bird"));
            System.out.println(serieProxy.getSerie("Reacher"));
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("The Sandman"));
            System.out.println(serieProxy.getSerie("The Sandman"));

        }
        catch (SerieNaoHabilitadaException a){
            System.out.println(a);
        }

    }
}

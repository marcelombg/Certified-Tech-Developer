package Series;
import java.util.HashSet;

public class SerieProxy implements ISerie{

    Serie serie = new Serie();
    HashSet<String> qtdViews = new HashSet<String>();

    public SerieProxy(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String getSerie(String nomeSerie) throws SerieNaoHabilitadaException{
        if(qtdViews.contains(nomeSerie)){
            System.out.println(nomeSerie + " já está na lista!");
            return serie.getLinkSerie("www" + nomeSerie);
        }
        else if(qtdViews.size() < 6){
                qtdViews.add(nomeSerie);
                System.out.println(nomeSerie + " foi adicionado(a)!");
                return serie.getLinkSerie("www" + nomeSerie);
        } else{
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas!");
        }
    }
}

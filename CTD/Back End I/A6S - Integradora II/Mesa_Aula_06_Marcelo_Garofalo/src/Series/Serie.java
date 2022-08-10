package Series;

public class Serie implements ISerie {

    private String nomeSerie;
    private String linkSerie;

    public Serie(String nomeSerie, String linkSerie) {
        this.nomeSerie = nomeSerie;
        this.linkSerie = linkSerie;
    }

    public Serie() {
    }

    public String getNomeSerie(String nomeSerie) {
        return this.nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public String getLinkSerie(String linkSerie) {
        return this.linkSerie;
    }

    public void setLinkSerie(String linkSerie) {
        this.linkSerie = linkSerie;
    }


    @Override
    public String getSerie(String nomeSerie) throws SerieNaoHabilitadaException {
        return null;
    }
}
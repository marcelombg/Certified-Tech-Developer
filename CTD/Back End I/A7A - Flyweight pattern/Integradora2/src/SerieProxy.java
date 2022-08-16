public class SerieProxy implements ISerie{
    private Serie serie;

    private int qtdVezesNaSemana;

    public SerieProxy(Serie serie) {
        this.serie = serie;
    }

    public int getQtdVezesNaSemana() {
        return qtdVezesNaSemana;
    }

    @Override
    public String getSerie(String nome) throws SerieException {
        if(nome.equalsIgnoreCase(serie.getNome())) {
            this.qtdVezesNaSemana++;
        }
        if (getQtdVezesNaSemana() < 6) {
            return serie.getLink();
        } throw new SerieException(nome + ", nao esta disponivel ou a quantidade de 5 downloads por semana foi execedida.");
    }
}

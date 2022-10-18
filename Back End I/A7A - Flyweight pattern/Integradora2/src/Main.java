public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Euphoria");
        SerieProxy serieProxy1 = new SerieProxy(serie1);

        serie1.getSerie(serie1.getNome());

        try {
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
            System.out.println(serieProxy1.getSerie(serie1.getNome()));
        } catch (SerieException e) {
            System.out.println(e);
        }
    }
}
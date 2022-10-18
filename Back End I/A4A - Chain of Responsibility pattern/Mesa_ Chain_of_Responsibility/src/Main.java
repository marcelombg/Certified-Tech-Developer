public class Main {

    public static void main(String[] args) {

        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(new Artigo("A", 500, 1200, "ruim"));
        checkQuality.verificar(new Artigo("B", 1000, 5, "boa"));
        checkQuality.verificar(new Artigo("C", 300, 200, "saudável"));
        checkQuality.verificar(new Artigo("D", 100, 300, "quase saudável"));
    }
}

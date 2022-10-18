public class Main {

    public static void main(String[] args) {

        ComputadorFactory computadorFactory = new ComputadorFactory();

        Computador mac1 = computadorFactory.getComputador(8, 500);
        System.out.println(mac1.toString());

        Computador windows1 = computadorFactory.getComputador(16, 128);
        System.out.println(windows1.toString());

        Computador mac2 = computadorFactory.getComputador(8, 500);
        System.out.println(mac2.toString());

        Computador windows2 = computadorFactory.getComputador(16, 128);
        System.out.println(windows2.toString());
    }

}

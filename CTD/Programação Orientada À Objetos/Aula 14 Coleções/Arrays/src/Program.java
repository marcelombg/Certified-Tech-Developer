public class Program {

    public static void main(String[] args) {

        String[] nomes = new String[6];

        nomes[0] = "Edson";
        nomes[1] = "Hudson";
        nomes[2] = "Fernando";
        nomes[3] = "Sorocaba";
        nomes[4] = "Simaria";
        nomes[5] = "Joana";


        //System.out.println(nomes[2]);

        //for
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Índice [" +i+"]: "+nomes[i]);
        }

        //while
        int j = 0;
        while (j < nomes.length) {
            System.out.println("Índice [" +j+"]: "+nomes[j]);
            j++;
        }

        //for each
        int k = 0;
        for (String n : nomes){
            System.out.println("Índice [" +k+"]: "+nomes[k]);
            k++;
        }

    }

}

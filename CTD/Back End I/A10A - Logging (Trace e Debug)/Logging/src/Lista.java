import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Lista extends Exception {

    private int inteiro;

    private ArrayList listaInteiros = new ArrayList<>();


    public Lista(int inteiro, ArrayList listaInteiros) {
        this.inteiro = inteiro;
        this.listaInteiros = listaInteiros;
    }

    public int getInteiro() {
        return inteiro;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public ArrayList getListaInteiros() {
        return listaInteiros;
    }

    public void setListaInteiros(ArrayList listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    public double mediaLista() throws Exception {
        int total = 0;

        for( Object numero : listaInteiros)
        {
            total = total + numero;
        }


        public void mensagemLista1() throws Exception {

        if (listaInteiros.size() > 6) {
            System.out.println("Quando a lista tiver mais de 5 itens");
        } else if (listaInteiros.size() > 11) {
            System.out.println("Quando a lista tiver mais de 10 itens");
        } else if (listaInteiros.size() <= 0) {
            throw new Exception();
        } else {
        }
    }

//        for(listaInteiros : item) {}

//        int sum = 0;
//        for (int i = 0; i < listaInteiros.size(); i++) {
//            sum+=listaInteiros[i];
//        }
//        System.out.println("Array Sum = "+sum);


//        double mediaLista = (listaInteiros.size())
    }


}

import entities.Impressora;
import entities.ImpressoraCannon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        ImpressoraEpson e1 = new ImpressoraEpson("LX123","USB", LocalDate.now(),20,20.0);
        System.out.println(e1);

        ImpressoraCannon c1 = new ImpressoraCannon("ABC123","USB", LocalDate.now(),10,10.0);
        System.out.println(c1.precisaTinta());

    }
}

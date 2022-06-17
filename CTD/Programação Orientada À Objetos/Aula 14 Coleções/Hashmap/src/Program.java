import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map mapa = new HashMap();
        mapa.put(1, "Matheus");
        mapa.put(2, "Marcia");
        mapa.put(3, "Marcelo");
        mapa.put(4, "Monica");
        mapa.put(5, "Maria");
        mapa.put(6, "Marcos");

        System.out.println("Busca pela chave 1: ");
        System.out.println(mapa.get(1));

        System.out.println("Usando FOR EACH");
        for(Object obj: mapa.values()){
            System.out.println(obj);
        }

    }


}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List nossaLista = new ArrayList();

        nossaLista.add("A");
        nossaLista.add("B");
        nossaLista.add("C");
        nossaLista.add("D");
        nossaLista.add("E");
        nossaLista.add("F");

        System.out.println("Tamanho da lista: " + nossaLista.size());

        for (int i=0; nossaLista.size() > i; i++ ){
            System.out.println(nossaLista.get(i));
        }

        //ITERATOR
        Iterator it = nossaLista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Object obj : nossaLista){
            System.out.println((String)obj);
        }

    }

}

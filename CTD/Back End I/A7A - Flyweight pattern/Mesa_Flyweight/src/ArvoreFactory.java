import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> arvoreMap = new HashMap<>();

    public Arvore getArvore(int altura, int largura){
        String id = "ID: " + altura + ":" + largura;

        System.out.println(id);

        if (arvoreMap.containsKey(id)){
            Arvore arvore = arvoreMap.get(id);
            arvore.setContador(arvore.getContador()+1);
            System.out.println("Árvore obtida");
            return arvore;
        } else {
            arvoreMap.put(id, new Arvore(altura,largura));
            System.out.println("Árvore criada");
            return arvoreMap.get(id);
        }

    }

}

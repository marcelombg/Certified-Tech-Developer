import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> computadorMap = new HashMap<>();

    public Computador getComputador(int ram, int hd){
        String id = "id: " + ram + ":" + hd;

        System.out.println(id);

        if (computadorMap.containsKey(id)){
            Computador computador = computadorMap.get(id);
            computador.setContador(computador.getContador()+1);
            System.out.println("PC obtido");
            return computador;
        } else {
            computadorMap.put(id, new Computador(ram, hd));
            System.out.println("PC criado");
            return computadorMap.get(id);
        }
    }
}

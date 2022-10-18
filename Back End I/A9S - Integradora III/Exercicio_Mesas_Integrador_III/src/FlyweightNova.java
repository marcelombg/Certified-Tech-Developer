import java.util.HashMap;
import java.util.Map;

public class FlyweightNova {

    private Map<String, Roupa> roupaNovaMap = new HashMap<>();

    public Roupa obterRoupaNova(String nova){
        Roupa roupaNova = roupaNovaMap.get(nova);

        if(nova.equalsIgnoreCase("Nova")){
            roupaNova = new Roupa(nova);
            roupaNovaMap.put(nova, roupaNova);
        }
        return roupaNova;

    }

    public Map<String, Roupa> getRoupaNovaMap() {
        return roupaNovaMap;
    }
}

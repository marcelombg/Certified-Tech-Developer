import java.util.HashMap;
import java.util.Map;

public class FlyweightTamanhoS {

    private Map<String, Roupa> tamanhoSMap = new HashMap<>();

    public Roupa obterTamanhoS(String tamanho){
        Roupa roupaTamanhoS = tamanhoSMap.get(tamanho);

        if (tamanho.equalsIgnoreCase("Tamanho S")){
            roupaTamanhoS = new Roupa(tamanho);
            tamanhoSMap.put(tamanho, roupaTamanhoS);

        }
        return roupaTamanhoS;
    }

    public Map<String, Roupa> getTamanhoSMap() {
        return tamanhoSMap;
    }
}

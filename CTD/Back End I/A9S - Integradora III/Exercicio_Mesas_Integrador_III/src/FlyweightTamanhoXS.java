import java.util.HashMap;
import java.util.Map;

public class FlyweightTamanhoXS {

    private Map<String, Roupa> tamanhoXSMap = new HashMap<>();

    public Roupa obterTamanhoXS(String tamanho){
        Roupa roupaTamanhoXS = tamanhoXSMap.get(tamanho);

        if (tamanho.equalsIgnoreCase("Tamanho XS")){
            roupaTamanhoXS = new Roupa(tamanho);
            tamanhoXSMap.put(tamanho, roupaTamanhoXS);

        }
        return roupaTamanhoXS;
    }

    public Map<String, Roupa> getTamanhoXSMap() {
        return tamanhoXSMap;
    }
}

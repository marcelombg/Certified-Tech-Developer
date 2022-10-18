import java.util.HashMap;
import java.util.Map;

public class FlyweightTamanhoM {

    private Map<String, Roupa> tamanhoMMap = new HashMap<>();

    public Roupa obterTamanhoM(String tamanho){
        Roupa roupaTamanhoM = tamanhoMMap.get(tamanho);

        if (tamanho.equalsIgnoreCase("Tamanho M")){
            roupaTamanhoM = new Roupa(tamanho);
            tamanhoMMap.put(tamanho, roupaTamanhoM);

        }
        return roupaTamanhoM;
    }

    public Map<String, Roupa> getTamanhoMMap() {
        return tamanhoMMap;
    }
}

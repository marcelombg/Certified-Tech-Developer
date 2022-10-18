import java.util.HashMap;
import java.util.Map;

public class FlyweightImportada {

    private Map<String, Roupa> importadaMap = new HashMap<>();

    public Roupa obterRoupaImportada(String importada){
        Roupa roupaImportada = importadaMap.get(importada);

        if(importada.equalsIgnoreCase("Importada")){
            roupaImportada = new Roupa(importada);
            importadaMap.put(importada, roupaImportada);
        }
        return roupaImportada;
    }

    public Map<String, Roupa> getImportadaMap() {
        return importadaMap;
    }
}

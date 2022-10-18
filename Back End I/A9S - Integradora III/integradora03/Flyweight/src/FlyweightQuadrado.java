import java.util.HashMap;
import java.util.Map;

public class FlyweightQuadrado {

    private Map<Integer, Quadrado> quadradoMap = new HashMap<>();

    public Quadrado obterQuadrado(int tamanho){
        Quadrado quadrado = quadradoMap.get(tamanho);

        if(quadrado==null){
            quadrado = new Quadrado(tamanho);
            quadradoMap.put(tamanho, quadrado);
        }
        return quadrado;
    }


    public Map<Integer, Quadrado> getQuadradoMap() {
        return quadradoMap;
    }
}

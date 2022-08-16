import java.util.HashMap;
import java.util.Map;

public class FlyweightQuadrado {

    private Map<String, Quadrado> quadradoMapMap = new HashMap<>();

    public Quadrado obterQuadrado(int tamanho){
        Quadrado quadrado = quadradoMapMap.get(tamanho);

        if(quadrado==null) {
            quadrado = new Quadrado(tamanho);
            quadradoMapMap.put(String.valueOf(tamanho), quadrado);
        }

        return quadrado;

    }

}

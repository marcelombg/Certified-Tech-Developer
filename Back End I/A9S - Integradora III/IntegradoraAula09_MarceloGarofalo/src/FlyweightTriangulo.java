import java.util.HashMap;
import java.util.Map;

public class FlyweightTriangulo {
    private Map<String, Triangulo> trianguloMap = new HashMap<>();

    public Triangulo obterTriangulo(String cor){
        Triangulo triangulo = trianguloMap.get(cor);

        if(triangulo==null) {
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }

        return triangulo;
    }
}

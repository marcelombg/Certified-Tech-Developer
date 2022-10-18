public class FacadeFactory {
    private FlyweightQuadrado flyweightQuadrado;
    private FlyweightTriangulo flyweightTriangulo;

    public FacadeFactory() {
        this.flyweightQuadrado = new FlyweightQuadrado();
        this.flyweightTriangulo = new FlyweightTriangulo();
    }

    public void criarFormas(String[][] listaFormas){
        for (int i=0; i<listaFormas.length; i++) {
                if (listaFormas[i][0].equals("triangulo")) {
                    flyweightTriangulo.obterTriangulo(listaFormas[i][1]);
            } else if (listaFormas[i][0].equals("quadrado")) {
                    flyweightQuadrado.obterQuadrado(Integer.parseInt(listaFormas[i][2]));

            }
        }
    }
}

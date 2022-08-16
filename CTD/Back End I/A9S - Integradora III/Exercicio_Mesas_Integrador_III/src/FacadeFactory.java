public class FacadeFactory {

    private FlyweightImportada flyweightImportada;
    private FlyweightNova flyweightNova;
    private FlyweightTamanhoM flyweightTamanhoM;
    private FlyweightTamanhoS flyweightTamanhoS;
    private FlyweightTamanhoXS flyweightTamanhoXS;

    public FacadeFactory(FlyweightImportada flyweightImportada, FlyweightNova flyweightNova, FlyweightTamanhoM flyweightTamanhoM, FlyweightTamanhoS flyweightTamanhoS, FlyweightTamanhoXS flyweightTamanhoXS) {
        this.flyweightImportada = flyweightImportada;
        this.flyweightNova = flyweightNova;
        this.flyweightTamanhoM = flyweightTamanhoM;
        this.flyweightTamanhoS = flyweightTamanhoS;
        this.flyweightTamanhoXS = flyweightTamanhoXS;
    }

    public FacadeFactory() {
    }

    public void criarListas(String[][] listaFormas){
        for (int i=0; i<listaFormas.length; i++) {
            if (listaFormas[i][0].equals("Importada")) {
                flyweightImportada.obterRoupaImportada(listaFormas[i][1]);
            } else if (listaFormas[i][0].equals("Nova")) {
                flyweightNova.obterRoupaNova(listaFormas[i][2]);
            } else if (listaFormas[i][0].equals("Tamanho M")) {
                flyweightTamanhoM.obterTamanhoM(listaFormas[i][3]);
            } else if (listaFormas[i][0].equals("Tamanho S")) {
                flyweightTamanhoS.obterTamanhoS(listaFormas[i][4]);
            } else if (listaFormas[i][0].equals("Tamanho XS")) {
                flyweightTamanhoXS.obterTamanhoXS(listaFormas[i][5]);
            }
        }
    }



    }

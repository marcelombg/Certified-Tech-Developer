//Grupo Integrador III
//Edmundo Batista
//Giovanna Galvão
//J. Felipe S. Barbosa
//Marcelo Garofalo
//Murillo Zuffo

public class Main {

    public static void main(String[] args) {

        FlyweightImportada flyweightImportada = new FlyweightImportada();
        FlyweightTamanhoXS flyweightTamanhoXS = new FlyweightTamanhoXS();
        FlyweightTamanhoS flyweightTamanhoS = new FlyweightTamanhoS();
        FlyweightTamanhoM flyweightTamanhoM = new FlyweightTamanhoM();
        FlyweightNova flyweightNova = new FlyweightNova();

        Roupa roupa1 = flyweightImportada.obterRoupaImportada("Importada");
        roupa1.seteNovo("Nova");
        roupa1.setTamanho("Tamanho M");
        roupa1.setTipo("Calça");
        roupa1.setImportada("Importada");

        Roupa roupa2 = flyweightTamanhoXS.obterTamanhoXS("Tamanho XS");
        roupa2.seteNovo("Nova");
        roupa2.setTamanho("Tamanho XS");
        roupa2.setTipo("Camiseta");
        roupa2.setImportada("Nacional");

        Roupa roupa3 = flyweightTamanhoM.obterTamanhoM("Tamanho M");
        roupa3.seteNovo("Nova");
        roupa3.setTamanho("Tamanho M");
        roupa3.setTipo("Camisa");
        roupa3.setImportada("Importada");

        Roupa roupa4 = flyweightTamanhoS.obterTamanhoS("Tamanho S");
        roupa4.seteNovo("Nova");
        roupa4.setTamanho("Tamanho S");
        roupa4.setTipo("Top");
        roupa4.setImportada("Nacional");

        Roupa roupa5 = flyweightNova.obterRoupaNova("Nova");
        roupa5.seteNovo("Nova");
        roupa5.setTamanho("Tamanho XS");
        roupa5.setTipo("Short");
        roupa5.setImportada("Importada");

        System.out.println(flyweightImportada.getImportadaMap());
        System.out.println(flyweightTamanhoXS.getTamanhoXSMap());
        System.out.println(flyweightTamanhoM.getTamanhoMMap());
        System.out.println(flyweightTamanhoS.getTamanhoSMap());
        System.out.println(flyweightNova.getRoupaNovaMap());

    }

}

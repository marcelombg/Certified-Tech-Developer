import entities.Dog;

public class Program {

    public static void main(String[] args) {

        Dog d0 = new Dog(1, "Nala","SRD",2018,18,false,false);
        Dog d1 = new Dog(2, "Bernardo","SRD",2010,10,true,false);
        Dog d2 = new Dog(3, "Pretinha","SRD",2015,4,true,true);

        System.out.println(d0);
        System.out.println(d1);
        System.out.println(d2);

        d0.buscarIdade(2022);
        d0.encaminharAdocao();
        d1.buscarIdade(2022);
        d1.encaminharAdocao();
        d2.buscarIdade(2022);
        d2.encaminharAdocao();

    }

}

//EQUIPE 1
//Marcelo Garofalo
//Pablo Melo De Pontes Barbosa
//Igor Coelho Da Costa
//Larissa Mayumi Odani
//Ricardo Gomes Brito
//Alcilene Reis
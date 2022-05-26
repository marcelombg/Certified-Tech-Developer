import entities.Impressora;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Impressora i1 = new Impressora(1,"Epson","USB", LocalDate.of(2022,05,25),5);
        Impressora i2 = new Impressora(2,"HP","RJ45", LocalDate.of(2020,04,10),0);


        i1.imprimir("Ola " + i1);
        i1.setTemPapel();

        i2.imprimir("Ola " + i2);
        i2.setTemPapel();

    }
}

//EQUIPE 1
//Marcelo Garofalo
//Pablo Melo De Pontes Barbosa
//Igor Coelho Da Costa
//Larissa Mayumi Odani
//Ricardo Gomes Brito
//Alcilene Reis
//Grupo 02 - Igor Costa, Marcelo Garofalo, Leo Martinez, Alciene Reis, Bruno Cesar, Murillo Zuffo

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        double  horaExtra=1.5, horaSemanal= 40, valorHora = 875/horaSemanal,
                valorExtra= valorHora*horaExtra, SalarioSemanal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas na semana ");
        double horas = scanner.nextDouble();

        if (horas > horaSemanal) {
            SalarioSemanal= horaSemanal*valorHora + ((horas - horaSemanal)*valorExtra);
        }
        else {

            SalarioSemanal= horaSemanal*valorHora;
        }

        System.out.println("O Salario Semanal e " +SalarioSemanal);
    }
}


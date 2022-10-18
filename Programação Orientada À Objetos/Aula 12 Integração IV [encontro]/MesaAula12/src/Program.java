import entities.Empregado;
import entities.EmpregadoEstagiario;
import entities.EmpregadoTerceirizado;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> minhaLista = new ArrayList<>();

        System.out.println("Entre com o número de empregados da folha deste mês: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Empregado # " + i);
            System.out.print(" para Empregado / 2 para Terceirizado / 3 para Estagiário?");
            double ch = sc.nextDouble();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.println("Horas trabalhadas: ");
            int horasTrab = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 2){
                System.out.print("Custo adicional: ");
                double custoAdicional = sc.nextDouble();
                minhaLista.add(new EmpregadoTerceirizado(nome, horasTrab, valorPorHora, custoAdicional));

            } else if (ch == 1){
                minhaLista.add(new Empregado(nome, horasTrab, valorPorHora));
            } else {
                System.out.print("Auxílio transporte: ");
                double auxilioTransporte = sc.nextDouble();
                minhaLista.add(new EmpregadoEstagiario(nome, horasTrab, valorPorHora, auxilioTransporte));
            }

        }

        System.out.println("");
        System.out.println("Folha de pagamento 06/2022: ");

        for (Empregado emp: minhaLista){
            System.out.println(emp.getNome() + " - R$" + emp.pagamento());
        }

    }
}

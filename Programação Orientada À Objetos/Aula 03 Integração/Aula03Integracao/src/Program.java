import java.util.Scanner;

public class Program {

    public static int howManyPkg(double qt) {

        double kg = 0.0, weight = 0.0;
        int pack = 0;

        Scanner entrada = new Scanner(System.in);

        while (kg < qt) {
            System.out.println("Digite o peso do pacote: ");
            weight = entrada.nextDouble();
            kg += weight;
            pack += 1;
        }

        entrada.close();

        return pack;
    }

    public static void main(String[] args) {

        String dogName;
        double dogFoogWeight;
        int pkg;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do cachorro: ");
        dogName = ler.nextLine();
        System.out.println("Digite a quantidade de ração diária: ");
        dogFoogWeight = ler.nextDouble();

        //Aqui criaremos a função que recerá a quantidade de consumo de ração
        pkg = howManyPkg(dogFoogWeight);


        System.out.printf("O cachorro %s precisará de %d pacotes.", dogName, pkg);

        ler.close();

    }
}

import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        byte b1, b2;
        short s1, s2;
        int i1, i2, soma, mult, sub, div, modulo;
        long l1, l2;
        float f1, f2; double d1, d2; char c1, c2; boolean bo1, bo2;

        // Esta variável é um tipo Classe
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número byte: ");
        b1 = ler.nextByte();
        System.out.println("Informe o segundo número byte: ");
        b2 = ler.nextByte();

//        System.out.println("Primeiro byte digitado: " + b1);
//        System.out.println("Segundo byte digitado: " + b2);

        soma = b1 + b2;
        sub = b1 - b2;
        mult = b1 * b2;
        div = b1 / b2;
        modulo = b1 % b2;

        System.out.println("Soma de 2 bytes: " + soma);
        System.out.println("Subtração de 2 bytes: " + sub);
        System.out.println("Multiplicação de 2 bytes: " + mult);
        System.out.println("Divisão de 2 bytes: " + div);
        System.out.println("Resto da divisão de 2 bytes: " + modulo);

        System.out.println("");

        soma++; //soma + 1
        mult--; //mult - 1

        System.out.println("Soma de 2 bytes com ++: " + soma);
        System.out.println("Multiplicação de 2 bytes com --: " + mult);

        ler.close();
        // Uma boa prática é limpar o buffer ao final da utilização

    }
}

/*
        short s1 = 16522;
        System.out.println("Meu número short: " + s1);

        int i1 = 520;
        System.out.println("Meu número inteiro: " + i1);

        long l1 = 550L;
        System.out.println("Meu número long: " + l1);

        float f1 = 2147.55f;
        System.out.println("Meu número float: " + f1);

        double d1 = 21.54;
        System.out.println("Meu número long: " + l1);

        char c1 = 'C';
        System.out.println("Meu char: " + c1);

        boolean bo1 = true;
        System.out.println("Meu boolean: " + bo1);
 */

/*
Classe Scanner - entrada de dados via console
Scanner sc = new Scanner(System.in); - Para instanciar um objeto da Classe Scanner;
Locale.setDefault(Locale.US); - Para setar o sistema monetário;
sc.close(); - Para limpar o buffer.
sc.next() - para ler uma palavra (texto sem espaços);
sc.next().charAt(0) - para ler um caractere;
sc.nextLine() - para ler um texto até a quebra de linha;
sc.nextBoolean - para ler um típo lógico;
sc.nextInt - para ler um número inteiro;
sc.nextShort - para ler um número short;
sc.nextFloat() - para ler um número do tipo float com ponto flutuante.
sc.nextDouble() - para ler um número do tipo double com ponto flutuante.

 */

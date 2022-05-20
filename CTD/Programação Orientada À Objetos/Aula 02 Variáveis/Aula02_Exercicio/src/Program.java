import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String nome, sobrenome, nomecompleto, dataNascimento;
        char iniciaisNome, iniciaisSobrenome, iniciais;
        int dia, mes, ano;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = ler.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = ler.next();
        System.out.println("Informe o dia de seu nascimento: ");
        dia = ler.nextInt ();
        System.out.println("Informe o mês de seu nascimento: ");
        mes = ler.nextInt ();
        System.out.println("Informe o ano de seu nascimento: ");
        ano = ler.nextInt ();

        nomecompleto = nome + " " + sobrenome;
        System.out.println("Seu nome completo é: " + nomecompleto);

        iniciaisNome = nome.charAt(0);
        iniciaisSobrenome = sobrenome.charAt(0);
        System.out.println("Suas iniciais são: " + iniciaisNome + iniciaisSobrenome);

        dataNascimento = dia + " / " + mes + " / " + ano;
        System.out.println("Sua data de nascimento é: " + dataNascimento);
        System.out.printf("Sua data de nascimento é: %d / %d / %d", dia, mes, ano);

    }

}

/*
Faça um programa Java que solicite do usuário seu nome e sobrenome separadamente, e a sua data de nascimento.  Para a data solicite que o usuário digite 3 valores que representam o dia, mês e ano. Além disso, a partir das variáveis do nome e sobrenome ​​obtenha em uma terceira com as iniciais do usuário.
Em seguida, exiba uma mensagem, com seu nome, as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"

 */

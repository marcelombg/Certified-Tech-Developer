import entities.Equipe;
import entities.Jogador;

public class Program {

    public static void main(String[] args) {

        Jogador j1 = new Jogador(1, 13, "Rogerio Ceni", true, true);
        Jogador j2 = new Jogador(2, 2, "Miranda", false, false);
        Jogador j3 = new Jogador(3, 5, "Casemiro", false, true);
        Jogador j4 = new Jogador(4, 7, "Reinaldo", false, false);
        Jogador j5 = new Jogador(5, 8, "Kaka", false, true);
        Jogador j6 = new Jogador(6, 10, "Lucas Moura", true, true);
        Jogador j7 = new Jogador(7, 11, "Calleri", true, true);

        Equipe e1 = new Equipe(1, "SPFC");

        e1.adicionarJogador(j1);
        e1.adicionarJogador(j2);
        e1.adicionarJogador(j3);
        e1.adicionarJogador(j4);
        e1.adicionarJogador(j5);
        e1.adicionarJogador(j6);
        e1.adicionarJogador(j7);

        System.out.println("");
        System.out.println("Jogadores Titulares: ");
        e1.mostrarJogadoresTitulares();

        System.out.println("");
        System.out.println("Jogadores Lasionados: ");
        System.out.println(e1.getQuantidadeJogadoresLesionados());

    }
}

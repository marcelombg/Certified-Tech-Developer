import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(2016, 3, 23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setDataNascimento(LocalDate.of(1966, 1, 03));
        p3 = new Pessoa("Joe", "Morello");
        p3.setDataNascimento(LocalDate.of(2010, 12, 04));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setDataNascimento(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setDataNascimento(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setDataNascimento(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setDataNascimento(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianch");
        p8.setDataNascimento(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setDataNascimento(LocalDate.of(1975, 9, 01));
        p10 = new Pessoa("Camila", "Porto");
        p10.setDataNascimento(LocalDate.of(2014, 5, 25));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        colecao.add(p1.adicionarNomes(p1));
        colecao.add(p2.adicionarNomes(p2));
        colecao.add(p3.adicionarNomes(p3));
        colecao.add(p4.adicionarNomes(p4));
        colecao.add(p5.adicionarNomes(p5));
        colecao.add(p6.adicionarNomes(p6));
        colecao.add(p7.adicionarNomes(p7));
        colecao.add(p8.adicionarNomes(p8));
        colecao.add(p9.adicionarNomes(p9));
        colecao.add(p10.adicionarNomes(p10));

        List<String> colecao2 = new ArrayList<>();

        for (int i = 0; i<10; i++) {
            if (colecao.get(i) != null) {
                colecao2.add(colecao.get(i));
            }
        }

        assertEquals(2, colecao2.size());
    }
}
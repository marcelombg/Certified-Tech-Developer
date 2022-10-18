import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    List<String> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(2016, 3, 23));
        p2 = new Pessoa("João", "Ganda");
        p2.setDataNascimento(LocalDate.of(2016, 3, 23));
        p3 = new Pessoa("Jonas", "Ganda");
        p3.setDataNascimento(LocalDate.of(2016, 3, 23));
        p4 = new Pessoa("Joana", "Ganda");
        p4.setDataNascimento(LocalDate.of(2016, 3, 23));
        p5 = new Pessoa("Murilo", "Ganda");
        p5.setDataNascimento(LocalDate.of(2016, 3, 23));
        p6 = new Pessoa("Ana", "Ganda");
        p6.setDataNascimento(LocalDate.of(2016, 3, 23));
        p7 = new Pessoa("Maria", "Ganda");
        p7.setDataNascimento(LocalDate.of(2016, 3, 23));
        p8 = new Pessoa("Cristina", "Ganda");
        p8.setDataNascimento(LocalDate.of(2016, 3, 23));
        p9 = new Pessoa("Regina", "Ganda");
        p9.setDataNascimento(LocalDate.of(2016, 3, 23));
        p10 = new Pessoa("Rgiane", "Ganda");
        p10.setDataNascimento(LocalDate.of(2016, 3, 23));
    }

    @Test
    void imprimirObjetos(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }

    @Test
    void adicionarColecao(){
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

        for(int i=0; i<10; i++) {
            if (colecao.get(i) != null) {
                colecao2.add(colecao.get(i));
            }
        }
        assertEquals(4, colecao2.size());
    }
}

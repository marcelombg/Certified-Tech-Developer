import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario est1, est2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        est1 = new Estagiario("Ana");
        est1.vender(10);

        est2 = new Estagiario("Jonas");
        est2.vender(1);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println("Nome: " + func1.nome + " tem " + func1.calcularPontos() + " pontos e está categoria " + func1.mostrarCategoria());
        System.out.println("Nome: " + func2.nome + " tem " + func2.calcularPontos() + " pontos e está categoria " + func2.mostrarCategoria());
        System.out.println("Nome: " + afi1.nome + " tem " + afi1.calcularPontos() + " pontos e está categoria " + afi1.mostrarCategoria());
        System.out.println("Nome: " + afi2.nome + " tem " + afi2.calcularPontos() + " pontos e está categoria " + afi2.mostrarCategoria());
        System.out.println("Nome: " + afi3.nome + " tem " + afi3.calcularPontos() + " pontos e está categoria " + afi3.mostrarCategoria());
        System.out.println("Nome: " + est1.nome + " tem " + est1.calcularPontos() + " pontos e está categoria " + est1.mostrarCategoria());
        System.out.println("Nome: " + est2.nome + " tem " + est2.calcularPontos() + " pontos e está categoria " + est2.mostrarCategoria());
    }

    @Test
    public void testarPontuação(){
        assertEquals(func1.calcularPontos(), 20);
        assertEquals(func2.calcularPontos(), 5);
        assertTrue(afi1.calcularPontos() > 59);
        assertTrue(afi1.calcularPontos() > 16);
        assertEquals(func1.mostrarCategoria(), "APRENDIZ");
        assertFalse(est1.calcularPontos() < 50);
        assertFalse(est2.calcularPontos() > 50);
    }
}
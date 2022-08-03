import java.util.EventListener;

public class Estagiario extends Vendedor {

    public Estagiario(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }
    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 50) {
            return "ESTAGIÁRIO NOVATO";
        } else if (calcularPontos() > 49) {
            return "ESTAGIÁRIO EXPERIENTE";
        } else return null;
    }
}

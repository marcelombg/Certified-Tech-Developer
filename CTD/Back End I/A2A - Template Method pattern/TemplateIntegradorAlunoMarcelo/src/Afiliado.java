public class Afiliado extends Vendedor{

    public Afiliado(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 15;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 20){
            return  "NOVATO";
        } else if (calcularPontos() > 19 && calcularPontos() < 31) {
            return "APRENDIZ";
        } else if (calcularPontos() > 30 && calcularPontos() < 41) {
            return "BOM";
        } else if (calcularPontos() > 40) {
            return "MESTRE";
        } else return "CATEGORIA INVÁLIDA";
    }


}

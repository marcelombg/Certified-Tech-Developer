public class Main {

    public static void main(String[] args) {

        //Instanciando sem usar o padrão Facade

        Cartao cartao = new Cartao("123", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Pacote");

        ApiCartao apiCartao = new ApiCartao();
        ApiProduto apiProduto = new ApiProduto();
        ApiQuantidade apiQuantidade = new ApiQuantidade();

        int desconto = apiCartao.desconto(cartao) + apiProduto.desconto(produto) + apiQuantidade.desconto(15);
        System.out.println(desconto);

        //Instanciando usando o padrão Facade

        FacadeDesconto facadeDesconto = new FacadeDesconto();
        desconto = facadeDesconto.calcularDesconto(cartao, produto, 15);
        System.out.println(desconto);

    }

}

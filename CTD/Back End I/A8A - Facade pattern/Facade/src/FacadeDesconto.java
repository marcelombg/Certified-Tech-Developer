public class FacadeDesconto {

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    public int calcularDesconto(Cartao cartao, Produto produto, int quantidade){
        int desconto = 0;

        desconto += apiCartao.desconto(cartao);
        desconto += apiProduto.desconto(produto);
        desconto += apiQuantidade.desconto(quantidade);

        return desconto;
    }



}

public class ApiProduto {

    public int desconto (Produto produto) {
        if (produto.getNome().equals("Latas")){
            return 10;
        } else {
            return 0;
        }
    }
}

public class ApiCartao {

    public int desconto (Cartao cartao) {
        if (cartao.getBanco().equals("Star Bank")){
            return 20;
        } else {
            return 0;
        }
    }
}

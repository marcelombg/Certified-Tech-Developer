package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= infomarSaldo()){
            setSaldo(infomarSaldo() - valor);
        } else {
            System.out.println("Limite excedido");
        }
    }

    @Override
    public void sacar(double valor, double perc) {

    }

    public void cobrarJuros(){
        double juros = 0.05;
        setSaldo(infomarSaldo() * (1 + juros));
    }

}

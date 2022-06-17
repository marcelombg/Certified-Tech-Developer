package entities;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void sacar(double valor, double perc) {
    if (valor <= infomarSaldo()) {
        setSaldo((infomarSaldo() - valor) - (valor * imposto(perc)));
        System.out.println("Saque efetuado, saldo atual R$ " + infomarSaldo());

        } else {
        System.out.println("Limite excedido.");
        }
    }

    @Override
    public double imposto(double perc) {
        double percentual = perc/100;
        return percentual;
    }
}

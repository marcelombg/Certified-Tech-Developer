package entities;

public abstract class Conta {

    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        this.saldo += valor;
        System.out.printf("Depósito de R$ " + valor + " realizado com sucesso. ");
    }

    public abstract void sacar(double valor);

    public abstract void sacar(double valor, double perc);


    public double infomarSaldo() {
        return this.saldo;
    }



}

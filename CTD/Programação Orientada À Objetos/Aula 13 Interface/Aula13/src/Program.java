import entities.ContaCorrente;

public class Program {

    public static void main(String[] args) {

        ContaCorrente cr1 = new ContaCorrente(0.0, 1000.0);

        System.out.println("Saldo atual R$ " + cr1.infomarSaldo());
        cr1.depositar(1600.0);
        cr1.sacar(1000.0, 10);
        System.out.println("Saldo atualizado R$ " + cr1.infomarSaldo());

    }

}

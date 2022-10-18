import entities.Cliente;

public class Program {

    public static void main(String[] args) {

        Cliente c0 = new Cliente();
        Cliente c1 = new Cliente(002,"Maria");

        c0.setNome("João");
        c0.setNumeroCliente(001);
        c1.setDivida(100.0);

        System.out.println(c0);
        System.out.println(c1);

        c0.aumentarDivida(600);
        c0.pagarDivida(600);
        c1.aumentarDivida(500.0);
        c1.pagarDivida(400.0);

        System.out.println(c0);
        System.out.println(c1);
    }
}

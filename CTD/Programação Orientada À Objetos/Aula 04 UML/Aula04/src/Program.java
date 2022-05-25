import entities.Veterinario;

public class Program {

    public static void main(String[] args) {

        Veterinario v1 = new Veterinario();
        Veterinario v2 = new Veterinario(2,"Marta", "Cunha");

        v1.setNome("Pablo");
        v1.setSobrenome("Mascarenhas");
        v1.setRegistro("CRV21554");
        v1.setSalario(4500.0);
        v1.setId(1);

        v2.setRegistro("CRV22533");
        v2.setSalario(5000.00);

        System.out.println(v1.toString());

        System.out.println(v2.toString());

        System.out.println("Buscando os nomes com o get");
        System.out.println("Nome do v1: " + v1.getNome());
        System.out.println("Nome do v1: " + v2.getNome());

    }

}
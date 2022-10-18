import entities.Veterinario;
import entities.Car;

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

        System.out.println(v1);
        System.out.println(v2);

        System.out.println("Buscando os nomes com o get");
        System.out.println("Nome do v1: " + v1.getNome());
        System.out.println("Nome do v1: " + v2.getNome());

        Car c1 = new Car();
        Car c2 = new Car(2,"Ford","Focus","Preto",100,false);

        c1.setId(1);
        c1.setMarca("Ford");
        c1.setModelo("Fiesta");
        c1.setCor("Branco");
        c1.setKm(200);
        c1.setServico(true);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Buscando os carros com o get");
        System.out.println("Nome do c1: " + c1.getModelo());
        System.out.println("Nome do c2: " + c2.getModelo());

    }

}
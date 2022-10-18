import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Batata", "Frita", "321456789", new Date(),
                "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(),p1.getDataVacina(), p1.getNomeVacina());


    }

}

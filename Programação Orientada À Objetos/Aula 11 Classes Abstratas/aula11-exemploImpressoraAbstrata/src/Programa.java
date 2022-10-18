
import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        //animal Preguica
        Preguica novoPreguica = new Preguica("belly", 10);

        novoPreguica.emitirSon();
        //animal Cavalo
        Cavalo novoCavalo = new Cavalo("power", 5);
        novoCavalo.correr();

        //animal Cachorro
        Cachorro novoCachorro = new Cachorro("dogue", 3);
        novoCachorro.subirArvores();

    }

}

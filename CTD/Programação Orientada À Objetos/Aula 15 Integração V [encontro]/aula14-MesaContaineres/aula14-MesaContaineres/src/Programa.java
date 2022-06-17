import entities.Conteiner;
import entities.Porto;

/*Equipe 02 - Marcelo Garofalo, Diego Reis, Camila Ferreira, Edmundo Batista, Eduardo Russo*/


public class Programa {
    public static void main(String[] args) {
        // Criando o porto
        Porto porto = new Porto("Porto Santos");

        // Criando a carga
        Conteiner c1 = new Conteiner(1, "Eletrônicos", "China", false);
        Conteiner c2 = new Conteiner(2, "Eletrônicos", "EUA", false);
        Conteiner c3 = new Conteiner(3, "Brinquedos", "EUA", false);
        Conteiner c4 = new Conteiner(4, "Soja", "BR", false);
        Conteiner c5 = new Conteiner(5, "Petróleo", "Rússia", true);
        Conteiner c6 = new Conteiner(6, "Armas", "EUA", true);

        // Adicionando a carga ao porto
        porto.adicionarConteiner(c1);
        porto.adicionarConteiner(c2);
        porto.adicionarConteiner(c3);
        porto.adicionarConteiner(c4);
        porto.adicionarConteiner(c5);
        porto.adicionarConteiner(c6);

        System.out.println("Lista de Contêineres");
        porto.mostrarConteineresOrdenados();

        System.out.print("\nQuantidade de contêineres com material perigoso: ");
        System.out.println(porto.getQuantidadeConteineresPerigosos());

    }
}

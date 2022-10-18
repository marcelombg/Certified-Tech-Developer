public class Serie implements ISerie{
    private String nome;

    private String link;


    public Serie(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSerie(String nome) {
         return this.link = "www." + nome + ".com";
    }

    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }
}

public class Dentista {

    private int id;
    private String nome;
    private String sobrenome;
    private double matricula;

    public Dentista(int id, String nome, String sobrenome, double matricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}

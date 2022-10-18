package entities;

public class Veterinario {

    private int id;
    private String nome;
    private String sobrenome;
    private String registro;
    private double salario;

    //atalho para criar o construtor = alt + insert
    //contrutor padrão
    public Veterinario() {
    }

    //atalho para criar o construtor = alt + insert
    public Veterinario(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", registro='" + registro + '\'' +
                ", salario=" + salario +
                '}';
    }
}

package entities;

public class Dog {

    private int id;
    private String nome;
    private String raca;
    private int anoNascimento;
    private double peso;
    private boolean chip;
    private boolean ferido;

    public Dog(int id, String nome, String raca, int anoNascimento, double peso, boolean chip, boolean ferido) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    //métodos customizados
    public void buscarIdade(int valor){
        valor -= this.anoNascimento;
        System.out.println("A idade do cachorro é: " + valor);
    }

    public void encaminharAdocao(){
        if (this.chip && !this.ferido && this.peso > 5) {
            System.out.println("Este cachorro pode ser encaminhado para adoção.");
        } else {
            System.out.println("Desculpe, mas infelizmente este cachorro não pode ser adotado neste momento.");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", peso=" + peso +
                ", chip=" + chip +
                ", ferido=" + ferido +
                '}';
    }
}

//Cachorro
//- id: int
//- nome: String
//- raça: String
//- anoNascimento: int
//- peso: double
//- chip: boolean
//- ferido: boolean
//+ cachorro():
//+ buscarIdade(anoNascimento: int): int
//+ encaminharAdocao(): void

//Objetivo
//        Identifique e modele a classe envolvida na instrução especificando seus atributos, responsabilidades com pelo
//        menos dois construtores no diagrama de classe.
//
//        Exercício 1
//        Imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os cachorros registrados no
//        sistema possuam informações como: está apto ou não para a adoção, raça, ano aproximado de nascimento, peso,
//        possuem chip ou não, estejam feridos ou não e atribuído o primeiro nome para eles na instituição.
//
//        Precisaremos saber a idade do cachorro e validar se ele possui um chip para localização.
//
//        Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.

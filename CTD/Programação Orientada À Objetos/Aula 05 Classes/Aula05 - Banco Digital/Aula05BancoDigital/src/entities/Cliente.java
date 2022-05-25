package entities;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    //Contrutor

    public Cliente(){
    }
    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
    }

    //Getters and Setters
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    //Métodos customizados
    //+ aumentarDivida( valor: double): void
    public void aumentarDivida(double valor) {
        this.divida += valor;
        System.out.println("Sua dívida atualizada é: R$" + getDivida());
    }

    //+ pagarDivida(valor: double): void
    public void pagarDivida(double valor) {
        this.divida -= valor;
        if (this.divida == 0) {
            System.out.println("Você não tem mais dívida =)");
        } else {
            System.out.println("Você pagou uma parte e sua dívida atualizada é: R$" + getDivida());
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nome='" + nome + '\'' +
                ", divida=" + divida +
                '}';
    }
}

//Cliente
//- numeroCliente: int
//- nome: String
//- divida: double
//+ Cliente( numero: String, nome: String)
//+ aumentarDivida( valor: double): void
//+ pagarDivida(valor: double): void

package entities;

public class Empregado {
    private String nome;
    private int horasTrab;
    private double valorPorHora;

    public Empregado() {
    }

    public Empregado(String nome, int horasTrab, double valorPorHora) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return horasTrab*valorPorHora;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", horasTrab=" + horasTrab +
                ", valorPorHora=" + valorPorHora +
                '}';
    }
}

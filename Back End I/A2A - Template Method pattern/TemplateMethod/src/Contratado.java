public class Contratado extends Funcionario{

    private double valorHora;
    private int horasTrabalhadas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horasTrabalhadas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSaldo() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo digital no valor de R$ " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositado uma quantia de R$ " + quantia + ", na conta de " + super.getNome());
    }
}

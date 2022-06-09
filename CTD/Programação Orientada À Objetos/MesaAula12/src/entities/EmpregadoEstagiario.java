package entities;

public class EmpregadoEstagiario extends Empregado {

    private double auxilioTransporte;

    public EmpregadoEstagiario() {
        super();
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public EmpregadoEstagiario(String nome, int horasTrab, double valorPorHora, double auxilioTransporte) {
        super(nome, horasTrab, valorPorHora);
        this.auxilioTransporte = auxilioTransporte;
    }

    public void setAuxilio(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public double pagamento() {
        System.out.println("Estagiário");
        return super.pagamento() + auxilioTransporte;
    }
}
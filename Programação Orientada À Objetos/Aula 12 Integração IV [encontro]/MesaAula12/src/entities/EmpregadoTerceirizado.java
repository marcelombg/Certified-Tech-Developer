package entities;

public class EmpregadoTerceirizado extends Empregado{

    private double custoAdicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, int horasTrab, double valorPorHora, double custoAdicional) {
        super(nome, horasTrab, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        System.out.println("Terceirizado");
        return super.pagamento() + custoAdicional * 1.1;
    }
}

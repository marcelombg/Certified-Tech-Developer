package entities;

public abstract class SistemaArmas {

    private int energia;

    public SistemaArmas() {
    }

    public SistemaArmas(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int i) {
        this.energia = energia;
    }

    public abstract void mostrar();

}

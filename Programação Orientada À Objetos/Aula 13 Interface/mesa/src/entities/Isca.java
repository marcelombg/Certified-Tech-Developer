package entities;

public class Isca extends SistemaArmas{

    public Isca() {
    }

    public Isca(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("A energia da Isca é: " + getEnergia());
    }
}
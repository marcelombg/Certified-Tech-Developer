package entities;

public class RoboPesado extends SistemaArmas implements IAtacarDefender, IVoam{

    public RoboPesado() {
    }

    public RoboPesado(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("A energia do Robô Pesado é: " + getEnergia());
    }

    @Override
    public void atacar (){
        System.out.println("Ataque do Robô Pesado!");
    }

    @Override
    public void defender (){
        System.out.println("Defesa do Robô Pesado!");
    }

    @Override
    public void voar (){
        System.out.println("Robô Pesado está voando!");
    }

}

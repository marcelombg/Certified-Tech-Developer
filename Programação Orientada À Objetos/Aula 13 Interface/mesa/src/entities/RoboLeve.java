package entities;

public class RoboLeve extends SistemaArmas implements IAtacarDefender,IVoam {

    public RoboLeve() {
    }

    public RoboLeve(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("A energia do Robô Leve é: " + getEnergia());
    }

    @Override
    public void atacar (){
        System.out.println("Ataque do Robô Leve!");
    }
    @Override
    public void defender() {
        System.out.println("Defesa do Robô Leve!");
    }

    @Override
    public void voar (){
        System.out.println("Robô Leve está voando!");
    }

}

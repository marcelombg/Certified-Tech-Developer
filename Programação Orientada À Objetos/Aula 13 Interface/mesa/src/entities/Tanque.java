package entities;

public class Tanque extends SistemaArmas implements IAtacarDefender{

    public Tanque() {
    }

    public Tanque(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("A energia do tanque é: " + getEnergia());
    }

    @Override
    public void atacar(){
        System.out.println("Ataque do tranque!");
    }

    @Override
    public void defender (){
        System.out.println("Defesa do tranque!");
    }

}

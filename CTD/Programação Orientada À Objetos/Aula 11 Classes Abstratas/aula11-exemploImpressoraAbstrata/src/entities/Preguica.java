package entities;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSon() {
    System.out.println(getNome() + " esta emitindo som");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " nao pode correr");
    }

    @Override
    public void subirArvores() {
        System.out.println(getNome() + " esta subindo a arvore");
    }


}

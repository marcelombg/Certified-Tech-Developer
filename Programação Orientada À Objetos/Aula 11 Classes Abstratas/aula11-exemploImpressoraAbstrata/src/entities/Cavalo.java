package entities;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSon() {
        System.out.println(getNome() + " esta emitindo som");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " pode correr");
    }

    @Override
    public void subirArvores() {
        System.out.println(getNome() + " nao pode subir a arvore");
    }


}
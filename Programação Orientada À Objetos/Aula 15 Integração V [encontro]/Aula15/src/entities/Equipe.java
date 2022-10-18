package entities;

import java.util.ArrayList;

public class Equipe {

    private int id;
    private String nome;
    //Será criada uma lista de nomes pois entendemos que uma equipe tem uma relação
    //de 1 para muitos com a classe Jogador
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Equipe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos customizados
    public void adicionarJogador(Jogador j){
        listaJogadores.add(j);
    }

    public void mostrarJogadoresTitulares(){
        for (Jogador jog : listaJogadores) {
            if (jog.isTitular()){
                System.out.println(
                        "ID: " + jog.getId() +
                        ", Nome: " + jog.getNome() +
                        ", Camisa: " + jog.getNumCamisa());
            };
        }
    }

    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for (Jogador jog : listaJogadores) {
            if (jog.isLesionado() && jog.isTitular()){
                contador++;
            };
        }
        return contador;
    }

}

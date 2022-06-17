package entities;

import java.util.ArrayList;

public class Porto {
    private String nome;
    private ArrayList<Conteiner> carga = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConteiner(Conteiner c){
        carga.add(c);
    }

    public void mostrarConteineresOrdenados(){
        for (Conteiner c : carga) {
            System.out.println(
                    "Número: " + c.getNumero() +
                    " - Descrição: " + c.getDescricao() +
                    " - País: " + c.getPais()
            );
        }
    }

    public int getQuantidadeConteineresPerigosos(){
        int count = 0;
        for (Conteiner c : carga) {
            if (c.isMaterialPerigoso()){
                count++;
            }
        }
       return count;
    }

}

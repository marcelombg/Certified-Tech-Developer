package entities;

import java.time.LocalDate;
import java.util.Date;

public class Impressora {

    private int id;
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(int id, String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis) {
        this.id = id;
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    //métodos custimizados
    private boolean temPapel(){
        boolean valor;

        if(this.folhasDisponiveis > 0){
        valor = true;
        } else {
            valor = false;
        }
        return valor;
    }

    public void setTemPapel(){
        if (temPapel()) {
            System.out.println("Tem papel!");
        } else {
            System.out.println("Não tem papel!");
        }

    }

    public void imprimir(String texto){ System.out.println(texto); }

    @Override
    public String toString() {
        return "Impressora{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", folhasDisponiveis=" + folhasDisponiveis +
                '}';
    }
}

//        modelo: String
//        tipoConexao: String
//        dataFabricacao: Date
//        folhasDisponiveis: Int
//        temPapel(): boolean
//        imprimir(texto:String)

//EQUIPE 1
//Marcelo Garofalo
//Pablo Melo De Pontes Barbosa
//Igor Coelho Da Costa
//Larissa Mayumi Odani
//Ricardo Gomes Brito
//Alcilene Reis
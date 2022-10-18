package entities;

import java.time.LocalDate;

public abstract class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricao;
    private Integer folhasDisponiveis;
    private Double percTinta;

    public Impressora() {
    }

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricao, Integer folhasDisponiveis, Double percTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricao = dataFabricao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.percTinta = percTinta;
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

    public LocalDate getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(LocalDate dataFabricao) {
        this.dataFabricao = dataFabricao;
    }

    public Integer getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(Integer folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public Double getPercTinta() {
        return percTinta;
    }

    public void setPercTinta(Double percTinta) {
        this.percTinta = percTinta;
    }

    public boolean temPapel() {
        if(this.folhasDisponiveis != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean precisaTinta(){
        if (this.percTinta == 0){
            return true;
        } else {
            return false;
        }
    }

    public abstract void imprimir();


    @Override
    public String toString() {
        return "Impressora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricao=" + dataFabricao +
                ", folhasDisponiveis=" + folhasDisponiveis +
                ", percTinta=" + percTinta +
                '}';
    }
}

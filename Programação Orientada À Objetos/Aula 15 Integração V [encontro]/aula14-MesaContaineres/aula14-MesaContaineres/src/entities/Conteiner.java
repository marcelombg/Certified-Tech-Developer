package entities;

public class Conteiner {
    private int numero;
    private String descricao;
    private String pais;
    private boolean materialPerigoso;

    public Conteiner(int numero, String descricao, String pais, boolean materialPerigoso) {
        this.numero = numero;
        this.descricao = descricao;
        this.pais = pais;
        this.materialPerigoso = materialPerigoso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }
}

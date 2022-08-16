public class Roupa {

    private String tamanho;
    private String tipo;
    private String eNovo;
    private String importada;

    public Roupa(String tamanho, String tipo, String eNovo, String importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.importada = importada;
    }

    public Roupa(String constructor) {

    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String geteNovo() {
        return eNovo;
    }

    public void seteNovo(String eNovo) {
        this.eNovo = eNovo;
    }

    public String getImportada() {
        return importada;
    }

    public void setImportada(String importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", eNovo='" + eNovo + '\'' +
                ", importada='" + importada + '\'' +
                '}';
    }
}

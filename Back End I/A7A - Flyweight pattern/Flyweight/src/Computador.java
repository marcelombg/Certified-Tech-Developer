public class Computador {

    private String id;
    private int ram;
    private int hd;
    private int contador;

    public Computador(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        this.contador = 1;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id='" + id + '\'' +
                ", ram=" + ram +
                ", hd=" + hd +
                ", contador=" + contador +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}

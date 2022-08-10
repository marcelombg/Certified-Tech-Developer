package Filmes;

public class Ip {

    private int [] numeroIp = new int[4];

    public Ip(int n1, int n2, int n3, int n4){
        this.numeroIp[0] = n1;
        this.numeroIp[1] = n2;
        this.numeroIp[2] = n3;
        this.numeroIp[3] = n4;
    }

    public String getPais(){
        String pais = "";
        if (numeroIp[0] < 50){
            pais = "Argentina";
        } else if (numeroIp[0] < 100){
            pais = "Brasil";
        } else if (numeroIp[0] < 150){
            pais = "Colômbia";
        } return pais;
    }
}

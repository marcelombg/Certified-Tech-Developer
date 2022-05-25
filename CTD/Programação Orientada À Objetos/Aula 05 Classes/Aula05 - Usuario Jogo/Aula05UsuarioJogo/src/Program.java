import entities.UsuarioJogo;

public class Program {

    public static void main(String[] args) {

        UsuarioJogo j0 = new UsuarioJogo(1,"João","JP",8,1);
        UsuarioJogo j1 = new UsuarioJogo(2, "Maria","MJ",11,2);

        j0.aumentarPontuacao(1);
        j1.subirNivel(1);

        System.out.println(j0);
        System.out.println(j1);

        j1.bonus(11);
        j0.bonus(1);
    }

}

//Grupo 02
//Marcelo Garofalo
//Bruno Cesar Rodrigues
//Dumith Bou-Habib
//Eduardo Russo
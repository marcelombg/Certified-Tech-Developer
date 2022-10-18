import entities.Isca;
import entities.RoboLeve;
import entities.RoboPesado;
import entities.Tanque;

import javax.swing.*;

public class Program {

    public static void main(String[] args) {

        RoboLeve rl1 = new RoboLeve(100);
        RoboPesado rp1 = new RoboPesado(100);
        Tanque t1 = new Tanque(100);
        Isca i1 = new Isca(100);

        System.out.println("Energia");
        rl1.mostrar();
        rp1.mostrar();
        t1.mostrar();
        i1.mostrar();

        System.out.println("\nAtaque");
        rl1.atacar();
        rp1.atacar();
        t1.atacar();

        System.out.println("\nDefesa");
        rl1.defender();
        rp1.defender();
        t1.defender();

        System.out.println("\nVoar");
        rl1.voar();
        rp1.voar();
    }
}

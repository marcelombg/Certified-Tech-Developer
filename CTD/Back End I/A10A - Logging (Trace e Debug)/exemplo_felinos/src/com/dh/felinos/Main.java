package com.dh.felinos;

import com.dh.felinos.model.Leao;
import com.dh.felinos.model.Tigre;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //Outra forma de configurar sem criar o arquivo log4j.properties - Descomente a linha abaixo:
        // BasicConfigurator.configure();
        Leao leao = new Leao();
        leao.setIdade(4);
        leao.setNome("Simba");
        leao.setAlfa(true);
        leao.correr();

        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do leão " + leao.getNome() + " está incorreta", e);
        }

        Leao leao2 = new Leao();
        leao2.setNome("Bom");
        leao2.setAlfa(false);
        leao2.setIdade(-1);

        leao2.correr();
        try {
            leao2.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do leão " + leao2.getNome() + " está incorreta", e);
        }

        Tigre tigre = new Tigre();
        tigre.setNome("Tito");
        tigre.setIdade(8);
        tigre.correr();
        try {
            tigre.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do tigre " + tigre.getNome() + " está incorreta", e);
        }

        Tigre tigre2 = new Tigre();
        tigre2.setNome("Pepe");
        tigre.setIdade(-2);
        try {
            tigre2.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do tigre " + tigre2.getNome() + " está incorreta", e);
        }
        tigre2.correr();
    }
}

package com.dh.turismo.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VooAPI {
    //Procura de voos de acordo com um horário pré-estabelecido.
    public String buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        List<String> linhaAereas = Arrays.asList("TAM", "Azul", "Gol");

        Random r = new Random();
        return linhaAereas.get(r.nextInt(linhaAereas.size()));
    }
}

package com.dh.turismo.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelAPI {
    //Procura de hotéis de acordo com um horário pré-estabelecido
    public String buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        List<String> hoteis = Arrays.asList("Thee Royal Palace", "Gold of Eishwage", "L'hôtel fantastique");

        Random r = new Random();
        return hoteis.get(r.nextInt(hoteis.size()));
    }
}

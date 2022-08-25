package com.example.odontologo.service;

import com.example.odontologo.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoServiceImpl implements IOdontologoService {

    @Override
    public List<Odontologo> listOdontologo() {
        return Arrays.asList(new Odontologo("Maria"), new Odontologo("João"));
    }

}

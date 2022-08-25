package com.example.projetoClinicaOdont.controller;

import com.example.projetoClinicaOdont.model.Usuario;
import com.example.projetoClinicaOdont.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping
    public Usuario salvar(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "senha") String senha,
            @RequestParam(value = "nivelAcesso") String nivelAcesso){

        return usuarioService.salvar(new Usuario(id, nome, email, senha, nivelAcesso));
    }

    @GetMapping("/buscar")
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id){
        return usuarioService.excluir(id);
    }

    //http://localhost:8082/usuario?id=2&nome=Felipe&email=felipe@email.com&senha=123456789&nivelAcesso=Vip

}

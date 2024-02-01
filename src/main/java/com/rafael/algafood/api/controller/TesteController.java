package com.rafael.algafood.api.controller;

import com.rafael.algafood.domain.model.Cozinha;
import com.rafael.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

//    @GetMapping("/cozinhas/por-nome")
//    public List<Cozinha> cozinhasPorNome(@RequestParam("nome") String nome) {
//        return cozinhaRepository.consultarPorNome(nome);
//    }
}

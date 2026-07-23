package com.juan.cadastrodeninjas.missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")

public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Listando";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterando";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Deletando";
    }
}

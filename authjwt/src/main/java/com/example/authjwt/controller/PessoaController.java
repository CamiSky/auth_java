package com.example.authjwt.controller;

import com.example.authjwt.model.PessoaModel;
import com.example.authjwt.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService service;

    @PostMapping()
    public ResponseEntity <PessoaModel> criar (@RequestBody PessoaModel pessoaModel) {
        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("/{id}").buildAndExpand(pessoaModel.getId()).toUri();
       PessoaModel pessoa = service.criarPessoa(pessoaModel);
        return ResponseEntity.created (uri).body(pessoa);
    }

    @GetMapping()
    public ResponseEntity <List<PessoaModel>> listar () {
        List<PessoaModel> pessoas = service.listarPessoa();
        return ResponseEntity.ok ().body(pessoas);
    }

}

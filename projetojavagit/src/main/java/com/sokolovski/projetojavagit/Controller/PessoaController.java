package com.sokolovski.projetojavagit.Controller;
import com.sokolovski.projetojavagit.Service.PessoaService;
import com.sokolovski.projetojavagit.dto.Pessoadto;
import com.sokolovski.projetojavagit.model.Pessoa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pessoa> criar(@RequestBody Pessoadto req) {
        Pessoa criado = service.criarPessoa(req.getNome(), req.getIdade());
        return ResponseEntity.status(201).body(criado);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> listar() {
        return ResponseEntity.ok(service.listarPessoas());
    }
}
package com.sokolovski.projetojavagit.Service;

import com.sokolovski.projetojavagit.Repositore.PessoaRepository;
import com.sokolovski.projetojavagit.model.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repo;

    public PessoaService(PessoaRepository repo) {
        this.repo = repo;
    }

    public Pessoa criarPessoa(String nome, Integer idade) {
        if (idade == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Idade é obrigatória");
        }
        if (idade < 18) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Convidado menor de 18 anos não pode ser cadastrado");
        }
        Pessoa p = new Pessoa(nome, idade);
        return repo.save(p);
    }

    public List<Pessoa> listarPessoas() {
        return repo.findAll();
    }
}
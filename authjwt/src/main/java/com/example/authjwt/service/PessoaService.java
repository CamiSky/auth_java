package com.example.authjwt.service;

import com.example.authjwt.model.PessoaModel;
import com.example.authjwt.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService implements UserDetailsService {
    @Autowired
    private PessoaRepository repository;

    @Override
    public UserDetails loadUserByUsername (String username) {
        return repository.findByLogin(username);
    }

    public PessoaModel criarPessoa (PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    public List<PessoaModel> listarPessoa () {
        return repository.findAll();
    }
}

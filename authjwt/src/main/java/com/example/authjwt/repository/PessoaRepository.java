package com.example.authjwt.repository;

import com.example.authjwt.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
    UserDetails findByLogin(String role);
}

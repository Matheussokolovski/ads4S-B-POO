package com.sokolovski.projetojavagit.Repositore;

import com.sokolovski.projetojavagit.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

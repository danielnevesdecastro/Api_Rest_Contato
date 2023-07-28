package com.unimed.Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.Agenda.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

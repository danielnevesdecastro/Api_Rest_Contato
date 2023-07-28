package com.unimed.Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.Agenda.entities.Contato;


public interface ContatoRepository extends JpaRepository<Contato, Long> {

}

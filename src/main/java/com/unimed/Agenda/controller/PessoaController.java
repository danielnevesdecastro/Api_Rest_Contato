package com.unimed.Agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unimed.Agenda.entities.Pessoa;
import com.unimed.Agenda.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa setPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
}

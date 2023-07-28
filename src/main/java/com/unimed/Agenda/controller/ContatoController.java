package com.unimed.Agenda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unimed.Agenda.entities.Contato;
import com.unimed.Agenda.repository.ContatoRepository;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	private ContatoRepository contatoRepository;

	public ContatoController(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	@GetMapping
	public List<Contato> getContato() {
		return contatoRepository.findAll();
	}

	@GetMapping("/contato/{id}")
	public Contato getContatoById(@PathVariable Long id) {
		return contatoRepository.findById(id).get();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato setContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteContato(@PathVariable Long id) {
		contatoRepository.deleteById(id);
	}
	
	@PutMapping("update/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Contato updateContato(@PathVariable Long id, @RequestBody Contato contatoAtt) {
		contatoAtt.setId(id);
		return contatoRepository.save(contatoAtt);
	}

}

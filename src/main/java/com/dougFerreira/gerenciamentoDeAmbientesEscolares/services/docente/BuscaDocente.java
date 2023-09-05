package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.docente;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.DocenteRepository;

@Service
public class BuscaDocente {

	private final DocenteRepository repository;
	
	public BuscaDocente(DocenteRepository repository) {
		this.repository = repository;
	}
	
	public Docente buscaPeloId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("DOcente com id %s não encontrado!", id)));
	}
	
	public Docente buscaPelaMatricula(String matricula) {
		return repository.findByMatricula(matricula).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("DOcente com matrícula %s não encontrado!", matricula)));
	}
	
	public List<Docente> buscaTodos() {
		return repository.findAll();
	}
}

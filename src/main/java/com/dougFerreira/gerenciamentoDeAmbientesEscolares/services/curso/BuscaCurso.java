package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.CursoRepository;

@Service
public class BuscaCurso {
	
	private final CursoRepository repository;

	public BuscaCurso(CursoRepository repository) {
		this.repository = repository;
	}
	
	public Curso buscarPeloId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Curso com id %s não encontrado!", id)));
	}
	
	public Curso buscarPeloCodigo(String codigo) {
		return repository.findByCodigo(codigo).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Curso com id %s não encontrado!", codigo)));
	}
	
	public List<Curso> buscarTodos() {
		return repository.findAll();
	}
}

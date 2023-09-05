package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.turma;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.TurmaRepository;

@Service
public class BuscaTurma {

	private final TurmaRepository repository;
	
	public BuscaTurma(TurmaRepository repository) {
		this.repository = repository;
	}
	
	public Turma buscarPeloId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Turma com id %s não encontrada!", id)));
	}
	
	public Turma buscarPeloCodigo(String codigo) {
		return repository.findByCodigo(codigo).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Turma com código %s não encontrada!", codigo)));
	}
	
	public List<Turma> buscarPeloCurso(Long curso_id) {
		return repository.findAllByCursoId(curso_id);
	}
	
	public List<Turma> buscarTodas() {
		return repository.findAll();
	}
}

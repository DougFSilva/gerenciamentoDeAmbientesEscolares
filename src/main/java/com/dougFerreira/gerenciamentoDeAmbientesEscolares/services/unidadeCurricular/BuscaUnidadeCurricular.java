package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.unidadeCurricular;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.UnidadeCurricular;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.UnidadeCurricularRepository;

@Service
public class BuscaUnidadeCurricular {

	private final UnidadeCurricularRepository repository;
	
	public BuscaUnidadeCurricular(UnidadeCurricularRepository repository) {
		this.repository = repository;
	}
	
	public UnidadeCurricular buscarPeloId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Unidade curricular com id %d não encontrado!", id)));
	}
	
	public UnidadeCurricular buscarPeloCodigo(String codigo) {
		return repository.findByCodigo(codigo).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Unidade curricular com código %d não encontrado!", codigo)));
	}
	
	public List<UnidadeCurricular> buscarPeloCurso(Long curso_id) {
		return repository.findAllByCursoId(curso_id);
	}
	
	public List<UnidadeCurricular> buscarTodas() {
		return repository.findAll();
	}
}

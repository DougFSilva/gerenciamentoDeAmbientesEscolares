package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.unidadeCurricular;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.UnidadeCurricular;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.UnidadeCurricularRepository;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso.BuscaCurso;

@Service
public class EditaUnidadeCurricular {

	private final UnidadeCurricularRepository repository;

	private final BuscaUnidadeCurricular buscaUnidadeCurricular;
	
	private final BuscaCurso buscaCurso;

	public EditaUnidadeCurricular(UnidadeCurricularRepository repository, BuscaUnidadeCurricular buscaUnidadeCurricular, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaUnidadeCurricular = buscaUnidadeCurricular;
		this.buscaCurso = buscaCurso;
	}
	
	public UnidadeCurricular editar(Long id, Long curso_id, String codigo, String descricao ) {
		UnidadeCurricular unidadeCurricular = buscaUnidadeCurricular.buscarPeloId(id);
		Curso curso = buscaCurso.buscarPeloId(curso_id);
		unidadeCurricular.setCurso(curso);
		unidadeCurricular.setCodigo(codigo);
		unidadeCurricular.setDescricao(descricao);
		return repository.save(unidadeCurricular);
	}
}

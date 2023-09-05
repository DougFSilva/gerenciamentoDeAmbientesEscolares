package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.unidadeCurricular;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.UnidadeCurricular;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.UnidadeCurricularRepository;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso.BuscaCurso;

@Service
public class CadastraUnidadeCurricular {

	private final UnidadeCurricularRepository repository;
	
	private final BuscaCurso buscaCurso;
	
	public CadastraUnidadeCurricular(UnidadeCurricularRepository repository, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaCurso = buscaCurso;
	}
	
	public UnidadeCurricular cadastrar(Long curso_id, String codigo, String descricao) {
		Curso curso = buscaCurso.buscarPeloId(curso_id);
		UnidadeCurricular unidadeCurricular = new UnidadeCurricular(null, curso, codigo, descricao);
		return repository.save(unidadeCurricular);
	}
}

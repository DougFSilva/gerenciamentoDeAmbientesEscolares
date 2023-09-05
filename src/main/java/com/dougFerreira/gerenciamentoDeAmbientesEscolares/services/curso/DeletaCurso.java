package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.CursoRepository;

@Service
public class DeletaCurso {

	private final CursoRepository repository;
	
	private final BuscaCurso buscaCurso;
	
	public DeletaCurso(CursoRepository repository, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaCurso = buscaCurso;
	}
	
	public void deletar(Long id) {
		Curso curso = buscaCurso.buscarPeloId(id);
		repository.delete(curso);
	}
}

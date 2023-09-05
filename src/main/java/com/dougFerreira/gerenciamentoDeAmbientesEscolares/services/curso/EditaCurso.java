package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.CursoRepository;

@Service
public class EditaCurso {

	private final CursoRepository repository;

	private final BuscaCurso buscaCurso;

	public EditaCurso(CursoRepository repository, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaCurso = buscaCurso;
	}
	
	public Curso editar(Long id, String codigo, String descricao, String areaTecnologica) {
		Curso curso = buscaCurso.buscarPeloId(id);
		curso.setCodigo(codigo);
		curso.setDescricao(descricao);
		curso.setAreaTecnologica(areaTecnologica);
		return repository.save(curso);
	}
}

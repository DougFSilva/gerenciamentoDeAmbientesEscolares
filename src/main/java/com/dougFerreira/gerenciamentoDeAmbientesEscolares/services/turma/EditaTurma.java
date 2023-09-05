package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.turma;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.TurmaRepository;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso.BuscaCurso;

@Service
public class EditaTurma {

	private final TurmaRepository repository;
	
	private final BuscaTurma buscaTurma;
	
	private final BuscaCurso buscaCurso;
	
	public EditaTurma(TurmaRepository repository, BuscaTurma buscaTurma, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaTurma = buscaTurma;
		this.buscaCurso = buscaCurso;
	}
	
	public Turma editar(Long id, String codigo, String descricao, Long curso_id, String areaTecnologica ) {
		Turma turma = buscaTurma.buscarPeloId(id);
		Curso curso = buscaCurso.buscarPeloId(curso_id);
		turma.setCodigo(codigo);
		turma.setDescricao(descricao);
		turma.setCurso(curso);
		turma.setAreaTecnologica(areaTecnologica);
		return repository.save(turma);
	}

}

package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.turma;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.TurmaRepository;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso.BuscaCurso;

@Service
public class CadastraTurma {

	private final TurmaRepository repository;
	
	private final BuscaCurso buscaCurso;
	
	public CadastraTurma(TurmaRepository repository, BuscaCurso buscaCurso) {
		this.repository = repository;
		this.buscaCurso = buscaCurso;
	}
	
	public Turma cadastrar(String codigo, String descricao, Long curso_id, String areaTecnologica) {
		Curso curso = buscaCurso.buscarPeloId(curso_id);
		Turma turma = new Turma(null, codigo, descricao, curso, areaTecnologica);
		return repository.save(turma);
	}
}

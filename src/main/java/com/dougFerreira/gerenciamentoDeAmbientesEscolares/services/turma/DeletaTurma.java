package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.turma;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.TurmaRepository;

@Service
public class DeletaTurma {

	private final TurmaRepository repository;
	
	private final BuscaTurma buscaTurma;
	
	public DeletaTurma(TurmaRepository repository, BuscaTurma buscaTurma) {
		this.repository = repository;
		this.buscaTurma = buscaTurma;
	}
	
	public void deletar(long id) {
		Turma turma = buscaTurma.buscarPeloId(id);
		repository.delete(turma);
	}
}

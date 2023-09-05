package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.unidadeCurricular;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.UnidadeCurricular;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.UnidadeCurricularRepository;

@Service
public class DeletaUnidadeCurricular {

	private final UnidadeCurricularRepository repository;
	
	private final BuscaUnidadeCurricular buscaUnidadeCurricular;
	
	public DeletaUnidadeCurricular(UnidadeCurricularRepository repository, BuscaUnidadeCurricular buscaUnidadeCurricular) {
		this.repository = repository;
		this.buscaUnidadeCurricular = buscaUnidadeCurricular;
	}
	
	public void deletar(Long id) {
		UnidadeCurricular unidadeCurricular = buscaUnidadeCurricular.buscarPeloId(id);
		repository.delete(unidadeCurricular);
	}
}

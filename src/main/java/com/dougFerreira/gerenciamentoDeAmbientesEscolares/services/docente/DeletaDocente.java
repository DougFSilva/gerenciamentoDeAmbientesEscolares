package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.docente;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.DocenteRepository;

@Service
public class DeletaDocente {

	private final DocenteRepository repository;
	
	private final BuscaDocente buscaDocente;
	
	public DeletaDocente(DocenteRepository repository, BuscaDocente buscaDocente) {
		this.repository = repository;
		this.buscaDocente = buscaDocente;
	}
	
	public void deletar(long id) {
		Docente docente = buscaDocente.buscaPeloId(id);
		repository.delete(docente);
	}
}

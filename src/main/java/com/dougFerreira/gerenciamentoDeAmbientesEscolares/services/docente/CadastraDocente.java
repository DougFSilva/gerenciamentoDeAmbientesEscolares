package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.docente;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.DocenteRepository;

@Service
public class CadastraDocente {

	private final DocenteRepository repository;
	
	public CadastraDocente(DocenteRepository repository) {
		this.repository = repository;
	}
	
	public Docente cadastrar(String matricula, String nome, String email, String ocupacao ) {
		Docente docente = new Docente(null, matricula, nome, email, ocupacao);
		return repository.save(docente);
	}
}

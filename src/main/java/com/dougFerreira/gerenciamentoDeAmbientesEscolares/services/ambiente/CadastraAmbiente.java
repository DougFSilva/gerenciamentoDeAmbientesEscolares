package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AmbienteRepository;

@Service
public class CadastraAmbiente {

	private final AmbienteRepository repository;
	
	public CadastraAmbiente(AmbienteRepository repository, BuscaAmbiente buscaAmbiente) {
		this.repository = repository;
	}
	
	public Ambiente cadastrar(String codigo, String descricao, Integer capacidade) {
		Ambiente ambiente = new Ambiente(null, codigo, descricao, capacidade);
		return repository.save(ambiente);
	}
}

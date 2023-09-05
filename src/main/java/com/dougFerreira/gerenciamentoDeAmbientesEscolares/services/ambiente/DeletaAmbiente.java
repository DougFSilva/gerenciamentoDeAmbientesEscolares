package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AmbienteRepository;

@Service
public class DeletaAmbiente {

	private final AmbienteRepository repository;

	private final BuscaAmbiente buscaAmbiente;

	public DeletaAmbiente(AmbienteRepository repository, BuscaAmbiente buscaAmbiente) {
		this.repository = repository;
		this.buscaAmbiente = buscaAmbiente;
	}
	
	public void deletar(Long id) {
		Ambiente ambiente = buscaAmbiente.buscarPeloId(id);
		repository.delete(ambiente);
	}
}

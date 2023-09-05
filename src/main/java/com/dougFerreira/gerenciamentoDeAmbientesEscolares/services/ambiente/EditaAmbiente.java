package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AmbienteRepository;

public class EditaAmbiente {

	private final AmbienteRepository repository;

	private final BuscaAmbiente buscaAmbiente;

	public EditaAmbiente(AmbienteRepository repository, BuscaAmbiente buscaAmbiente) {
		this.repository = repository;
		this.buscaAmbiente = buscaAmbiente;
	}
	
	public Ambiente editar(Long id, String codigo, String descricao, Integer capacidade) {
		Ambiente ambiente = buscaAmbiente.buscarPeloId(id);
		ambiente.setCodigo(codigo);
		ambiente.setDescricao(descricao);
		ambiente.setCapacidade(capacidade);
		return repository.save(ambiente);
	}
	
}

package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AmbienteRepository;

public class EditaAmbiente {

	private final AmbienteRepository repository;

	public EditaAmbiente(AmbienteRepository repository) {
		this.repository = repository;
	}
}

package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.agendamento;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AgendamentoRepository;

@Service
public class DeletaAgendamento {
	
	private final AgendamentoRepository repository;

	private final BuscaAgendamento buscaAgendamento;

	public DeletaAgendamento(AgendamentoRepository repository, BuscaAgendamento buscaAgendamento) {
		this.repository = repository;
		this.buscaAgendamento = buscaAgendamento;
	}
	
	public void deletar(long id) {
		Agendamento agendamento = buscaAgendamento.buscarPeloId(id);
		repository.save(agendamento);
	}
	
	
}

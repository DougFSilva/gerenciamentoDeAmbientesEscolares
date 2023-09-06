package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.agendamento;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.OperacaoNaoPermitidaException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Periodo;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AgendamentoRepository;

@Service
public class ValidaAgendamento {

	private final AgendamentoRepository repository;

	public ValidaAgendamento(AgendamentoRepository repository) {
		this.repository = repository;
	}
	
	public void validar(LocalDate data, Periodo periodo, Long ambiente_id) {
		Optional<Agendamento> agendamento =  repository.findByDataAndPeriodoAndAmbienteId(data, periodo, ambiente_id);
		if(agendamento.isPresent()) {
			throw new OperacaoNaoPermitidaException("Já existe agendameno para este ambiente, nesta data e período");
		}
	}
	
}

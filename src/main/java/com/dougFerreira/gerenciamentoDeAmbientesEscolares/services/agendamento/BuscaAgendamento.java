package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.agendamento;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AgendamentoRepository;

@Service
public class BuscaAgendamento {

	private final AgendamentoRepository repository;
	
	public BuscaAgendamento(AgendamentoRepository repository) {
		this.repository = repository;
	}

	public Agendamento buscarPeloId(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new ObjetoNaoEncontradoException(String.format("Agendamento com id %s não encontrado!", id)));
	}

	public Page<Agendamento> buscarPelaTurma(Long turma_id, Pageable paginacao) {
		return repository.findAllByTurmaId(turma_id, paginacao);
	}

	public Page<Agendamento> buscarPeloAmbiente(Long ambiente_id, Pageable paginacao) {
		return repository.findAllByAmbienteId(ambiente_id, paginacao);
	}

	public Page<Agendamento> buscarPeloADocente(Long docente_id, Pageable paginacao) {
		return repository.findAllByDocenteId(docente_id, paginacao);
	}

	public Page<Agendamento> buscarPelaData(LocalDate dataInicial, LocalDate dataFinal, Pageable paginacao) {
		return repository.findAllByDataBetween(dataInicial, dataFinal, paginacao);
	}

	public Page<Agendamento> buscarTodos(Pageable paginacao) {
		return repository.findAll(paginacao);
	}

}

package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.agendamento;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Periodo;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AgendamentoRepository;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente.BuscaAmbiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.docente.BuscaDocente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.turma.BuscaTurma;

@Service
public class EditaAgendamento {

	private final AgendamentoRepository repository;

	private final BuscaAgendamento buscaAgendamento;

	private final BuscaTurma buscaTurma;

	private final BuscaAmbiente buscaAmbiente;

	private final BuscaDocente buscaDocente;

	public EditaAgendamento(AgendamentoRepository repository, BuscaAgendamento buscaAgendamento, BuscaTurma buscaTurma,
			BuscaAmbiente buscaAmbiente, BuscaDocente buscaDocente) {
		this.repository = repository;
		this.buscaAgendamento = buscaAgendamento;
		this.buscaTurma = buscaTurma;
		this.buscaAmbiente = buscaAmbiente;
		this.buscaDocente = buscaDocente;
	}
	
	public Agendamento editar(Long id, LocalDate data, Periodo periodo, Long turma_id, Long ambiente_id, Long docente_id) {
		Agendamento agendamento = buscaAgendamento.buscarPeloId(id);
		Turma turma = buscaTurma.buscarPeloId(turma_id);
		Ambiente ambiente = buscaAmbiente.buscarPeloId(ambiente_id);
		Docente docente = buscaDocente.buscaPeloId(docente_id);
		agendamento.setData(data);
		agendamento.setPeriodo(periodo);
		agendamento.setTurma(turma);
		agendamento.setAmbiente(ambiente);
		agendamento.setDocente(docente);
		return repository.save(agendamento);
	}
	
}

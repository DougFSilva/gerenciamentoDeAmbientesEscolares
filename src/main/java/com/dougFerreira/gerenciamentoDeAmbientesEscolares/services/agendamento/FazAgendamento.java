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
public class FazAgendamento {

	private final AgendamentoRepository repository;
	
	private final BuscaTurma buscaTurma;
	
	private final BuscaAmbiente buscaAmbiente;
	
	private final BuscaDocente buscaDocente;

	public FazAgendamento(AgendamentoRepository repository, BuscaTurma buscaTurma, BuscaAmbiente buscaAmbiente,
			BuscaDocente buscaDocente) {
		this.repository = repository;
		this.buscaTurma = buscaTurma;
		this.buscaAmbiente = buscaAmbiente;
		this.buscaDocente = buscaDocente;
	}
	
	public Agendamento agendar(LocalDate data, Periodo periodo, Long turma_id, Long ambiente_id, Long docente_id ) {
		Turma turma = buscaTurma.buscarPeloId(turma_id);
		Ambiente ambiente = buscaAmbiente.buscarPeloId(ambiente_id);
		Docente docente = buscaDocente.buscaPeloId(docente_id);
		Agendamento agendamento = new Agendamento(null, data, periodo,turma, ambiente, docente );
		return repository.save(agendamento);
	}
	
	
}

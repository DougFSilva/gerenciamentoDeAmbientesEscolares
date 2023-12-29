package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.agendamento;

import java.time.LocalDate;
import java.util.List;

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
	
	private final ValidaAgendamento validaAgendamento;

	public FazAgendamento(AgendamentoRepository repository, BuscaTurma buscaTurma, BuscaAmbiente buscaAmbiente,
			BuscaDocente buscaDocente, ValidaAgendamento validaAgendamento) {
		this.repository = repository;
		this.buscaTurma = buscaTurma;
		this.buscaAmbiente = buscaAmbiente;
		this.buscaDocente = buscaDocente;
		this.validaAgendamento = validaAgendamento;
	}
	
	public Agendamento agendar(LocalDate data, Periodo periodo, Long turma_id, Long ambiente_id, Long docente_id ) {
		validaAgendamento.validar(data, periodo, ambiente_id);
		Turma turma = buscaTurma.buscarPeloId(turma_id);
		Ambiente ambiente = buscaAmbiente.buscarPeloId(ambiente_id);
		Docente docente = buscaDocente.buscaPeloId(docente_id);
		Agendamento agendamento = new Agendamento(null, data, periodo,turma, ambiente, docente );
		return repository.save(agendamento);
	}
	
	//Agendar pelos dias da semana entre duas datas
	public List<Agendamento> agendarPorDiaDaSemana(LocalDate dataInicial, LocalDate dataFinal, Integer diaDaSemana){
	}
	
	
}

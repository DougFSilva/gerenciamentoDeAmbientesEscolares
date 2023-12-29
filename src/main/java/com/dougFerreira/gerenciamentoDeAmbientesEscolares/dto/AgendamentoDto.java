package com.dougFerreira.gerenciamentoDeAmbientesEscolares.dto;

import java.time.LocalDate;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Periodo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AgendamentoDto {

	private Long id;
	
	private LocalDate data;
	
	private Periodo periodo;
	
	private String turma;
	
	private String ambiente;
	
	private String docente;
	
	public AgendamentoDto(Agendamento agendamento) {
		this.id = agendamento.getId();
		this.data = agendamento.getData();
		this.periodo = agendamento.getPeriodo();
		this.turma = agendamento.getTurma().getCodigo();
		this.ambiente = agendamento.getAmbiente().getCodigo();
		this.docente = agendamento.getDocente().getNome();
	}
}

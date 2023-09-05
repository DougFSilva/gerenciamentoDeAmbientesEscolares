package com.dougFerreira.gerenciamentoDeAmbientesEscolares.models;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"data", "periodo", "ambiente"}))
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate data;
	
	@Enumerated(EnumType.STRING)
	private Periodo periodo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Turma turma;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ambiente ambiente;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Docente docente;
}

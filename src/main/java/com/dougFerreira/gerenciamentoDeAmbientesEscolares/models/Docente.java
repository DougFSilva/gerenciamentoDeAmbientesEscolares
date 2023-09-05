package com.dougFerreira.gerenciamentoDeAmbientesEscolares.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Entity
public class Docente {

	private Long id;
	
	@Column(unique = true)
	private String matricula;
	
	private String nome;
	
	private String email;
	
	private String ocupacao;
}

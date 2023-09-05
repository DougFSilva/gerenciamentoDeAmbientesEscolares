package com.dougFerreira.gerenciamentoDeAmbientesEscolares.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String codigo;
	
	private String descricao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Curso curso;
	
	private String areaTecnologica;
}

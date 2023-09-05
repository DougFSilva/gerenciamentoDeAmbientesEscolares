package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.curso;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.CursoRepository;

@Service
public class CadastraCurso {

	private final CursoRepository repository;
	
	public CadastraCurso(CursoRepository repository) {
		this.repository = repository;
	}
	
	public Curso cadastrar(String codigo, String descricao, String areaTecnologica) {
		Curso curso = new Curso(null, codigo, descricao, areaTecnologica);
		return repository.save(curso);
	}
}

package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.docente;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.DocenteRepository;

@Service
public class EditaDocente {

	private final DocenteRepository repository;

	private final BuscaDocente buscaDocente;

	public EditaDocente(DocenteRepository repository, BuscaDocente buscaDocente) {
		this.repository = repository;
		this.buscaDocente = buscaDocente;
	}
	
	public Docente editar(Long id, String matricula, String nome, String email, String ocupacao) {
		Docente docente = buscaDocente.buscaPeloId(id);
		docente.setMatricula(matricula);
		docente.setNome(nome);
		docente.setEmail(email);
		docente.setOcupacao(ocupacao);
		return repository.save(docente);
	}
}

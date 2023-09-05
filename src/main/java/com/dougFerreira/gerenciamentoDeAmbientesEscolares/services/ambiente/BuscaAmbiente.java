package com.dougFerreira.gerenciamentoDeAmbientesEscolares.services.ambiente;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions.ObjetoNaoEncontradoException;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;
import com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories.AmbienteRepository;

@Service
public class BuscaAmbiente {
	
	private final AmbienteRepository repository;

	public BuscaAmbiente(AmbienteRepository repository) {
		this.repository = repository;
	}
	
	public Ambiente buscarPeloId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Ambiente com id %s não encontrado!", id)));
	}
	
	public Ambiente buscarPeloCodigo(String codigo) {
		return repository.findByCodigo(codigo).orElseThrow(() -> new ObjetoNaoEncontradoException(String.format("Ambiente com codigo %s não encontrado!", codigo)));
	}
	
	public List<Ambiente> buscarTodos(){
		return repository.findAll();
	}
}

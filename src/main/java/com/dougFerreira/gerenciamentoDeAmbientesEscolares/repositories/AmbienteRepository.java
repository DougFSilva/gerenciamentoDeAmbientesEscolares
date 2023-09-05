package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Ambiente;

public interface AmbienteRepository extends JpaRepository<Ambiente, Long>{

}

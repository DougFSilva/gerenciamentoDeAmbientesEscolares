package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

}

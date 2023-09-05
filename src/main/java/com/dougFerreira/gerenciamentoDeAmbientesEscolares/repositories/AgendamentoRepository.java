package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

	Page<Agendamento> findAllByTurmaId(Long turma_id, Pageable paginacao);

	Page<Agendamento> findAllByAmbienteId(Long ambiente_id, Pageable paginacao);

	Page<Agendamento> findAllByDocenteId(Long docente_id, Pageable paginacao);

	Page<Agendamento> findAllByDataBetween(LocalDate dataInicial, LocalDate dataFinal, Pageable paginacao);

	Page<Agendamento> findAll(Pageable paginacao);

}

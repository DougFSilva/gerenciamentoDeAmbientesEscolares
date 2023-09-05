package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long>{

	Optional<Turma> findByCodigo(String codigo);

	List<Turma> findAllByCursoId(Long curso_id);

}

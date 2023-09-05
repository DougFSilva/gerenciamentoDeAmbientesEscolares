package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Optional<Curso> findByCodigo(String codigo);

}

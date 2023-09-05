package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}

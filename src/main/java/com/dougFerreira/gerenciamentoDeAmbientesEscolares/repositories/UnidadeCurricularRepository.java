package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.UnidadeCurricular;

public interface UnidadeCurricularRepository extends JpaRepository<UnidadeCurricular, Long>{

	Optional<UnidadeCurricular> findByCodigo(String codigo);

	List<UnidadeCurricular> findAllByCursoId(Long curso_id);

}

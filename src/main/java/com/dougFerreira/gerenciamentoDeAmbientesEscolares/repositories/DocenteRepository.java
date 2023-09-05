package com.dougFerreira.gerenciamentoDeAmbientesEscolares.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougFerreira.gerenciamentoDeAmbientesEscolares.models.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Long>{

}

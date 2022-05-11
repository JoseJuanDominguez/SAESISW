package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Maestros_has_grupos;

public interface Maestros_has_gruposRepository extends JpaRepository<Maestros_has_grupos, String> {
	
	@Query("SELECT a FROM Maestros_has_grupos a where a.maestros_rfc = :maestros_rfc and a.grupos_grupo = :grupos_grupo")
	Maestros_has_grupos findMaestros_has_grupos(@Param("maestros_rfc") String maestros_rfc, @Param("grupos_grupo") String grupos_grupo);
	@Query("SELECT a FROM Maestros_has_grupos a where a.maestros_rfc = :maestros_rfc")
	Maestros_has_grupos findMaestros_rfc(@Param("maestros_rfc") String maestros_rfc);

	@Query("SELECT a FROM Maestros_has_grupos a where a.grupos_grupo = :grupos_grupo")
	Maestros_has_grupos findGrupos_grupo(@Param("grupos_grupo") String grupos_grupo);
}


package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_grupos;

public interface Alumnos_has_gruposRepository  extends JpaRepository<Alumnos_has_grupos, String> {
	@Query("SELECT a FROM Alumnos_has_grupos a where a.alumnos_boleta = :alumnos_boleta and a.grupos_grupo = :grupos_grupo")
	Alumnos_has_grupos findAlumnoHGById(@Param("alumnos_boleta") String alumnos_boleta, @Param("grupos_grupo") String grupos_grupo);

	@Query("SELECT a FROM Alumnos_has_grupos a where a.grupos_grupo = :grupos_grupo")
	List<Alumnos_has_grupos> findAlumnoHGByGrupo(@Param("grupos_grupo") String grupos_grupo);
	
	@Query("SELECT a  FROM Alumnos_has_grupos a where a.alumnos_boleta = :alumnos_boleta")
	List<Alumnos_has_grupos>  findAlumnoHGByBoleta(@Param("alumnos_boleta") String alumnos_boleta);
}

package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Calificaciones;

public interface CalificacionesRepository extends JpaRepository<Calificaciones, String> {

	@Query(value="select distinct gm.grupos_grupo, mat.nombre_m, cal.primerdep, cal.segundodep, cal.tercerdep, cal.extra from alumnos al, materias mat inner join calificaciones cal on mat.idmateria like cal.materias_idmateria inner join grupos_has_materias gm on gm.materias_idmateria like mat.idmateria where alumnos_boleta = :alumnos_boleta", nativeQuery = true)

	List<Calificaciones> findCalificaciones(@Param("alumnos_boleta") String alumnos_boleta);

}

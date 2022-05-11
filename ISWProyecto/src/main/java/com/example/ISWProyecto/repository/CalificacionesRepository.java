package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Calificaciones;

public interface CalificacionesRepository extends JpaRepository<Calificaciones, String> {

	@Query("SELECT a FROM Calificaciones a where a.materias_idmateria = :materias_idmateria")
	Calificaciones findCalificaciones(@Param("materias_idmateria") String materias_idmateria);

}

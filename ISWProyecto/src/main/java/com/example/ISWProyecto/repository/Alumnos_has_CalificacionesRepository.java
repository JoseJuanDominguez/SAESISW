package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;

public interface Alumnos_has_CalificacionesRepository extends JpaRepository<Alumnos_has_Calificaciones, String> {
	@Query("SELECT a FROM Alumnos_has_Calificaciones a where a.alumnos_boleta = :alumnos_boleta and a.calificaciones_materias_idmateria = :calificaciones_materias_idmateria")
	Alumnos_has_Calificaciones findAlumnoHCById(@Param("alumnos_boleta") String alumnos_boleta, @Param("calificaciones_materias_idmateria") String calificaciones_materias_idmateria);
}

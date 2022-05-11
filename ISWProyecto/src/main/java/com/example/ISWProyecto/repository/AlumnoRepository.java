package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {
	
	@Query("SELECT a FROM Alumno a where a.boleta = :boleta and a.contrasena = :contrasena")
	Alumno findAlumno(@Param("boleta") String boleta, @Param("contrasena") String contrasena);

}

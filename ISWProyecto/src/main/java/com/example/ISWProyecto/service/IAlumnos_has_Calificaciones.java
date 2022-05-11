package com.example.ISWProyecto.service;
import java.util.List;

import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
public interface IAlumnos_has_Calificaciones {
	
	
	
	Alumnos_has_Calificaciones findAlumnoHCById(String alumnos_boleta, String calificaciones_materias_idmateria);
	List<Alumnos_has_Calificaciones> findAll();

}

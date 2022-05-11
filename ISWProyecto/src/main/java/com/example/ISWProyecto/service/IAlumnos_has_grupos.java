package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Alumnos_has_grupos;

public interface IAlumnos_has_grupos {
	
	
	
	Alumnos_has_grupos findAlumnoHGById(String alumnos_boleta, String grupos_grupo);
	
	List<Alumnos_has_grupos> findAll();

}

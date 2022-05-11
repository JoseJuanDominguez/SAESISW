package com.example.ISWProyecto.service;



import java.util.List;

import com.example.ISWProyecto.model.Alumno;

public interface IAlumnoService {
	
	
	Alumno findAlumno(String boleta, String contrasena);
	
	List<Alumno> findAll();

}

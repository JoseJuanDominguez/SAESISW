package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Alumnos_has_deportes;

public interface IAlumnos_has_deportesService {
	
	Alumnos_has_deportes findAlumnos_has_deportes(String alumnos_boleta, int deportes_iddeporte);

	Alumnos_has_deportes findAlumnos_boleta(String alumnos_boleta);

	Alumnos_has_deportes findDeportes_iddeporte(int deportes_iddeporte);
	List<Alumnos_has_deportes> findAll();
	
}

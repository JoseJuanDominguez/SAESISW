package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.HorarioAlumno;

public interface IHorarioAlumnoService {
	List<HorarioAlumno> findHorarioAlumno(String alumnos_boleta );
	List<HorarioAlumno> findAll();
}

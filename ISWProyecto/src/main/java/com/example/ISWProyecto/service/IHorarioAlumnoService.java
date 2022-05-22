package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.HorarioAlumno;

public interface IHorarioAlumnoService {
	List<HorarioAlumno> findHorarioAlumno(String boleta,String grupos_grupo);
	List<HorarioAlumno> findAll();
}

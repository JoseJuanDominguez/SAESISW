package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Calificaciones;

public interface ICalificacionesService {

	Calificaciones findCalificaciones(String materias_idmateria);

	List<Calificaciones> findAll();

}

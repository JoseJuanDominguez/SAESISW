package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Calificaciones;

public interface ICalificacionesService {

	List<Calificaciones> findCalificaciones(String alumnos_boleta);

	List<Calificaciones> findAll();

}

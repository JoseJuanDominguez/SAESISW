package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Calificaciones;
import com.example.ISWProyecto.repository.CalificacionesRepository;
import com.example.ISWProyecto.service.ICalificacionesService;

@Service("CalificacionesService")
public class CalificacionesServiceImpl implements ICalificacionesService{

	@Autowired
	private CalificacionesRepository calificacionesRepository;

	@Override
	public Calificaciones findCalificaciones(String materias_idmateria) {
		return calificacionesRepository.findCalificaciones(materias_idmateria);
	}

	@Override
	public List<Calificaciones> findAll() {
		return calificacionesRepository.findAll();
	}
}

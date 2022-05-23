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
	public List<Calificaciones> findAll() {
		return calificacionesRepository.findAll();
	}

	@Override
	public List<Calificaciones> findCalificaciones(String alumnos_boleta) {
		// TODO Auto-generated method stub
		return calificacionesRepository.findCalificaciones(alumnos_boleta);
	}
}

package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
import com.example.ISWProyecto.repository.Alumnos_has_CalificacionesRepository;
import com.example.ISWProyecto.service.IAlumnos_has_Calificaciones;
@Service("Alumnos_has_CalificacionesService")
public class Alumnos_has_CalificacionesServiceImpl implements IAlumnos_has_Calificaciones {

	@Autowired
	private Alumnos_has_CalificacionesRepository alumnoshcRepository;


	@Override
	public Alumnos_has_Calificaciones findAlumnoHCById(String alumnos_boleta, String calificaciones_materias_idmateria) {
		
		return alumnoshcRepository.findAlumnoHCById(alumnos_boleta, calificaciones_materias_idmateria);
	}
	
	@Override
	public List<Alumnos_has_Calificaciones> findAll() {
		
		return alumnoshcRepository.findAll();
	}

}

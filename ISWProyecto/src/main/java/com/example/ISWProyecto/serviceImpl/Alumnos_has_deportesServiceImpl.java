package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumnos_has_deportes;
import com.example.ISWProyecto.repository.Alumnos_has_deportesRepository;
import com.example.ISWProyecto.service.IAlumnos_has_deportesService;

@Service("Alumnos_has_deportesService")
public class Alumnos_has_deportesServiceImpl implements IAlumnos_has_deportesService {
	
	@Autowired
	private Alumnos_has_deportesRepository alumnos_has_deportesRepository;

	@Override
	public Alumnos_has_deportes findAlumnos_has_deportes(String alumnos_boleta, int deportes_iddeporte) {
		return alumnos_has_deportesRepository.findAlumnos_has_deportes(alumnos_boleta, deportes_iddeporte);
	}
	@Override
	public Alumnos_has_deportes findAlumnos_boleta(String alumnos_boleta) {
		return alumnos_has_deportesRepository.findAlumnos_boleta(alumnos_boleta);
	}

	@Override
	public Alumnos_has_deportes findDeportes_iddeporte(int deportes_iddeporte) {
		return alumnos_has_deportesRepository.findDeportes_iddeporte(deportes_iddeporte);
	}
	@Override
	public List<Alumnos_has_deportes> findAll() {
		return  alumnos_has_deportesRepository.findAll();
	}
}


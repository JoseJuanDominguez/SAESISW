package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.repository.AlumnoRepository;
import com.example.ISWProyecto.service.IAlumnoService;

@Service("AlumnoService")
public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public Alumno findAlumno(String boleta, String contrasena) {
		// TODO alumnoRepository-generated method stub
		return alumnoRepository.findAlumno( boleta,  contrasena);
	}

	@Override
	public Alumno findAlumnoByBoleta(String boleta) {
		// TODO Auto-generated method stub
		return alumnoRepository.findAlumnoByBoleta(boleta);
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}



}

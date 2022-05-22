package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.HorarioAlumno;
import com.example.ISWProyecto.repository.HorarioAlumnoRepository;
import com.example.ISWProyecto.service.IHorarioAlumnoService;

@Service("HorarioAlumnoService")
public class HorarioAlumnoServiceImpl implements IHorarioAlumnoService{
	@Autowired
	private HorarioAlumnoRepository horarioAlumnoRepository;

	@Override
	public List<HorarioAlumno> findAll() {
		// TODO Auto-generated method stub
		return horarioAlumnoRepository.findAll();
	}

	@Override
	public List<HorarioAlumno> findHorarioAlumno(String boleta, String grupos_grupo) {
		// TODO Auto-generated method stub
		return horarioAlumnoRepository.findHorarioAlumno(boleta, grupos_grupo);
	}
	

}

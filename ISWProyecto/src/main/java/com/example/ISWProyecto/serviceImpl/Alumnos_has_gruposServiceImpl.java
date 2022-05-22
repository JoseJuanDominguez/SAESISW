package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.repository.Alumnos_has_gruposRepository;
import com.example.ISWProyecto.service.IAlumnos_has_grupos;

@Service("Alumnos_has_gruposService")
public class Alumnos_has_gruposServiceImpl implements IAlumnos_has_grupos {

	@Autowired
	Alumnos_has_gruposRepository alumnoshgRepository;
	

	@Override
	public Alumnos_has_grupos findAlumnoHGById(String alumnos_boleta, String grupos_grupo) {
		
		return alumnoshgRepository.findAlumnoHGById(alumnos_boleta, grupos_grupo);
	}
	@Override
	public List<Alumnos_has_grupos> findAll() {
		return alumnoshgRepository.findAll();
	}
	@Override
	public List<Alumnos_has_grupos> findAlumnoHGByGrupo(String grupos_grupo) {
		return alumnoshgRepository.findAlumnoHGByGrupo(grupos_grupo);
	}
	@Override
	public List<Alumnos_has_grupos> findAlumnoHGByBoleta(String alumnos_boleta) {
		return alumnoshgRepository.findAlumnoHGByBoleta(alumnos_boleta);
	}


}

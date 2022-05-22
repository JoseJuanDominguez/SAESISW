package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Grupos_has_materias;
import com.example.ISWProyecto.repository.Grupos_has_materiasRepository;
import com.example.ISWProyecto.service.IGrupos_has_materiasService;
@Service("Grupos_has_materiasService")
public class Grupos_has_materiasServiceImpl implements IGrupos_has_materiasService{

	@Autowired
	private Grupos_has_materiasRepository grupos_has_materiasRepository;

	@Override
	public List< Grupos_has_materias> findGrupos_has_materias(String grupos_grupo) {
		return grupos_has_materiasRepository.findGrupos_has_materias(grupos_grupo);
	}
	@Override
	public Grupos_has_materias findGrupos_grupo(String grupos_grupo) {
		return grupos_has_materiasRepository.findGrupos_grupo(grupos_grupo);
	}

	@Override
	public Grupos_has_materias findMaterias_idmateria(String materias_idmateria) {
		return grupos_has_materiasRepository.findMaterias_idmateria(materias_idmateria);
	}

	@Override
	public List<Grupos_has_materias> findAll() {
		return grupos_has_materiasRepository.findAll();
	}

}

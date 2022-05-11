package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Grupos_has_materias;

public interface IGrupos_has_materiasService {
	
	
	Grupos_has_materias findGrupos_has_materias(String grupos_grupo, String materias_idmateria);
	
	List<Grupos_has_materias> findAll();

}


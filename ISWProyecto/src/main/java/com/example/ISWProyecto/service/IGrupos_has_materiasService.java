package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Grupos_has_materias;

public interface IGrupos_has_materiasService {


	List<Grupos_has_materias> findGrupos_has_materias(String grupos_grupo);

	Grupos_has_materias findGrupos_grupo(String grupos_grupo);

	Grupos_has_materias findMaterias_idmateria(String materias_idmateria);

	List<Grupos_has_materias> findAll();

}



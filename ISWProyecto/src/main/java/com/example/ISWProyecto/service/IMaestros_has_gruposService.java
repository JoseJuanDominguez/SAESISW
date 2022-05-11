package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Maestros_has_grupos;

public interface IMaestros_has_gruposService {
	
	Maestros_has_grupos findMaestros_has_grupos(String maestros_rfc, String grupos_grupo);
	Maestros_has_grupos findMaestros_rfc(String maestros_rfc);

	Maestros_has_grupos findGrupos_grupo(String grupos_grupo);
	List<Maestros_has_grupos> findAll();

}


package com.example.ISWProyecto.service;

import java.util.List;


import com.example.ISWProyecto.model.Maestros;

public interface IMaestrosService {
	Maestros findMaestro(String rfc, String contrasena);
	Maestros findMaestroById(String rfc);
	List<Maestros> findAll();
}

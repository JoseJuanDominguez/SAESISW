package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Deportes;

public interface IDeportesService {
	
	Deportes findDeportes(int iddeporte, String nombre);
	
	List<Deportes> findAll();
}


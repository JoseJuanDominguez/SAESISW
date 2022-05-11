package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Deportes;

public interface IDeportesService {
	
	Deportes findDeportes(int iddeporte);	
	List<Deportes> findAll();
}


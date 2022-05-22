package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.KardexAlumno;

public interface IKardexAlumnoService {
	List<KardexAlumno> findKardex(String boleta);
	List<KardexAlumno> findAll();
}

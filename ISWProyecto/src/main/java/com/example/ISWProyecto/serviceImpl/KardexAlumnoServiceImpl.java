package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.KardexAlumno;
import com.example.ISWProyecto.repository.KardexAlumnoRepository;
import com.example.ISWProyecto.service.IKardexAlumnoService;

@Service("KardexAlumnoService")
public class KardexAlumnoServiceImpl implements IKardexAlumnoService {
	@Autowired
	private KardexAlumnoRepository kardexAlumnoRepository;

	@Override
	public List<KardexAlumno> findKardex(String boleta) {
		return kardexAlumnoRepository.findKardex(boleta);
	}

	@Override
	public List<KardexAlumno> findAll() {
		return kardexAlumnoRepository.findAll();
	}
}

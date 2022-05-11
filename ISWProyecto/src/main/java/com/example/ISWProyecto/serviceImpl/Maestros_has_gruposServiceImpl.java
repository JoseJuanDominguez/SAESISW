package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Maestros_has_grupos;
import com.example.ISWProyecto.repository.Maestros_has_gruposRepository;
import com.example.ISWProyecto.service.IMaestros_has_gruposService;
@Service("Maestros_has_gruposService")
public class Maestros_has_gruposServiceImpl implements IMaestros_has_gruposService{
	
	@Autowired
	private Maestros_has_gruposRepository maestros_has_gruposRepository;

	@Override
	public Maestros_has_grupos findMaestros_has_grupos(String maestros_rfc, String grupos_grupo) {
		return maestros_has_gruposRepository.findMaestros_has_grupos(maestros_rfc, grupos_grupo);
	}
	@Override
	public Maestros_has_grupos findMaestros_rfc(String maestros_rfc) {
		return maestros_has_gruposRepository.findMaestros_rfc(maestros_rfc);
	}

	@Override
	public Maestros_has_grupos findGrupos_grupo(String grupos_grupo) {
		return maestros_has_gruposRepository.findGrupos_grupo(grupos_grupo);
	}
	@Override
	public List<Maestros_has_grupos> findAll() {
		return maestros_has_gruposRepository.findAll();
	}

}


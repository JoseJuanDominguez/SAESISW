package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Maestros;
import com.example.ISWProyecto.repository.MaestrosRepository;
import com.example.ISWProyecto.service.IMaestrosService;

@Service("MaestrosService")
public class MaestrosServiceImpl implements IMaestrosService {

	@Autowired
	private MaestrosRepository maestrosRepository;
	
	@Override
	public Maestros findMaestro(String rfc, String contrasena) {
		// TODO Auto-generated method stub
		return maestrosRepository.findMaestro(rfc, contrasena);
	}
	@Override
	public Maestros findMaestroById(String rfc) {
		// TODO Auto-generated method stub
		return maestrosRepository.findMaestroById(rfc);
	}
	@Override
	public List<Maestros> findAll() {
		// TODO Auto-generated method stub
		return maestrosRepository.findAll();
	}

}

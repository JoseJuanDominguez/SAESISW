package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Deportes;
import com.example.ISWProyecto.repository.DeportesRepository;
import com.example.ISWProyecto.service.IDeportesService;

@Service("DeportesService")
public class DeportesServiceImpl implements IDeportesService{
	
	@Autowired
	private DeportesRepository deportesRepository;

	@Override
	public Deportes findDeportes(int iddeporte) {
		return deportesRepository.findDeportes(iddeporte);
	}

	@Override
	public List<Deportes> findAll() {
		return deportesRepository.findAll();
	}
}


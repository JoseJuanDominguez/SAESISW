package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.U_Gestion_Esc;
import com.example.ISWProyecto.repository.U_Gestion_EscRepository;
import com.example.ISWProyecto.service.IU_Gestion_EscService;

@Service("U_Gestion_EscService")
public class U_Gestion_EscServiceImpl implements IU_Gestion_EscService{

	@Autowired
	private U_Gestion_EscRepository u_gestion_escRepository;
	@Override
	public U_Gestion_Esc findU_Gestion_Esc(String rfc, String contrasena) {
		// TODO Auto-generated method stub
		return u_gestion_escRepository.findU_Gestion_Esc(rfc, contrasena);
	}
	public U_Gestion_Esc findU_Gestion_EscById(String rfc) {
		// TODO Auto-generated method stub
		return u_gestion_escRepository.findU_Gestion_EscById(rfc);
	}

	@Override
	public List<U_Gestion_Esc> findAll() {
		// TODO Auto-generated method stub
		return u_gestion_escRepository.findAll();
	}
}

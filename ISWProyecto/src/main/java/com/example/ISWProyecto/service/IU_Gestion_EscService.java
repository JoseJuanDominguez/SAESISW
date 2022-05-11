package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.U_Gestion_Esc;

public interface IU_Gestion_EscService {
	U_Gestion_Esc findU_Gestion_Esc(String rfc, String contrasena);
	U_Gestion_Esc findU_Gestion_EscById(String rfc);
	List<U_Gestion_Esc> findAll();
}

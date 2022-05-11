package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.Alumnos_has_deportes;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alumnos_has_deportesDto {
	
	@JsonProperty("alumnos_boleta")
	private String alumnos_boleta; 
	
	@JsonProperty("deportes_iddeporte")
	private int deportes_iddeporte;
	
	public static Alumnos_has_deportesDto getInstance(Alumnos_has_deportes alumnos_has_deportes) {
		Alumnos_has_deportesDto alumnos_has_deportesDto = new Alumnos_has_deportesDto();
		if(alumnos_has_deportes!=null) {
			alumnos_has_deportesDto.setAlumnos_boleta(alumnos_has_deportes.getAlumnos_boleta());
			alumnos_has_deportesDto.setDeportes_iddeporte(alumnos_has_deportes.getDeportes_iddeporte());
		}
		return alumnos_has_deportesDto;
		
	}
	
	public static List<Alumnos_has_deportesDto> getInstance(List<Alumnos_has_deportes> alumnos_has_deportes) {
		List<Alumnos_has_deportesDto> alumnos_has_deportesDto = new ArrayList<Alumnos_has_deportesDto>();
		for( Alumnos_has_deportes al: alumnos_has_deportes) {
			alumnos_has_deportesDto.add(Alumnos_has_deportesDto.getInstance(al));
		}
		return alumnos_has_deportesDto;
		
	}

	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}

	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}

	public int getDeportes_iddeporte() {
		return deportes_iddeporte;
	}

	public void setDeportes_iddeporte(int deportes_iddeporte) {
		this.deportes_iddeporte = deportes_iddeporte;
	}

}


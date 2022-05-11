package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Deportes;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DeportesDto {
	
	@JsonProperty("iddeporte")
	private int iddeporte; 
	
	@JsonProperty("nombre")
	private String nombre;
	
	public static DeportesDto getInstance(Deportes deportes) {
		DeportesDto deportesDto = new DeportesDto();
		if(deportes!=null) {
			deportesDto.setIddeporte(deportes.getIddeporte());
			deportesDto.setNombre(deportes.getNombre());
		}
		return deportesDto;
	}
	
	public static List<DeportesDto> getInstance(List<Deportes> deportes) {
		List<DeportesDto> deportesDto = new ArrayList<DeportesDto>();
		for( Deportes al: deportes) {
			deportesDto.add(DeportesDto.getInstance(al));
		}
		return deportesDto;
	}

	public int getIddeporte() {
		return iddeporte;
	}

	public void setIddeporte(int iddeporte) {
		this.iddeporte = iddeporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}


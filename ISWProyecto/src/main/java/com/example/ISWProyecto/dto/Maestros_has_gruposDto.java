package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.ISWProyecto.model.Maestros_has_grupos;

public class Maestros_has_gruposDto {
	
	@JsonProperty("maestros_rfc")
	private String maestros_rfc; 
	
	@JsonProperty("grupos_grupo")
	private String grupos_grupo;
	
	public static Maestros_has_gruposDto getInstance(Maestros_has_grupos maestros_has_grupos) {
		Maestros_has_gruposDto maestros_has_gruposDto = new Maestros_has_gruposDto();
		if(maestros_has_grupos!=null) {
			maestros_has_gruposDto.setMaestros_rfc(maestros_has_grupos.getMaestros_rfc());
			maestros_has_gruposDto.setGrupos_grupo(maestros_has_grupos.getGrupos_grupo());
		}
		return maestros_has_gruposDto;
		
	}
	
	public static List<Maestros_has_gruposDto> getInstance(List<Maestros_has_grupos> maestros_has_grupos) {
		List<Maestros_has_gruposDto> maestros_has_gruposDto = new ArrayList<Maestros_has_gruposDto>();
		for( Maestros_has_grupos al: maestros_has_grupos) {
			maestros_has_gruposDto.add(Maestros_has_gruposDto.getInstance(al));
		}
		return maestros_has_gruposDto;
		
	}

	public String getMaestros_rfc() {
		return maestros_rfc;
	}

	public void setMaestros_rfc(String maestros_rfc) {
		this.maestros_rfc = maestros_rfc;
	}

	public String getGrupos_grupo() {
		return grupos_grupo;
	}

	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}
	
	

}


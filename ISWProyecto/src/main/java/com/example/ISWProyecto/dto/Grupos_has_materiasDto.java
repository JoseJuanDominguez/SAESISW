package com.example.ISWProyecto.dto;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.Grupos_has_materias;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Grupos_has_materiasDto {
	
	@JsonProperty("grupos_grupo")
	private String grupos_grupo; 
	
	@JsonProperty("materias_idmateria")
	private String materias_idmateria;
	
	public static Grupos_has_materiasDto getInstance(Grupos_has_materias grupos_has_materias) {
		Grupos_has_materiasDto grupos_has_materiasDto = new Grupos_has_materiasDto();
		if(grupos_has_materias!=null) {
			grupos_has_materiasDto.setGrupos_grupo(grupos_has_materias.getGrupos_grupo());
			grupos_has_materiasDto.setMaterias_idmateria(grupos_has_materias.getMaterias_idmateria());
		}
		return grupos_has_materiasDto;
		
	}
	
	public static List<Grupos_has_materiasDto> getInstance(List<Grupos_has_materias> grupos_has_materias) {
		List<Grupos_has_materiasDto> grupos_has_materiasDto = new ArrayList<Grupos_has_materiasDto>();
		for( Grupos_has_materias al: grupos_has_materias) {
			grupos_has_materiasDto.add(Grupos_has_materiasDto.getInstance(al));
		}
		return grupos_has_materiasDto;
	}

	public String getGrupos_grupo() {
		return grupos_grupo;
	}

	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}

	public String getMaterias_idmateria() {
		return materias_idmateria;
	}

	public void setMaterias_idmateria(String materias_idmateria) {
		this.materias_idmateria = materias_idmateria;
	}

}


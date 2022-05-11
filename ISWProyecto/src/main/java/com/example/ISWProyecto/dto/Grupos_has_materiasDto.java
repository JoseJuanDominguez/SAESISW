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
	
	@JsonProperty("dia")
	private String dia;
	
	@JsonProperty("hora_inicio")
	private String hora_inicio;
	
	@JsonProperty("hora_fin")
	private String hora_fin;
	
	@JsonProperty("salon")
	private String salon;
	
	public static Grupos_has_materiasDto getInstance(Grupos_has_materias grupos_has_materias) {
		Grupos_has_materiasDto grupos_has_materiasDto = new Grupos_has_materiasDto();
		if(grupos_has_materias!=null) {
			grupos_has_materiasDto.setGrupos_grupo(grupos_has_materias.getGrupos_grupo());
			grupos_has_materiasDto.setMaterias_idmateria(grupos_has_materias.getMaterias_idmateria());
			grupos_has_materiasDto.setDia(grupos_has_materias.getDia());
			grupos_has_materiasDto.setHora_inicio(grupos_has_materias.getHora_inicio());
			grupos_has_materiasDto.setHora_fin(grupos_has_materias.getHora_fin());
			grupos_has_materiasDto.setSalon(grupos_has_materias.getSalon());
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
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
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


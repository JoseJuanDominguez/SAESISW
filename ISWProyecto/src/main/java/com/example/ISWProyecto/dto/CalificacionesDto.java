package com.example.ISWProyecto.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.Calificaciones;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CalificacionesDto {
	
	@JsonProperty("grupos_grupo")
	private String grupos_grupo;
	@JsonProperty("primerdep")
	private Float primerdep; 
	@JsonProperty("segundodep")
	private Float segundodep; 
	@JsonProperty("tercerdep")
	private Float tercerdep; 
	@JsonProperty("extra")
	private Float extra; 
	@JsonProperty("nombre_m")
	private String nombre_m;

	public static CalificacionesDto getInstance(Calificaciones calificaciones) {
		CalificacionesDto calificacionesDto = new CalificacionesDto();
		if(calificaciones!=null) {
			calificacionesDto.setGrupos_grupo(calificaciones.getGrupos_grupo());
			calificacionesDto.setPrimerdep(calificaciones.getPrimerdep());
			calificacionesDto.setSegundodep(calificaciones.getSegundodep());
			calificacionesDto.setTercerdep(calificaciones.getTercerdep());
			calificacionesDto.setExtra(calificaciones.getExtra());
			calificacionesDto.setNombre_m(calificaciones.getNombre_m());
		}
		return calificacionesDto;

	}
	public static List<CalificacionesDto> getInstance(List<Calificaciones> calificaciones) {
		List<CalificacionesDto> calificacionesDto = new ArrayList<CalificacionesDto>();
		for( Calificaciones al: calificaciones) {
			calificacionesDto.add(CalificacionesDto.getInstance(al));
		}
		return calificacionesDto;
	}
	public String getGrupos_grupo() {
		return grupos_grupo;
	}
	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}
	public Float getPrimerdep() {
		return primerdep;
	}
	public void setPrimerdep(Float primerdep) {
		this.primerdep = primerdep;
	}
	public Float getSegundodep() {
		return segundodep;
	}
	public void setSegundodep(Float segundodep) {
		this.segundodep = segundodep;
	}
	public Float getTercerdep() {
		return tercerdep;
	}
	public void setTercerdep(Float tercerdep) {
		this.tercerdep = tercerdep;
	}
	public Float getExtra() {
		return extra;
	}
	public void setExtra(Float extra) {
		this.extra = extra;
	}
	public String getNombre_m() {
		return nombre_m;
	}
	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
	}


}
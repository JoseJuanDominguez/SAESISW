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

	@JsonProperty("primerdep")
	private float primerdep;

	@JsonProperty("segundodep")
	private float segundodep;

	@JsonProperty("tercerdep")
	private float tercerdep;

	@JsonProperty("kardex")
	private int kardex;

	@JsonProperty("fecha")
	private Date fecha;

	@JsonProperty("ets")
	private Float ets;

	@JsonProperty("extra")
	private Float extra;

	@JsonProperty("materias_idmateria")
	private String materias_idmateria;
	
	@JsonProperty("alumnos_boleta")
	private String alumnos_boleta;

	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}

	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}

	public static CalificacionesDto getInstance(Calificaciones calificaciones) {
		CalificacionesDto calificacionesDto = new CalificacionesDto();
		if(calificaciones!=null) {
			calificacionesDto.setPrimerdep(calificaciones.getPrimerdep());
			calificacionesDto.setSegundodep(calificaciones.getSegundodep());
			calificacionesDto.setTercerdep(calificaciones.getTercerdep());
			calificacionesDto.setKardex(calificaciones.getKardex());
			calificacionesDto.setFecha(calificaciones.getFecha());
			calificacionesDto.setEts(calificaciones.getEts());
			calificacionesDto.setExtra(calificaciones.getExtra());
			calificacionesDto.setMaterias_idmateria(calificaciones.getMaterias_idmateria());
			calificacionesDto.setAlumnos_boleta(calificaciones.getAlumnos_boleta());
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

	public float getPrimerdep() {
		return primerdep;
	}

	public void setPrimerdep(float primerdep) {
		this.primerdep = primerdep;
	}

	public float getSegundodep() {
		return segundodep;
	}

	public void setSegundodep(float segundodep) {
		this.segundodep = segundodep;
	}

	public float getTercerdep() {
		return tercerdep;
	}

	public void setTercerdep(float tercerdep) {
		this.tercerdep = tercerdep;
	}

	public int getKardex() {
		return kardex;
	}

	public void setKardex(int kardex) {
		this.kardex = kardex;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getEts() {
		return ets;
	}

	public void setEts(Float ets) {
		this.ets = ets;
	}

	public Float getExtra() {
		return extra;
	}

	public void setExtra(Float extra) {
		this.extra = extra;
	}

	public String getMaterias_idmateria() {
		return materias_idmateria;
	}

	public void setMaterias_idmateria(String materias_idmateria) {
		this.materias_idmateria = materias_idmateria;
	}


}

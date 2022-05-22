package com.example.ISWProyecto.dto;


import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.KardexAlumno;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KardexAlumnoDto {
	
	@JsonProperty("materias_idmateria")
	private String materias_idmateria;
	@JsonProperty("nombre_m")
	private String nombre_m; 
	@JsonProperty("fecha")
	private String fecha; 
	@JsonProperty("primerdep")
	private Float primerdep; 
	@JsonProperty("segundodep")
	private Float segundodep; 
	@JsonProperty("tercerdep")
	private Float tercerdep; 
	
	public static KardexAlumnoDto getInstance(KardexAlumno kardexAlumno) {
		KardexAlumnoDto kardexAlumnoDto = new KardexAlumnoDto();
		if(kardexAlumno!=null) {
			kardexAlumnoDto.setMaterias_idmateria(kardexAlumno.getMaterias_idmateria());
			kardexAlumnoDto.setNombre_m(kardexAlumno.getNombre_m());
			kardexAlumnoDto.setFecha(kardexAlumno.getFecha());
			kardexAlumnoDto.setPrimerdep(kardexAlumno.getPrimerdep());
			kardexAlumnoDto.setSegundodep(kardexAlumno.getSegundodep());
			kardexAlumnoDto.setTercerdep(kardexAlumno.getTercerdep());
		}
		
		return kardexAlumnoDto;
	}
	public static List<KardexAlumnoDto> getInstance(List<KardexAlumno> kardexAlumno) {
		List<KardexAlumnoDto> kardexAlumnoDto = new ArrayList<KardexAlumnoDto>();
		for( KardexAlumno kardex: kardexAlumno) {
			kardexAlumnoDto.add(KardexAlumnoDto.getInstance(kardex));
		}
		return kardexAlumnoDto;
		
	}
	public String getMaterias_idmateria() {
		return materias_idmateria;
	}
	public void setMaterias_idmateria(String materias_idmateria) {
		this.materias_idmateria = materias_idmateria;
	}
	public String getNombre_m() {
		return nombre_m;
	}
	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
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

}

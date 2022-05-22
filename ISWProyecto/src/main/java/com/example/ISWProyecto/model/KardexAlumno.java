package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class KardexAlumno {
	
	
	@Id
	private String materias_idmateria;
	private Float primerdep; 
	private Float segundodep; 
	private Float tercerdep; 
	private String fecha; 
	private String nombre_m; 
	
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

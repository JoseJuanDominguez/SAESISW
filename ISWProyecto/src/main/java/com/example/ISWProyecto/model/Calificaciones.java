package com.example.ISWProyecto.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Entity

public class Calificaciones {

	@Id
	private String grupos_grupo;
	private Float primerdep; 
	private Float segundodep; 
	private Float tercerdep; 
	private Float extra; 
	private String nombre_m;
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

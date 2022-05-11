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

@Entity
@Table(name="CALIFICACIONES")
@NamedQuery(name="Calificaciones.findAll", query="SELECT a FROM Calificaciones a")
public class Calificaciones {

	
	private float primerdep;

	private float segundodep;

	private float tercerdep;

	private int kardex;

	private Date fecha;

	private float ets;

	private float extra;
	@Id
	private String materias_idmateria;

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

	public float getEts() {
		return ets;
	}

	public void setEts(float ets) {
		this.ets = ets;
	}

	public float getExtra() {
		return extra;
	}

	public void setExtra(float extra) {
		this.extra = extra;
	}

	public String getMaterias_idmateria() {
		return materias_idmateria;
	}

	public void setMaterias_idmateria(String materias_idmateria) {
		this.materias_idmateria = materias_idmateria;
	}



}

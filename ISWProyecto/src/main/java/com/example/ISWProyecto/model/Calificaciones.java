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

	private Float ets;

	private Float extra;
	@Id
	private String materias_idmateria;
	private String alumnos_boleta;
	
	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}
	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
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

package com.example.ISWProyecto.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNOS_HAS_GRUPOS")
@NamedQuery(name="Alumnos_has_grupos.findAll", query="SELECT a FROM Alumnos_has_grupos a")
public class Alumnos_has_grupos {
	
	
	private String alumnos_boleta;
	@Id
    private String grupos_grupo;

	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}
	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}
	public String getGrupos_grupo() {
		return grupos_grupo;
	}
	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}


	
}

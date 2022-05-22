package com.example.ISWProyecto.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="GRUPOS_HAS_MATERIAS")
@NamedQuery(name="Grupos_has_materias.findAll", query="SELECT a FROM Grupos_has_materias a")
public class Grupos_has_materias {
	
	
	private String grupos_grupo;
	
	private String materias_idmateria;
	@Id
	private String dia;
	
	private String hora_inicio;
	
	private String hora_fin;
	
	private String salon;
	
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
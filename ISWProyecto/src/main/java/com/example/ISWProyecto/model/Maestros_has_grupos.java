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
@Table(name="MAESTROS_HAS_GRUPOS")
@NamedQuery(name="Maestros_has_grupos.findAll", query="SELECT a FROM Maestros_has_grupos a")
public class Maestros_has_grupos {
	
	@Id
	private String maestros_rfc;
	
	private String grupos_grupo;

	public String getMaestros_rfc() {
		return maestros_rfc;
	}

	public void setMaestros_rfc(String maestros_rfc) {
		this.maestros_rfc = maestros_rfc;
	}

	public String getGrupos_grupo() {
		return grupos_grupo;
	}

	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}

}


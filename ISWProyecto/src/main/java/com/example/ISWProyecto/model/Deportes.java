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
@Table(name="DEPORTES")
@NamedQuery(name="Deportes.findAll", query="SELECT a FROM Deportes a")
public class Deportes {
	
	@Id
	private int iddeporte;
	
	private String nombre;

	public int getIddeporte() {
		return iddeporte;
	}

	public void setIddeporte(int iddeporte) {
		this.iddeporte = iddeporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}


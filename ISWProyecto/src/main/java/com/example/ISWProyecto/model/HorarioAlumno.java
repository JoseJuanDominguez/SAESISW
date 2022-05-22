package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HorarioAlumno {
	
	//private String boleta;
	
    private String grupos_grupo;
	private String nombre; 
	private String paterno; 
	private String materno; 
	
	private String idmateria;
	private String nombre_m; 
	@Id
	private String dia;
	private String hora_inicio;
	private String hora_fin;
	private String salon;
	
	/*public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getGrupos_grupo() {
		return grupos_grupo;
	}

	public void setGrupos_grupo(String grupos_grupo) {
		this.grupos_grupo = grupos_grupo;
	}

	public String getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(String idmateria) {
		this.idmateria = idmateria;
	}

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
	public String getNombre_m() {
		return nombre_m;
	}

	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
	}

	

}

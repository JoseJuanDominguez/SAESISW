package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.HorarioAlumno;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HorarioAlumnoDto {
	/*@JsonProperty("boleta")
	private String boleta; */
	@JsonProperty("grupos_grupo")
    private String grupos_grupo;
	@JsonProperty("nombre")
	private String nombre; 
	@JsonProperty("paterno")
	private String paterno; 
	@JsonProperty("materno")
	private String materno; 
	@JsonProperty("idmateria")
	private String idmateria;
	@JsonProperty("nombre_m")
	private String nombre_m;
	@JsonProperty("dia")
	private String dia;
	@JsonProperty("hora_inicio")
	private String hora_inicio;
	@JsonProperty("hora_fin")
	private String hora_fin;
	@JsonProperty("salon")
	private String salon;


	public static HorarioAlumnoDto getInstance(HorarioAlumno horarioAlumno) {
		HorarioAlumnoDto horarioAlumnoDto = new HorarioAlumnoDto();
		if(horarioAlumno!=null) {
			//horarioAlumnoDto.setBoleta(horarioAlumno.getBoleta());
			horarioAlumnoDto.setDia(horarioAlumno.getDia());
			horarioAlumnoDto.setGrupos_grupo(horarioAlumno.getGrupos_grupo());
			horarioAlumnoDto.setHora_fin(horarioAlumno.getHora_fin());
			horarioAlumnoDto.setHora_inicio(horarioAlumno.getHora_inicio());
			horarioAlumnoDto.setIdmateria(horarioAlumno.getIdmateria());
			horarioAlumnoDto.setMaterno(horarioAlumno.getMaterno());
			horarioAlumnoDto.setNombre(horarioAlumno.getNombre());
			horarioAlumnoDto.setPaterno(horarioAlumno.getPaterno());
			horarioAlumnoDto.setSalon(horarioAlumno.getSalon());
			horarioAlumnoDto.setNombre_m(horarioAlumno.getNombre_m());
		}
		
		return horarioAlumnoDto;
	}
	
	
	
	public static List<HorarioAlumnoDto> getInstance(List<HorarioAlumno> horarioAlumno) {
		List<HorarioAlumnoDto> horarioAlumnoDto = new ArrayList<HorarioAlumnoDto>();
		for( HorarioAlumno horario: horarioAlumno) {
			horarioAlumnoDto.add(HorarioAlumnoDto.getInstance(horario));
		}
		return horarioAlumnoDto;
		
	}
	public String getNombre_m() {
	return nombre_m;
	}

	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
	}


	/*
	public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}
*/
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
	

}

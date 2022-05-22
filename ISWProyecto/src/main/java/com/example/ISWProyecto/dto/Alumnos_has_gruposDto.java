package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.model.Grupos;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alumnos_has_gruposDto {

	@JsonProperty("alumnos_boleta")
	private String alumnos_boleta;
	@JsonProperty("grupos_grupo")
	private String grupos_grupo;

	public static Alumnos_has_gruposDto getInstance(Alumnos_has_grupos alumnos_has_grup) {
		Alumnos_has_gruposDto alumnos_has_gruposdto = new Alumnos_has_gruposDto();
		if(alumnos_has_grup!=null) {
			alumnos_has_gruposdto.setAlumnos_boleta(alumnos_has_grup.getAlumnos_boleta());
			alumnos_has_gruposdto.setGrupos_grupo(alumnos_has_grup.getGrupos_grupo());

			
		}
		return alumnos_has_gruposdto;
		
	}

	public static List<Alumnos_has_gruposDto> getInstance(List<Alumnos_has_grupos> alumnos_has_grup) {
		List<Alumnos_has_gruposDto> alumnos_has_gruposdto = new ArrayList<Alumnos_has_gruposDto>();
		for( Alumnos_has_grupos alg: alumnos_has_grup) {
			alumnos_has_gruposdto.add(Alumnos_has_gruposDto.getInstance(alg));
		}
		return alumnos_has_gruposdto;
		
	}

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

package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.Alumno;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlumnoDto {
	
	@JsonProperty("boleta")
	private String boleta; 
	
	@JsonProperty("nombre")
	private String nombre;
	
	@JsonProperty("paterno")
	private String paterno;
	
	@JsonProperty("materno")
	private String materno;
	
	@JsonProperty("foto")
	private byte[] foto;
	
	@JsonProperty("rfc")
	private String rfc;
	
	@JsonProperty("curp")
	private String curp;
	
	@JsonProperty("nacionalidad")
	private String nacionalidad;
	
	@JsonProperty("cartilla")
	private String cartilla;
	
	@JsonProperty("pasaporte")
	private String pasaporte;
	
	@JsonProperty("contrasena")
	private String contrasena;
	
	@JsonProperty("direcciones_iddireccion")
	private int direcciones_iddireccion;
	
	@JsonProperty("datosmedicos_num_seg_social")
	private int datosmedicos_num_seg_social;
	


	public static AlumnoDto getInstance(Alumno alumno) {
		AlumnoDto alumnoDto = new AlumnoDto();
		if(alumno!=null) {
			alumnoDto.setBoleta(alumno.getBoleta());
			alumnoDto.setCartilla(alumno.getCartilla());
			alumnoDto.setCurp(alumno.getCurp());
			alumnoDto.setDatosmedicos_num_seg_social(alumno.getDatosmedicos_num_seg_social());
			alumnoDto.setDirecciones_iddireccion(alumno.getDirecciones_iddireccion());
			alumnoDto.setFoto(alumno.getFoto());
			alumnoDto.setMaterno(alumno.getMaterno());
			alumnoDto.setNacionalidad(alumno.getNacionalidad());
			alumnoDto.setNombre(alumno.getNombre());
			alumnoDto.setPasaporte(alumno.getPasaporte());
			alumnoDto.setPaterno(alumno.getPaterno());
			alumnoDto.setRfc(alumno.getRfc());
		}
		return alumnoDto;
		
	}
		
	public static List<AlumnoDto> getInstance(List<Alumno> alumnos) {
		List<AlumnoDto> alumnosDto = new ArrayList<AlumnoDto>();
		for( Alumno al: alumnos) {
			alumnosDto.add(AlumnoDto.getInstance(al));
		}
		return alumnosDto;
		
	}

	public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}

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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCartilla() {
		return cartilla;
	}

	public void setCartilla(String cartilla) {
		this.cartilla = cartilla;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getDirecciones_iddireccion() {
		return direcciones_iddireccion;
	}

	public void setDirecciones_iddireccion(int direcciones_iddireccion) {
		this.direcciones_iddireccion = direcciones_iddireccion;
	}

	public int getDatosmedicos_num_seg_social() {
		return datosmedicos_num_seg_social;
	}

	public void setDatosmedicos_num_seg_social(int datosmedicos_num_seg_social) {
		this.datosmedicos_num_seg_social = datosmedicos_num_seg_social;
	}
	
}

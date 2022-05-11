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
@Table(name="ALUMNOS")
@NamedQuery(name="Alumno.findAll", query="SELECT a FROM Alumno a")
public class Alumno {

	@Id
	private String boleta; 
	
	private String nombre; 
	
	private String paterno; 
	
	private String materno; 
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name="foto")
	private byte[] foto;
	
	private String rfc; 
	
	private String curp; 
	
	private String nacionalidad;
	
	private String cartilla; 
	
	private String pasaporte;
	
	private String contrasena;
	
	private int direcciones_iddireccion;
	
	private int datosmedicos_num_seg_social;

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

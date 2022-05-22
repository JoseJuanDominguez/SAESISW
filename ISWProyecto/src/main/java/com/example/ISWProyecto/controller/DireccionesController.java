package com.example.ISWProyecto.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.DireccionesDto;
import com.example.ISWProyecto.model.Direcciones;
import com.example.ISWProyecto.serviceImpl.DireccionesServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Direcciones")
public class DireccionesController {
	
	@Autowired 
	private DireccionesServiceImpl direccionesService;
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<DireccionesDto>> findAll(){
		List<Direcciones> direcciones = direccionesService.findAll();
		if(direcciones.isEmpty()) {
			return new ResponseEntity<List<DireccionesDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<DireccionesDto> direccionesDto = DireccionesDto.getInstance(direcciones);
		return new ResponseEntity<List<DireccionesDto>>(direccionesDto, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/findDireccion/{iddireccion}", method= RequestMethod.GET)
	public ResponseEntity<DireccionesDto> findDatos(@PathVariable("iddireccion") Long iddireccion){
		Direcciones direcciones = direccionesService.findDireccion(iddireccion);
		if(direcciones == null) {
			return new ResponseEntity<DireccionesDto>(DireccionesDto.getInstance(direcciones), HttpStatus.NO_CONTENT);
		}
		
		DireccionesDto direccionDto = DireccionesDto.getInstance(direcciones);
		return new ResponseEntity<DireccionesDto>(direccionDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/actualizarDireccion", method= RequestMethod.POST)
	public ResponseEntity<DireccionesDto> actualizarDireccion(@RequestBody DireccionesDto dirDto){
		
		Direcciones dir = new Direcciones();
		
		
		
		dir.setAlcaldia(dirDto.getAlcaldia());
		dir.setCalle(dirDto.getCalle());
		dir.setCorreo(dirDto.getCorreo());
		dir.setCp(dirDto.getCp()); 
		dir.setEstado(dirDto.getEstado());
		dir.setExt(dirDto.getExt());
		dir.setNumext(dirDto.getNumext());
		dir.setNumint(dirDto.getNumint());
		dir.setTelcasa(dirDto.getTelcasa());
		dir.setTelmovil(dirDto.getTelmovil());
		dir.setTeltrabajo(dirDto.getTeltrabajo());
		
		Direcciones dirSaved = direccionesService.actualizarDireccion(dir);
		
		if(dirSaved==null) {
			return new ResponseEntity<DireccionesDto>(HttpStatus.NOT_FOUND);
		}
		
		 return new ResponseEntity<DireccionesDto>(DireccionesDto.getInstance(dirSaved), HttpStatus.OK);
	}
	
	@RequestMapping(value="/agregarDireccion", method= RequestMethod.POST)
	public ResponseEntity<DireccionesDto> agregarDireccion(@RequestBody DireccionesDto dirDto){
		
		Direcciones dir = new Direcciones();
		
		dir.setIddireccion(dirDto.getIddireccion());
		dir.setAlcaldia(dirDto.getAlcaldia());
		dir.setCalle(dirDto.getCalle());
		dir.setCorreo(dirDto.getCorreo());
		dir.setCp(dirDto.getCp()); 
		dir.setEstado(dirDto.getEstado());
		dir.setExt(dirDto.getExt());
		dir.setNumext(dirDto.getNumext());
		dir.setNumint(dirDto.getNumint());
		dir.setTelcasa(dirDto.getTelcasa());
		dir.setTelmovil(dirDto.getTelmovil());
		dir.setTeltrabajo(dirDto.getTeltrabajo());
		
		Direcciones dirSaved = direccionesService.actualizarDireccion(dir);
		
		if(dirSaved==null) {
			return new ResponseEntity<DireccionesDto>(HttpStatus.NOT_FOUND);
		}
		
		 return new ResponseEntity<DireccionesDto>(DireccionesDto.getInstance(dirSaved), HttpStatus.OK);
	}
	
	

}

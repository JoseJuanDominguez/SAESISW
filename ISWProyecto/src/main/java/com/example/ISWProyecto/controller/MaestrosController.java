package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.MaestrosDto;
import com.example.ISWProyecto.model.Maestros;
import com.example.ISWProyecto.serviceImpl.MaestrosServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Maestros")
public class MaestrosController {
	@Autowired 
	private MaestrosServiceImpl maestroService;
	
	@RequestMapping(value="/findMaestro/{rfc}/{contrasena}", method= RequestMethod.GET)
	public ResponseEntity<MaestrosDto> findMaestro(@PathVariable("rfc") String rfc, @PathVariable("contrasena") String contrasena){
		Maestros maestro = maestroService.findMaestro(rfc, contrasena);
		if(maestro == null) {
			return new ResponseEntity<MaestrosDto>(MaestrosDto.getInstance(maestro), HttpStatus.NO_CONTENT); 
		}
		
		MaestrosDto maestroDto = MaestrosDto.getInstance(maestro);
		return new ResponseEntity<MaestrosDto>(maestroDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findMaestroById/{rfc}", method= RequestMethod.GET)
	public ResponseEntity<MaestrosDto> findMaestroById(@PathVariable("rfc") String rfc){
		Maestros maestro = maestroService.findMaestroById(rfc);
		if(maestro == null) {
			return new ResponseEntity<MaestrosDto>(MaestrosDto.getInstance(maestro), HttpStatus.NO_CONTENT); 
		}
		
		MaestrosDto maestroDto = MaestrosDto.getInstance(maestro);
		return new ResponseEntity<MaestrosDto>(maestroDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<MaestrosDto>> findAll(){
		List<Maestros> maestros = maestroService.findAll();
		if(maestros.isEmpty()) {
			return new ResponseEntity<List<MaestrosDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<MaestrosDto> maestroDto = MaestrosDto.getInstance(maestros);
		return new ResponseEntity<List<MaestrosDto>>(maestroDto, HttpStatus.OK);
		
	}
}

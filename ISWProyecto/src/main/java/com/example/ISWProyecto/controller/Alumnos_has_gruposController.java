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

import com.example.ISWProyecto.dto.Alumnos_has_gruposDto;
import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.serviceImpl.Alumnos_has_gruposServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Alumnos_has_grupos")
public class Alumnos_has_gruposController {
	
	@Autowired
	Alumnos_has_gruposServiceImpl alumnoshgService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_gruposDto>> findAll(){
		List<Alumnos_has_grupos> alumnoshg = alumnoshgService.findAll();
		if(alumnoshg.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_gruposDto>>(HttpStatus.NOT_FOUND);
		}
		List<Alumnos_has_gruposDto> alumnos_has_gruposdto = Alumnos_has_gruposDto.getInstance(alumnoshg);
		return new ResponseEntity<List<Alumnos_has_gruposDto>>(alumnos_has_gruposdto, HttpStatus.OK);
	}
	@RequestMapping(value="/findAlumnoHGById/{alumnos_boleta}/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<Alumnos_has_gruposDto> findAlumnoHGById(@PathVariable("alumnos_boleta") String alumnos_boleta, @PathVariable("grupos_grupo") String grupos_grupo){
		Alumnos_has_grupos alumnoshg = alumnoshgService.findAlumnoHGById(alumnos_boleta, grupos_grupo);
		if(alumnoshg == null) {
			return new ResponseEntity<Alumnos_has_gruposDto>(Alumnos_has_gruposDto.getInstance(alumnoshg), HttpStatus.NO_CONTENT);
		}
		
		Alumnos_has_gruposDto alumnos_has_gruposdto = Alumnos_has_gruposDto.getInstance(alumnoshg);
		return new ResponseEntity<Alumnos_has_gruposDto>(alumnos_has_gruposdto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findAlumnoHGByGrupo/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_gruposDto>> findAlumnoHGByGrupo(@PathVariable("grupos_grupo") String grupos_grupo){
		List<Alumnos_has_grupos> alumnoshg = alumnoshgService.findAlumnoHGByGrupo(grupos_grupo);
		if(alumnoshg.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_gruposDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<Alumnos_has_gruposDto> alumnos_has_gruposdto = Alumnos_has_gruposDto.getInstance(alumnoshg);
		return new ResponseEntity<List<Alumnos_has_gruposDto>>(alumnos_has_gruposdto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findAlumnoHGByBoleta/{alumnos_boleta}", method= RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_gruposDto>> findAlumnoHGByBoleta(@PathVariable("alumnos_boleta") String alumnos_boleta){
		List<Alumnos_has_grupos> alumnoshg = alumnoshgService.findAlumnoHGByBoleta(alumnos_boleta);
		if(alumnoshg.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_gruposDto>>(HttpStatus.NOT_FOUND);		
		}
		List<Alumnos_has_gruposDto> alumnos_has_gruposdto = Alumnos_has_gruposDto.getInstance(alumnoshg);
		return new ResponseEntity<List<Alumnos_has_gruposDto>>(alumnos_has_gruposdto, HttpStatus.OK);
		
	}
	
}

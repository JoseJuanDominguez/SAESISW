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

import com.example.ISWProyecto.dto.Alumnos_has_deportesDto;
import com.example.ISWProyecto.model.Alumnos_has_deportes;
import com.example.ISWProyecto.serviceImpl.Alumnos_has_deportesServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Alumnos_has_deportes")
public class Alumnos_has_deportesController {
	
	@Autowired 
	private Alumnos_has_deportesServiceImpl alumnos_has_deportesService;
	
	@RequestMapping(value="/findAlumnos_has_deportes/{alumnos_boleta}/{deportes_iddeporte}", method= RequestMethod.GET)
	public ResponseEntity<Alumnos_has_deportesDto> findAlumnos_has_deportes(@PathVariable("alumnos_boleta") String alumnos_boleta, @PathVariable("deportes_iddeporte") int deportes_iddeporte){
		Alumnos_has_deportes alumnos_has_deportes = alumnos_has_deportesService.findAlumnos_has_deportes(alumnos_boleta, deportes_iddeporte);
		if(alumnos_has_deportes == null) {
			return new ResponseEntity<Alumnos_has_deportesDto>(Alumnos_has_deportesDto.getInstance(alumnos_has_deportes), HttpStatus.NO_CONTENT); 
		}
		
		Alumnos_has_deportesDto alumnos_has_deportesDto = Alumnos_has_deportesDto.getInstance(alumnos_has_deportes);
		return new ResponseEntity<Alumnos_has_deportesDto>(alumnos_has_deportesDto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findAlumnos_boleta/{alumnos_boleta}", method= RequestMethod.GET)
	public ResponseEntity<Alumnos_has_deportesDto> findAlumnos_boleta(@PathVariable("alumnos_boleta") String alumnos_boleta){
		Alumnos_has_deportes alumnos_has_deportes = alumnos_has_deportesService.findAlumnos_boleta(alumnos_boleta);
		if(alumnos_has_deportes == null) {
			return new ResponseEntity<Alumnos_has_deportesDto>(Alumnos_has_deportesDto.getInstance(alumnos_has_deportes), HttpStatus.NO_CONTENT);
		}

		Alumnos_has_deportesDto alumnos_has_deportesDto = Alumnos_has_deportesDto.getInstance(alumnos_has_deportes);
		return new ResponseEntity<Alumnos_has_deportesDto>(alumnos_has_deportesDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findDeportes_iddeporte/{deportes_iddeporte}", method= RequestMethod.GET)
	public ResponseEntity<Alumnos_has_deportesDto> findDeportes_iddeporte(@PathVariable("deportes_iddeporte") int deportes_iddeporte){
		Alumnos_has_deportes alumnos_has_deportes = alumnos_has_deportesService.findDeportes_iddeporte(deportes_iddeporte);
		if(alumnos_has_deportes == null) {
			return new ResponseEntity<Alumnos_has_deportesDto>(Alumnos_has_deportesDto.getInstance(alumnos_has_deportes), HttpStatus.NO_CONTENT);
		}

		Alumnos_has_deportesDto alumnos_has_deportesDto = Alumnos_has_deportesDto.getInstance(alumnos_has_deportes);
		return new ResponseEntity<Alumnos_has_deportesDto>(alumnos_has_deportesDto, HttpStatus.OK);

	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_deportesDto>> findAll(){
		List<Alumnos_has_deportes> alumnos_has_deportes = alumnos_has_deportesService.findAll();
		if(alumnos_has_deportes.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_deportesDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<Alumnos_has_deportesDto> alumnos_has_deportessDto = Alumnos_has_deportesDto.getInstance(alumnos_has_deportes);
		return new ResponseEntity<List<Alumnos_has_deportesDto>>(alumnos_has_deportessDto, HttpStatus.OK);
		
	}

}


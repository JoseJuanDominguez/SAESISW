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

import com.example.ISWProyecto.dto.AlumnoDto;
import com.example.ISWProyecto.dto.DeportesDto;
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Deportes;
import com.example.ISWProyecto.serviceImpl.AlumnoServiceImpl;
import com.example.ISWProyecto.serviceImpl.DeportesServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Deportes")
public class DeportesController {
	
	@Autowired 
	private DeportesServiceImpl deportesService;
	
	@RequestMapping(value="/findDeportes/{iddeporte}", method= RequestMethod.GET)
	public ResponseEntity<DeportesDto> findDeportes(@PathVariable("iddeporte") int iddeporte){
		Deportes deportes = deportesService.findDeportes(iddeporte);
		if(deportes == null) {
			return new ResponseEntity<DeportesDto>(DeportesDto.getInstance(deportes), HttpStatus.NO_CONTENT); 
		}
		
		DeportesDto deportesDto = DeportesDto.getInstance(deportes);
		return new ResponseEntity<DeportesDto>(deportesDto, HttpStatus.OK);
		
	}
	
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<DeportesDto>> findAll(){
		List<Deportes> deportes = deportesService.findAll();
		if(deportes.isEmpty()) {
			return new ResponseEntity<List<DeportesDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<DeportesDto> deportesDto = DeportesDto.getInstance(deportes);
		return new ResponseEntity<List<DeportesDto>>(deportesDto, HttpStatus.OK);
		
	}

}


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

import com.example.ISWProyecto.dto.CalificacionesDto;
import com.example.ISWProyecto.dto.KardexAlumnoDto;
import com.example.ISWProyecto.model.Calificaciones;
import com.example.ISWProyecto.model.KardexAlumno;
import com.example.ISWProyecto.serviceImpl.KardexAlumnoServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/KardexAlumno")
public class KardexAlumnoController {
	
	@Autowired 
	private KardexAlumnoServiceImpl kardexAlumnoService;
	
	@RequestMapping(value="/findKardex/{boleta}", method= RequestMethod.GET)
	public ResponseEntity<List<KardexAlumnoDto>> findKardex(@PathVariable("boleta") String boleta){
		List<KardexAlumno> kardexAlumno = kardexAlumnoService.findKardex(boleta);
		if(kardexAlumno.isEmpty()) {
			return new ResponseEntity<List<KardexAlumnoDto>>(HttpStatus.NOT_FOUND); 
		}
		
		List<KardexAlumnoDto> kardexAlumnoDto = KardexAlumnoDto.getInstance(kardexAlumno);
		return new ResponseEntity<List<KardexAlumnoDto>>(kardexAlumnoDto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<KardexAlumnoDto>> findAll(){
		List<KardexAlumno> kardexAlumno = kardexAlumnoService.findAll();
		if(kardexAlumno.isEmpty()) {
		return new ResponseEntity<List<KardexAlumnoDto>>(HttpStatus.NOT_FOUND);
		}

		List<KardexAlumnoDto> kardexAlumnoDto = KardexAlumnoDto.getInstance(kardexAlumno);
		return new ResponseEntity<List<KardexAlumnoDto>>(kardexAlumnoDto, HttpStatus.OK);

	}

}

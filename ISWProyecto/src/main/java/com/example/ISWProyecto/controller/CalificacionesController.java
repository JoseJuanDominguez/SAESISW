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
import com.example.ISWProyecto.model.Calificaciones;
import com.example.ISWProyecto.serviceImpl.CalificacionesServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Calificaciones")
public class CalificacionesController {

	@Autowired
	private CalificacionesServiceImpl calificacionesService;

	@RequestMapping(value="/findCalificaciones/{alumnos_boleta}", method= RequestMethod.GET)
	public ResponseEntity<List<CalificacionesDto>> findCalificaciones( @PathVariable("alumnos_boleta") String alumnos_boleta){
		List<Calificaciones> calificaciones = calificacionesService.findCalificaciones(alumnos_boleta);
		if(calificaciones.isEmpty()) {
			return new ResponseEntity<List<CalificacionesDto>>(HttpStatus.NOT_FOUND);
		}

		List<CalificacionesDto> calificacionesDto = CalificacionesDto.getInstance(calificaciones);
		return new ResponseEntity<List<CalificacionesDto>>(calificacionesDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<CalificacionesDto>> findAll(){
		List<Calificaciones> calificaciones = calificacionesService.findAll();
		if(calificaciones.isEmpty()) {
		return new ResponseEntity<List<CalificacionesDto>>(HttpStatus.NOT_FOUND);
		}

		List<CalificacionesDto> calificacionesDto = CalificacionesDto.getInstance(calificaciones);
		return new ResponseEntity<List<CalificacionesDto>>(calificacionesDto, HttpStatus.OK);

	}
}

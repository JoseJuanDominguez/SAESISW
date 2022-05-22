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

	@RequestMapping(value="/findCalificaciones/{materias_idmateria}", method= RequestMethod.GET)
	public ResponseEntity<CalificacionesDto> findCalificaciones( @PathVariable("materias_idmateria") String materias_idmateria){
		Calificaciones calificaciones = calificacionesService.findCalificaciones(materias_idmateria);
		if(calificaciones == null) {
			return new ResponseEntity<CalificacionesDto>(CalificacionesDto.getInstance(calificaciones), HttpStatus.NO_CONTENT);
		}

		CalificacionesDto calificacionesDto = CalificacionesDto.getInstance(calificaciones);
		return new ResponseEntity<CalificacionesDto>(calificacionesDto, HttpStatus.OK);

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

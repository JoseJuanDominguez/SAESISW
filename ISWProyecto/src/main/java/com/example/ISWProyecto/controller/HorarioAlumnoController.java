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
import com.example.ISWProyecto.dto.HorarioAlumnoDto;
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.HorarioAlumno;
import com.example.ISWProyecto.serviceImpl.HorarioAlumnoServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/HorarioAlumno")
public class HorarioAlumnoController {

	
	@Autowired 
	private HorarioAlumnoServiceImpl horarioAlumnoService;
	
	@RequestMapping(value="/findHorarioAlumno/{boleta}/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<List<HorarioAlumnoDto>> findHorarioAlumno(@PathVariable("boleta") String boleta, @PathVariable("grupos_grupo") String grupos_grupo){
		List<HorarioAlumno> horarioAlumno = horarioAlumnoService.findHorarioAlumno(boleta,grupos_grupo);
		if(horarioAlumno.isEmpty()) {
			return new ResponseEntity<List<HorarioAlumnoDto>>(HttpStatus.NOT_FOUND); 
		}
		
		List<HorarioAlumnoDto> alumnoDto = HorarioAlumnoDto.getInstance(horarioAlumno);
		return new ResponseEntity<List<HorarioAlumnoDto>>(alumnoDto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<HorarioAlumnoDto>> findAll(){
		List<HorarioAlumno> horarioAlumno = horarioAlumnoService.findAll();
		if(horarioAlumno.isEmpty()) {
			return new ResponseEntity<List<HorarioAlumnoDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<HorarioAlumnoDto> alumnosDto = HorarioAlumnoDto.getInstance(horarioAlumno);
		return new ResponseEntity<List<HorarioAlumnoDto>>(alumnosDto, HttpStatus.OK);
		
	}
	
}

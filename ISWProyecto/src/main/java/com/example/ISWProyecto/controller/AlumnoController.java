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
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.serviceImpl.AlumnoServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Alumno")
public class AlumnoController {
	
	@Autowired 
	private AlumnoServiceImpl alumnoService;
	
	@RequestMapping(value="/findAlumno/{boleta}/{contrasena}", method= RequestMethod.GET)
	public ResponseEntity<AlumnoDto> findAlumno(@PathVariable("boleta") String boleta, @PathVariable("contrasena") String contrasena){
		Alumno alumno = alumnoService.findAlumno(boleta, contrasena);
		if(alumno == null) {
			return new ResponseEntity<AlumnoDto>(AlumnoDto.getInstance(alumno), HttpStatus.NO_CONTENT); 
		}
		
		AlumnoDto alumnoDto = AlumnoDto.getInstance(alumno);
		return new ResponseEntity<AlumnoDto>(alumnoDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findAlumnoByBoleta/{boleta}", method= RequestMethod.GET)
	public ResponseEntity<AlumnoDto> findAlumnoByBoleta(@PathVariable("boleta") String boleta){
		Alumno alumno = alumnoService.findAlumnoByBoleta(boleta);
		if(alumno == null) {
			return new ResponseEntity<AlumnoDto>(AlumnoDto.getInstance(alumno), HttpStatus.NO_CONTENT); 
		}
		
		AlumnoDto alumnoDto = AlumnoDto.getInstance(alumno);
		return new ResponseEntity<AlumnoDto>(alumnoDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<AlumnoDto>> findAll(){
		List<Alumno> alumnos = alumnoService.findAll();
		if(alumnos.isEmpty()) {
			return new ResponseEntity<List<AlumnoDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<AlumnoDto> alumnosDto = AlumnoDto.getInstance(alumnos);
		return new ResponseEntity<List<AlumnoDto>>(alumnosDto, HttpStatus.OK);
		
	}

}

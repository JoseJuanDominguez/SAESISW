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
import com.example.ISWProyecto.dto.GruposDto;
import com.example.ISWProyecto.dto.MateriasDto;
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Grupos;
import com.example.ISWProyecto.model.Materias;
import com.example.ISWProyecto.serviceImpl.MateriasServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Materias")
public class MateriasController {
	
	@Autowired 
	MateriasServiceImpl materiasService;
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<MateriasDto>> findAll(){
		List<Materias> materias = materiasService.findAll();
		if(materias.isEmpty()) {
			return new ResponseEntity<List<MateriasDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<MateriasDto> materiasDto = MateriasDto.getInstance(materias);
		return new ResponseEntity<List<MateriasDto>>(materiasDto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findMateriaById/{idmateria}", method= RequestMethod.GET)
	public ResponseEntity<MateriasDto> findMateriaById(@PathVariable("idmateria") String idmateria){
		Materias materias = materiasService.findMateriaById(idmateria);
		if(materias == null) {
			return new ResponseEntity<MateriasDto>(MateriasDto.getInstance(materias), HttpStatus.NO_CONTENT);
		}
		
		MateriasDto materiasdto = MateriasDto.getInstance(materias);
		return new ResponseEntity<MateriasDto>(materiasdto, HttpStatus.OK);
		
	}

}

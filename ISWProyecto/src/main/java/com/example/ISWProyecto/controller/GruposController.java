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

import com.example.ISWProyecto.dto.Alumnos_has_CalificacionesDto;
import com.example.ISWProyecto.dto.GruposDto;
import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
import com.example.ISWProyecto.model.Grupos;
import com.example.ISWProyecto.serviceImpl.GruposServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Grupos")
public class GruposController {
	@Autowired 
	GruposServiceImpl gruposService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<GruposDto>> findAll(){
		List<Grupos> grupos = gruposService.findAll();
		if(grupos.isEmpty()) {
			return new ResponseEntity<List<GruposDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<GruposDto> gruposDto = GruposDto.getInstance(grupos);
		return new ResponseEntity<List<GruposDto>>(gruposDto, HttpStatus.OK);
		
	}
	@RequestMapping(value="/findGrupoById/{grupo}", method= RequestMethod.GET)
	public ResponseEntity<GruposDto> findGrupoById(@PathVariable("grupo") String grupo){
		Grupos grupos = gruposService.findGrupoById(grupo);
		if(grupos == null) {
			return new ResponseEntity<GruposDto>(GruposDto.getInstance(grupos), HttpStatus.NO_CONTENT);
		}
		
		GruposDto gruposdto = GruposDto.getInstance(grupos);
		return new ResponseEntity<GruposDto>(gruposdto, HttpStatus.OK);
		
	}
}

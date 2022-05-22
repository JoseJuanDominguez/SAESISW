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

import com.example.ISWProyecto.dto.Maestros_has_gruposDto;
import com.example.ISWProyecto.model.Maestros_has_grupos;
import com.example.ISWProyecto.serviceImpl.Maestros_has_gruposServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Maestros_has_grupos")
public class Maestros_has_gruposController {
	
	@Autowired 
	private Maestros_has_gruposServiceImpl maestros_has_gruposService;
	
	@RequestMapping(value="/findMaestros_has_grupos/{maestros_rfc}/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<Maestros_has_gruposDto> findMaestros_has_grupos(@PathVariable("maestros_rfc") String maestros_rfc, @PathVariable("grupos_grupo") String grupos_grupo){
		Maestros_has_grupos maestros_has_grupos = maestros_has_gruposService.findMaestros_has_grupos(maestros_rfc, grupos_grupo);
		if(maestros_has_grupos == null) {
			return new ResponseEntity<Maestros_has_gruposDto>(Maestros_has_gruposDto.getInstance(maestros_has_grupos), HttpStatus.NO_CONTENT); 
		}
		
		Maestros_has_gruposDto maestros_has_gruposDto = Maestros_has_gruposDto.getInstance(maestros_has_grupos);
		return new ResponseEntity<Maestros_has_gruposDto>(maestros_has_gruposDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findMaestros_rfc/{maestros_rfc}", method= RequestMethod.GET)
	public ResponseEntity<Maestros_has_gruposDto> findMaestros_rfc(@PathVariable("maestros_rfc") String maestros_rfc){
		Maestros_has_grupos maestros_has_grupos = maestros_has_gruposService.findMaestros_rfc(maestros_rfc);
		if(maestros_has_grupos == null) {
			return new ResponseEntity<Maestros_has_gruposDto>(Maestros_has_gruposDto.getInstance(maestros_has_grupos), HttpStatus.NO_CONTENT);
		}

		Maestros_has_gruposDto maestros_has_gruposDto = Maestros_has_gruposDto.getInstance(maestros_has_grupos);
		return new ResponseEntity<Maestros_has_gruposDto>(maestros_has_gruposDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findGrupos_grupo/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<Maestros_has_gruposDto> findGrupos_grupo( @PathVariable("grupos_grupo") String grupos_grupo){
		Maestros_has_grupos maestros_has_grupos = maestros_has_gruposService.findGrupos_grupo(grupos_grupo);
		if(maestros_has_grupos == null) {
			return new ResponseEntity<Maestros_has_gruposDto>(Maestros_has_gruposDto.getInstance(maestros_has_grupos), HttpStatus.NO_CONTENT);
		}

		Maestros_has_gruposDto maestros_has_gruposDto = Maestros_has_gruposDto.getInstance(maestros_has_grupos);
		return new ResponseEntity<Maestros_has_gruposDto>(maestros_has_gruposDto, HttpStatus.OK);

	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Maestros_has_gruposDto>> findAll(){
		List<Maestros_has_grupos> maestros_has_grupos = maestros_has_gruposService.findAll();
		if(maestros_has_grupos.isEmpty()) {
			return new ResponseEntity<List<Maestros_has_gruposDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<Maestros_has_gruposDto> maestros_has_gruposDto = Maestros_has_gruposDto.getInstance(maestros_has_grupos);
		return new ResponseEntity<List<Maestros_has_gruposDto>>(maestros_has_gruposDto, HttpStatus.OK);
		
	}
	
	

}


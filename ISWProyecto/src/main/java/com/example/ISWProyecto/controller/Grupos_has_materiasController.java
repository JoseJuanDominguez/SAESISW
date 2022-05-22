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

import com.example.ISWProyecto.dto.Grupos_has_materiasDto;
import com.example.ISWProyecto.model.Grupos_has_materias;
import com.example.ISWProyecto.serviceImpl.Grupos_has_materiasServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Grupos_has_materias")
public class Grupos_has_materiasController {

	@Autowired
	private Grupos_has_materiasServiceImpl grupos_has_materiasService;

	@RequestMapping(value="/findGrupos_has_materias/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<List<Grupos_has_materiasDto>> findGrupos_has_materias(@PathVariable("grupos_grupo") String grupos_grupo){
		List<Grupos_has_materias> grupos_has_materias = grupos_has_materiasService.findGrupos_has_materias(grupos_grupo);
		if(grupos_has_materias.isEmpty()) {
			return new ResponseEntity<List<Grupos_has_materiasDto>>(HttpStatus.NOT_FOUND);
		}

		List<Grupos_has_materiasDto> grupos_has_materiasDto = Grupos_has_materiasDto.getInstance(grupos_has_materias);
		return new ResponseEntity<List<Grupos_has_materiasDto>>(grupos_has_materiasDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findGrupos_grupo/{grupos_grupo}", method= RequestMethod.GET)
	public ResponseEntity<Grupos_has_materiasDto> findGrupos_grupo(@PathVariable("grupos_grupo") String grupos_grupo){
		Grupos_has_materias grupos_has_materias = grupos_has_materiasService.findGrupos_grupo(grupos_grupo);
		if(grupos_has_materias == null) {
			return new ResponseEntity<Grupos_has_materiasDto>(Grupos_has_materiasDto.getInstance(grupos_has_materias), HttpStatus.NO_CONTENT);
		}

		Grupos_has_materiasDto grupos_has_materiasDto = Grupos_has_materiasDto.getInstance(grupos_has_materias);
		return new ResponseEntity<Grupos_has_materiasDto>(grupos_has_materiasDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findMaterias_idmateria/{materias_idmateria}", method= RequestMethod.GET)
	public ResponseEntity<Grupos_has_materiasDto> findMaterias_idmateria(@PathVariable("materias_idmateria") String materias_idmateria){
		Grupos_has_materias grupos_has_materias = grupos_has_materiasService.findMaterias_idmateria(materias_idmateria);
		if(grupos_has_materias == null) {
			return new ResponseEntity<Grupos_has_materiasDto>(Grupos_has_materiasDto.getInstance(grupos_has_materias), HttpStatus.NO_CONTENT);
		}

		Grupos_has_materiasDto grupos_has_materiasDto = Grupos_has_materiasDto.getInstance(grupos_has_materias);
		return new ResponseEntity<Grupos_has_materiasDto>(grupos_has_materiasDto, HttpStatus.OK);

	}

	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Grupos_has_materiasDto>> findAll(){
		List<Grupos_has_materias> grupos_has_materias = grupos_has_materiasService.findAll();
		if(grupos_has_materias.isEmpty()) {
			return new ResponseEntity<List<Grupos_has_materiasDto>>(HttpStatus.NOT_FOUND);
		}

		List<Grupos_has_materiasDto> grupos_has_materiasDto = Grupos_has_materiasDto.getInstance(grupos_has_materias);
		return new ResponseEntity<List<Grupos_has_materiasDto>>(grupos_has_materiasDto, HttpStatus.OK);

	}
}


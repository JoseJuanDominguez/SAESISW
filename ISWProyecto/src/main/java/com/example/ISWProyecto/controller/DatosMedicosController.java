package com.example.ISWProyecto.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.AlumnoDto;
import com.example.ISWProyecto.dto.DatosMedicosDto;
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.DatosMedicos;
import com.example.ISWProyecto.serviceImpl.DatosMedicosServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/DatosMedicos")
public class DatosMedicosController {
	
	@Autowired
	private DatosMedicosServiceImpl datosService;
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<DatosMedicosDto>> findAll(){
		List<DatosMedicos> datosMedicos = datosService.findAll();
		if(datosMedicos.isEmpty()) {
			return new ResponseEntity<List<DatosMedicosDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<DatosMedicosDto> datosMedicosDto = DatosMedicosDto.getInstance(datosMedicos);
		return new ResponseEntity<List<DatosMedicosDto>>(datosMedicosDto, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/findDatos/{num_seg_social}", method= RequestMethod.GET)
	public ResponseEntity<DatosMedicosDto> findDatos(@PathVariable("num_seg_social") Double num_seg_social){
		DatosMedicos datosMedicos = datosService.findDatos(num_seg_social);
		if(datosMedicos == null) {
			return new ResponseEntity<DatosMedicosDto>(DatosMedicosDto.getInstance(datosMedicos), HttpStatus.NO_CONTENT);
		}
		
		DatosMedicosDto datosMedicosDto = DatosMedicosDto.getInstance(datosMedicos);
		return new ResponseEntity<DatosMedicosDto>(datosMedicosDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/actualizarDatosMedicos", method= RequestMethod.POST)
	public ResponseEntity<DatosMedicosDto> actualizarDatosMedicos(@RequestBody DatosMedicosDto datosDto){
		DatosMedicos datosMedicos = new DatosMedicos();
		
		if(!Objects.isNull(datosDto.getNum_seg_social()) && datosDto.getNum_seg_social()<0) {
			datosMedicos.setNum_seg_social(datosDto.getNum_seg_social());
		}
		
		datosMedicos.setAlergia(datosDto.getAlergia());
		datosMedicos.setEstatura(datosDto.getEstatura());
		datosMedicos.setPeso(datosDto.getPeso());
		datosMedicos.setPieplano(datosDto.getPieplano());
		datosMedicos.setProblema_fisico(datosDto.getProblema_fisico());
		datosMedicos.setTiposangre(datosDto.getTiposangre());
		
		DatosMedicos datosSaved = datosService.actualizarDatosMedicos(datosMedicos); 
		
		if(datosSaved == null) {
			return new ResponseEntity<DatosMedicosDto>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<DatosMedicosDto>(DatosMedicosDto.getInstance(datosSaved), HttpStatus.OK);
		
		
	}
	
	
	@RequestMapping(value="/agregarDatosMedicos", method= RequestMethod.POST)
	public ResponseEntity<DatosMedicosDto> agregarDatosMedicos(@RequestBody DatosMedicosDto datosDto){
		DatosMedicos datosMedicos = new DatosMedicos();
		
		datosMedicos.setNum_seg_social(datosDto.getNum_seg_social());
		datosMedicos.setAlergia(datosDto.getAlergia());
		datosMedicos.setEstatura(datosDto.getEstatura());
		datosMedicos.setPeso(datosDto.getPeso());
		datosMedicos.setPieplano(datosDto.getPieplano());
		datosMedicos.setProblema_fisico(datosDto.getProblema_fisico());
		datosMedicos.setTiposangre(datosDto.getTiposangre());
		
		DatosMedicos datosSaved = datosService.agregarDatosMedicos(datosMedicos); 
		
		if(datosSaved == null) {
			return new ResponseEntity<DatosMedicosDto>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<DatosMedicosDto>(DatosMedicosDto.getInstance(datosSaved), HttpStatus.OK);
		
		
	}
	
	
	
	

}

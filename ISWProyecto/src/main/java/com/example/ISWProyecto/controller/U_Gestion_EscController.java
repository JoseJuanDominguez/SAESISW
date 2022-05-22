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

import com.example.ISWProyecto.dto.U_Gestion_EscDto;
import com.example.ISWProyecto.model.U_Gestion_Esc;
import com.example.ISWProyecto.serviceImpl.U_Gestion_EscServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/U_Gestion_Esc")
public class U_Gestion_EscController {
	@Autowired 
	private U_Gestion_EscServiceImpl u_gestion_escService;
	
	@RequestMapping(value="/findU_Gestion_Esc/{rfc}/{contrasena}", method= RequestMethod.GET)
	public ResponseEntity<U_Gestion_EscDto> findU_Gestion_Esc(@PathVariable("rfc") String rfc, @PathVariable("contrasena") String contrasena){
		U_Gestion_Esc u_gestion_esc = u_gestion_escService.findU_Gestion_Esc(rfc, contrasena);
		if(u_gestion_esc == null) {
			return new ResponseEntity<U_Gestion_EscDto>(U_Gestion_EscDto.getInstance(u_gestion_esc), HttpStatus.NO_CONTENT); 
		}
		
		U_Gestion_EscDto u_gestion_escDto = U_Gestion_EscDto.getInstance(u_gestion_esc);
		return new ResponseEntity<U_Gestion_EscDto>(u_gestion_escDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findU_Gestion_EscById/{rfc}", method= RequestMethod.GET)
	public ResponseEntity<U_Gestion_EscDto> findU_Gestion_EscById(@PathVariable("rfc") String rfc){
		U_Gestion_Esc u_gestion_esc = u_gestion_escService.findU_Gestion_EscById(rfc);
		if(u_gestion_esc == null) {
			return new ResponseEntity<U_Gestion_EscDto>(U_Gestion_EscDto.getInstance(u_gestion_esc), HttpStatus.NO_CONTENT); 
		}
		
		U_Gestion_EscDto u_gestion_escDto = U_Gestion_EscDto.getInstance(u_gestion_esc);
		return new ResponseEntity<U_Gestion_EscDto>(u_gestion_escDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<U_Gestion_EscDto>> findAll(){
		List<U_Gestion_Esc> u_gestion_esc = u_gestion_escService.findAll();
		if(u_gestion_esc.isEmpty()) {
			return new ResponseEntity<List<U_Gestion_EscDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<U_Gestion_EscDto> u_gestion_escDto = U_Gestion_EscDto.getInstance(u_gestion_esc);
		return new ResponseEntity<List<U_Gestion_EscDto>>(u_gestion_escDto, HttpStatus.OK);
		
	}
}

package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.DatosMedicos;
import com.example.ISWProyecto.model.Direcciones;

public interface DireccionesRepository extends JpaRepository<Direcciones, Integer>{
	
	@Query("SELECT a FROM Direcciones a where a.iddireccion = :iddireccion")
	Direcciones findDireccion(@Param("iddireccion") Long iddireccion);
}

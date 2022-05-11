package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Deportes;

public interface DeportesRepository extends JpaRepository<Deportes, String> {
	
	@Query("SELECT a FROM Deportes a where a.iddeporte = :iddeporte and a.nombre = :nombre")
	Deportes findDeportes(@Param("iddeporte") int iddeporte, @Param("nombre") String nombre);

}


package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.ISWProyecto.model.Maestros;

public interface MaestrosRepository extends JpaRepository<Maestros, String> {
	@Query("SELECT a FROM Maestros a where a.rfc = :rfc and a.contrasena = :contrasena")
	Maestros findMaestro(@Param("rfc") String rfc, @Param("contrasena") String contrasena);
	
	@Query("SELECT a FROM Maestros a where a.rfc = :rfc")
	Maestros findMaestroById(@Param("rfc") String rfc);

}

package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.ISWProyecto.model.U_Gestion_Esc;

public interface U_Gestion_EscRepository extends JpaRepository<U_Gestion_Esc, String>{
	@Query("SELECT a FROM U_Gestion_Esc a where a.rfc = :rfc and a.contrasena = :contrasena")
	U_Gestion_Esc findU_Gestion_Esc(@Param("rfc") String rfc, @Param("contrasena") String contrasena);
	@Query("SELECT a FROM U_Gestion_Esc a where a.rfc = :rfc")
	U_Gestion_Esc findU_Gestion_EscById(@Param("rfc") String rfc);
}

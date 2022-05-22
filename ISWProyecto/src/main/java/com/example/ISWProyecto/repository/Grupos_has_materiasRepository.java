package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Grupos_has_materias;

public interface Grupos_has_materiasRepository extends JpaRepository<Grupos_has_materias, String>{

	@Query("SELECT a FROM Grupos_has_materias a where a.grupos_grupo = :grupos_grupo")
	List<Grupos_has_materias> findGrupos_has_materias(@Param("grupos_grupo") String grupos_grupo);

	@Query("SELECT a FROM Grupos_has_materias a where a.grupos_grupo = :grupos_grupo")
	Grupos_has_materias findGrupos_grupo(@Param("grupos_grupo") String grupos_grupo);

	@Query("SELECT a FROM Grupos_has_materias a where a.materias_idmateria = :materias_idmateria")
	Grupos_has_materias findMaterias_idmateria( @Param("materias_idmateria") String materias_idmateria);

}
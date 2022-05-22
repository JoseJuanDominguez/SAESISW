package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.KardexAlumno;



public interface KardexAlumnoRepository  extends JpaRepository <KardexAlumno, String>{
	@Query(value="select al.boleta, cal.materias_idmateria, mat.nombre_m, cal.fecha, cal.primerdep, cal.segundodep, cal.tercerdep from (alumnos al inner join calificaciones cal on al.boleta = cal.alumnos_boleta) inner join materias mat on mat.idmateria = cal.materias_idmateria where al.boleta= :boleta", nativeQuery = true)

	List<KardexAlumno> findKardex(@Param("boleta") String boleta);                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}                        
                  


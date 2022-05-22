package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.model.HorarioAlumno;

public interface HorarioAlumnoRepository extends JpaRepository <HorarioAlumno, String>{
	@Query(value="select mg.grupos_grupo, m.nombre, m.paterno, m.materno, mat.idmateria, mat.nombre_m, gm.dia, gm.hora_inicio, gm.hora_fin, gm.salon from (alumnos_has_grupos ag inner join maestros_has_grupos mg on mg.grupos_grupo = ag.grupos_grupo) inner join maestros m on m.rfc = mg.maestros_rfc inner join grupos_has_materias gm on gm.grupos_grupo = mg.grupos_grupo inner join materias mat on mat.idmateria = gm.materias_idmateria where alumnos_boleta= :boleta and ag.grupos_grupo =:grupos_grupo", nativeQuery = true)
	List<HorarioAlumno> findHorarioAlumno(@Param("boleta") String boleta, @Param("grupos_grupo") String grupos_grupo);
}

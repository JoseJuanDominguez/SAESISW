package com.example.ISWProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.model.HorarioAlumno;

public interface HorarioAlumnoRepository extends JpaRepository <HorarioAlumno, String>{
	@Query(value="select alumnos_boleta, ah.grupos_grupo, m.nombre, m.paterno, m.materno, gm.materias_idmateria, mat.nombre_m, gm.dia, gm.hora_inicio, gm.hora_fin, gm.salon from (alumnos_has_horario ah) inner join maestros m on m.rfc = ah.maestro inner join grupos_has_materias gm on gm.grupos_grupo = ah.grupos_grupo inner join materias mat on mat.idmateria = gm.materias_idmateria where alumnos_boleta= :alumnos_boleta", nativeQuery = true)
	List<HorarioAlumno> findHorarioAlumno(@Param("alumnos_boleta") String alumnos_boleta);
}

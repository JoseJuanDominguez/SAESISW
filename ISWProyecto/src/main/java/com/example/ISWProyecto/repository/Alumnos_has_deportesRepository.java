package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_deportes;

public interface Alumnos_has_deportesRepository extends JpaRepository<Alumnos_has_deportes, String> {

        @Query("SELECT a FROM Alumnos_has_deportes a where a.alumnos_boleta = :alumnos_boleta and a.deportes_iddeporte = :deportes_iddeporte")
        Alumnos_has_deportes findAlumnos_has_deportes(@Param("alumnos_boleta") String alumnos_boleta, @Param("deportes_iddeporte") int deportes_iddeporte);

        @Query("SELECT a FROM Alumnos_has_deportes a where a.alumnos_boleta = :alumnos_boleta")
        Alumnos_has_deportes findAlumnos_boleta(@Param("alumnos_boleta") String alumnos_boleta);

        @Query("SELECT a FROM Alumnos_has_deportes a where a.deportes_iddeporte = :deportes_iddeporte")
        Alumnos_has_deportes findDeportes_iddeporte( @Param("deportes_iddeporte") int deportes_iddeporte);
}


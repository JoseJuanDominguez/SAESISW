package com.example.ISWProyecto.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNOS_HAS_DEPORTES")
@NamedQuery(name="Alumnos_has_deportes.findAll", query="SELECT a FROM Alumnos_has_deportes a")
public class Alumnos_has_deportes {
        @Id
        private String alumnos_boleta;

        private int deportes_iddeporte;

        public String getAlumnos_boleta() {
                return alumnos_boleta;
        }

        public void setAlumnos_boleta(String alumnos_boleta) {
                this.alumnos_boleta = alumnos_boleta;
        }

        public int getDeportes_iddeporte() {
                return deportes_iddeporte;
        }

        public void setDeportes_iddeporte(int deportes_iddeporte) {
                this.deportes_iddeporte = deportes_iddeporte;
        }

}


package com.daw.basquet.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Equipo {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String localidad;
    private LocalDate fechaCreacion;

    public Equipo(String nombre, String localidad, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Equipo(){}
}

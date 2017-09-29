package com.daw.basquet.data;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Integer numCanastas;
    private Integer numRebotes;
    private Integer numAsistencias;
    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, Integer numCanastas, Integer numRebotes, Integer numAsistencias, String posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
        this.posicion = posicion;
    }
}
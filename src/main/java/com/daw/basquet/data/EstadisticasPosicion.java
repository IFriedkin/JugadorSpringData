package com.daw.basquet.data;

import lombok.Data;

@Data
public class EstadisticasPosicion {

    protected String posicion;
    protected Double numCanastas;
    protected Double numRebotes;
    protected Double numAsistencias;

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
    }

    public EstadisticasPosicion() {
    }
}

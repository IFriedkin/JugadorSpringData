package com.daw.basquet.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@EqualsAndHashCode(callSuper = false)
public class EstadisticasPosicionExtendidas extends EstadisticasPosicion {
    private Integer minCanastas;
    private Integer minRebotes;
    private Integer minAsistencias;
    private Integer maxRebotes;
    private Integer maxCanastas;
    private Integer maxAsistencias;

    public EstadisticasPosicionExtendidas(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias,
                                          Integer minCanastas, Integer minRebotes, Integer minAsistencias,
                                          Integer maxRebotes, Integer maxCanastas, Integer maxAsistencias) {
        super(posicion, numCanastas, numRebotes, numAsistencias);
        this.minCanastas = minCanastas;
        this.minRebotes = minRebotes;
        this.minAsistencias = minAsistencias;
        this.maxRebotes = maxRebotes;
        this.maxCanastas = maxCanastas;
        this.maxAsistencias = maxAsistencias;
    }

    public EstadisticasPosicionExtendidas(){}

    @Override
    public String toString() {
        return "EstadisticasPosicionExtendidas{" +
                "posición='" + posicion + '\'' +
                ", media canastas=" + numCanastas +
                ", mínimo canastas=" + minCanastas +
                ", mínimo canastas=" + maxCanastas +
                ", media rebotes=" + numRebotes +
                ", mínimo rebotes=" + minRebotes +
                ", maximo rebotes=" + maxRebotes +
                ", media asistencias=" + numAsistencias +
                ", mínimo asistencias=" + minAsistencias +
                ", máximo asistencias=" + maxAsistencias +
                '}';
    }
}

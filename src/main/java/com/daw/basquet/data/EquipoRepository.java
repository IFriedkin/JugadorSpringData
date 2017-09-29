package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    Equipo findByNombre(String nombre);
    List<Equipo> findByLocalidad(String nombre);



    /*@Query("SELECT NEW com.daw.basquet.data.Jugador (j.nombre)" +
            "FROM Jugador j, Equipo e")*/

    /*@Query("SELECT NEW com.daw.basquet.data.EstadisticasPosicion (j.posicion, AVG(j.numCanastas), " +
            "AVG(j.numAsistencias), AVG(j.numRebotes)) " +
            "FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicion> AvgAllPerPosicion();*/
}

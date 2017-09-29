package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    Jugador findByNombre(String nombre);

    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    //List<Jugador> findByNumCanastasBetween(Integer min, Integer max);

    List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);

    List<Jugador> findByPosicion(String nombre);

    List<Jugador> findByFechaNacimientoAfter(LocalDate fecha);

    @Query("SELECT NEW com.daw.basquet.data.EstadisticasPosicion (j.posicion, AVG(j.numCanastas), " +
            "AVG(j.numAsistencias), AVG(j.numRebotes)) " +
            "FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicion> AvgAllPerPosicion();

    @Query("SELECT NEW com.daw.basquet.data.EstadisticasPosicionExtendidas (j.posicion, AVG(j.numCanastas), " +
            "AVG(j.numAsistencias), AVG(j.numRebotes), MIN(j.numCanastas), MIN(j.numAsistencias), MIN(j.numRebotes)," +
            "MAX(j.numCanastas), MAX(j.numAsistencias), MAX(j.numRebotes))" +
            "FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicionExtendidas> AvgAndMinAndMaxAllPerPosicion();
}

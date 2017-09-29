package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    /**
     * Busca en la DB un jugador a partir del nombre.
     * @param nombre Nombre del jugador.
     * @return
     */
    Jugador findByNombre(String nombre);

    /**
     * Busca en la DB los jugadores que tengan un número de canastas mayor o igual al que se consulta.
     * @param numCanastas Número de canastas que se especifican.
     * @return
     */
    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    /**
     * Busca en la DB jugadores a partir de un rango de asistencias.
     * @param min El mínimo de asistencias que se solicitan.
     * @param max El máximo de asistencias que se solicitan.
     * @return
     */
    List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);

    /**
     * Busca en la DB los jugadores a partir de una posición.
     * @param nombre nombre de la posición por la que se quiere buscar al jugador.
     * @return
     */
    List<Jugador> findByPosicion(String nombre);

    /**
     * Busca en la DB jugadores que hayan nacido después de la fecha especificada.
     * @param fecha Fecha que se especifica para realizar la búsqueda.
     * @return
     */
    List<Jugador> findByFechaNacimientoAfter(LocalDate fecha);

    /**
     * Busca y agrupa a los jugadores de la DB por posición y hace la media de las canastas, asistencias y rebotes.
     * @return
     */
    @Query("SELECT NEW com.daw.basquet.data.EstadisticasPosicion (j.posicion, AVG(j.numCanastas), " +
            "AVG(j.numAsistencias), AVG(j.numRebotes)) " +
            "FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicion> AvgAllPerPosicion();

    /**
     * Busca y agrupa a los jugadores de la DB por posición y hace la edia de las canastas, asistencias y rebotes.
     * Además también busca el mínimo y maximo de canastas, asistencias y rebotes.
     * @return
     */
    @Query("SELECT NEW com.daw.basquet.data.EstadisticasPosicionExtendidas (j.posicion, AVG(j.numCanastas), " +
            "AVG(j.numAsistencias), AVG(j.numRebotes), MIN(j.numCanastas), MIN(j.numAsistencias), MIN(j.numRebotes)," +
            "MAX(j.numCanastas), MAX(j.numAsistencias), MAX(j.numRebotes))" +
            "FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicionExtendidas> AvgAndMinAndMaxAllPerPosicion();
}

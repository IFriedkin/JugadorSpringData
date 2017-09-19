package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador> findByNombre(String nombre);

    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    List<Jugador> findByNumCanastasBetween(Integer min, Integer max);
}

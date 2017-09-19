package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testJugador(){

        Jugador ibrahim = new Jugador(
                "Ibrahim",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(ibrahim);

    }

}

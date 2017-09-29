package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;


    public void testJugador(){

        Equipo equipo1 = equipoRepository.findByNombre("Chicago Bulls");

        Jugador jugador1 = new Jugador(
                "Carlos",
                LocalDate.of(1991,1,9),
                8,
                12,
                7,
                "alero"
        );
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador(
                "Jaime",
                LocalDate.of(1995,1,1),
                6,
                2,
                25,
                "base"
        );
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Equipo equipo2 = equipoRepository.findByNombre("New York Knicks");
        Jugador jugador3 = new Jugador(
                "Hugo",
                LocalDate.of(1998,1,1),
                14,
                12,
                2,
                "pibot"
        );
        jugador3.setEquipo(equipo2);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador(
                "Alex",
                LocalDate.of(1996,1,1),
                9,
                4,
                3,
                "alero"
        );
        jugador4.setEquipo(equipo2);
        jugadorRepository.save(jugador4);

        Equipo equipo3 = equipoRepository.findByNombre("Toronto Raptors");
        Jugador jugador5 = new Jugador(
                "Gonzalo",
                LocalDate.of(1992,1,1),
                1,
                3,
                16,
                "base"
        );
        jugador5.setEquipo(equipo3);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador(
                "Ibrahim",
                LocalDate.of(1991,1,9),
                10,
                6,
                4,
                "pibot"
        );
        jugador6.setEquipo(equipo3);
        jugadorRepository.save(jugador6);

        Equipo equipo4 = equipoRepository.findByNombre("Boston Celtics");
        Jugador jugador7 = new Jugador(
                "Pablo",
                LocalDate.of(1996,1,1),
                8,
                8,
                8,
                "alero"
        );
        jugador7.setEquipo(equipo4);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador(
                "Anders",
                LocalDate.of(1990,1,1),
                15,
                6,
                9,
                "base"
        );
        jugador8.setEquipo(equipo4);
        jugadorRepository.save(jugador8);

        Equipo equipo5 = equipoRepository.findByNombre("Dallas Mavericks");
        Jugador jugador9 = new Jugador(
                "Dorian",
                LocalDate.of(1993,1,1),
                13,
                6,
                13,
                "pibot"
        );
        jugador9.setEquipo(equipo5);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador(
                "Leliana",
                LocalDate.of(1991,1,1),
                12,
                12,
                6,
                "alero"
        );
        jugador10.setEquipo(equipo5);
        jugadorRepository.save(jugador10);

        System.out.println("Consulta jugador por nombre: " + jugadorRepository.findByNombre("Anders"));
        System.out.println("Consulta jugadores con número de canastas mayor o igual a 12: "
                + jugadorRepository.findByNumCanastasGreaterThanEqual(12));
        System.out.println("Consulta con rango de asistencias" + jugadorRepository.findByNumAsistenciasBetween(9,12));
        System.out.println("Consulta con jugadores por posicion" + jugadorRepository.findByPosicion("alero"));
        System.out.println("Consulta por fecha de nacimiento mayor a 1993"
                + jugadorRepository.findByFechaNacimientoAfter(LocalDate.of(1993, 1, 1)));
        System.out.println("Consulta con media de estadísticas por posición: " + jugadorRepository.AvgAllPerPosicion());
        System.out.println("Consulta con media, máximo y mínimo por posición: "
                + jugadorRepository.AvgAndMinAndMaxAllPerPosicion());


    }
}

package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){
        Equipo equipo1 = new Equipo("Chicago Bulls", "Chicago",
                LocalDate.of(1966, 1, 1));

        Equipo equipo2 = new Equipo("New York Knicks", "New York",
                LocalDate.of(1946,1,1));

        Equipo equipo3 = new Equipo("Toronto Raptors", "Toronto",
                LocalDate.of(1995,1,1));

        Equipo equipo4 = new Equipo("Boston Celtics","Boston",
                LocalDate.of(1946,1,1));

        Equipo equipo5 = new Equipo("Dallas Mavericks","Dallas",
                LocalDate.of(1980,1,1));

        equipoRepository.save(equipo1);
        equipoRepository.save(equipo2);
        equipoRepository.save(equipo3);
        equipoRepository.save(equipo4);
        equipoRepository.save(equipo5);
    }
}

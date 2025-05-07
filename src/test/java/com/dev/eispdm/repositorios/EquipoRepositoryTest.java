package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Equipo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EquipoRepositoryTest {
    @Autowired
    EquipoRepository equipoRepository;
    @Test
    public void findAllEquiposs(){
        List<Equipo> equipos = this.equipoRepository.findAll();
        System.out.println("EQUIPO "+equipos );
    }
}
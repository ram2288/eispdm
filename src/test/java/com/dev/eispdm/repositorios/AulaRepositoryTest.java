package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Aula;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AulaRepositoryTest {
    @Autowired
    AulaRepository aulaRepository;
    @Test
    public void findByAula() {
        Optional<Aula> aula = aulaRepository.findByAula("A1");
        //System.out.println("aula = "+aula);
    }

    @Test
    void findByAulaContainingOrderByAulaAsc() {
        List<Aula> aulas = aulaRepository.findByAulaContainingOrderByAulaAsc("A1");
        //System.out.println(aulas);
    }

    @Test
    void findByAulaContaining() {
    }
}
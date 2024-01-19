package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Aula;
import com.dev.eispdm.entidades.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarreraRepository extends JpaRepository<Carrera,Integer> {
    Optional<Carrera> findByCarrera(String carrera);
    List<Carrera> findByCarreraContainingOrderByCarreraAsc(String name);
    List<Carrera> findByCarreraContaining(String carrera);
}

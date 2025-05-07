package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface AulaRepository extends JpaRepository<Aula,Integer> {
    Optional<Aula> findByAula(String nombre);
    List<Aula> findByAulaContainingOrderByAulaAsc(String name);
    List<Aula> findByAulaContaining(String aulas);
   // List<Aula> findAllAulaAsc();


}

package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo,Integer> {
}

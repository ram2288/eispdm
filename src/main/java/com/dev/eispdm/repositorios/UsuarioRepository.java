package com.dev.eispdm.repositorios;

import com.dev.eispdm.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}

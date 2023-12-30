package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Equipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto {
    private Integer idCategoria;

    private String categoria;

    private Set<Equipo> equipos;
}

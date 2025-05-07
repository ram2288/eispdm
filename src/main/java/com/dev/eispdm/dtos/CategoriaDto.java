package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Equipo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class CategoriaDto {
    private Integer idCategoria;

    private String categoria;


}

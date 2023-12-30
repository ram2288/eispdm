package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Equipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoEquipoDto {
    private Integer idEstado;
    private String estado;
    private Set<Equipo> equipos;
}

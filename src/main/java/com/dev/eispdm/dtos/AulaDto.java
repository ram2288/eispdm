package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Equipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AulaDto {
    private Integer idAula;
    private String aula;
    private Set<Equipo> equipos;
}

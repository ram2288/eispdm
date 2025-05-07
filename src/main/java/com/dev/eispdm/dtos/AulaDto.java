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
public class AulaDto {
    private Integer idAula;
    private String aula;
    private CarreraDto carrera;
    //private List<Equipo> equipos ;
}

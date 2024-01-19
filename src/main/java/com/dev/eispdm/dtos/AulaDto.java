package com.dev.eispdm.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AulaDto {
    private Integer idAula;
    private String aula;
    private CarreraDto carrera;
}

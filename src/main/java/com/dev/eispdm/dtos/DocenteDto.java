package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Carrera;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocenteDto implements Serializable {
    private Integer idDocente;
    private String nomDocente;
    private String apePaterno;
    private String apeMaterno;
    private String ci;
    private CarreraDto carrera;
}

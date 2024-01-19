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
public class EstudianteDto implements Serializable {
    private Integer idEstudiante;
    private  String nomEstudiante;
    private  String apePaterno;
    private String apeMaterno;
    private String ci;
    private String matricula;
    private CarreraDto carrera;
}

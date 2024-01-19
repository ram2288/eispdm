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
public class MateriaDto implements Serializable {
    private Integer idMateria;
    private String Materia;
    private String Sigla;
    private CarreraDto carrera;

}

package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarreraDto implements Serializable {

    private Integer idCarrera;
    private String carrera;

}

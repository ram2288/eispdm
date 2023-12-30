package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Aula;
import com.dev.eispdm.entidades.Categoria;
import com.dev.eispdm.entidades.EstadoEquipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipoDto {
    private Integer idEquipo;
    private String nomEquipo;
    private String serie;
    private String Descripcion;
    private String Observacion;
    private LocalDateTime fechaCompra;
    private LocalDateTime fechaCreado;
    private Categoria categoria;
    private Aula aula;
    private EstadoEquipo estadoEquipo;
}

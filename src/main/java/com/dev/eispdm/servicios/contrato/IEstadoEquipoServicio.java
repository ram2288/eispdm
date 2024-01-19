package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.EstadoEquipoDto;
import com.dev.eispdm.dtos.EstudianteDto;

import java.util.List;

public interface IEstadoEquipoServicio {
    List<EstadoEquipoDto> listarEstadoEquipo();
    EstadoEquipoDto buscarEstadoEquipoId(Integer id);
    EstadoEquipoDto guardarEstadoEquipo(EstadoEquipoDto estadoEquipoDto);
    void eliminarEstadoEquipo(Integer id);
}

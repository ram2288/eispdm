package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.EquipoDto;
import com.dev.eispdm.entidades.Equipo;

import java.util.List;

public interface IEquipoServicio {
    List<EquipoDto> listarEquipos();
    EquipoDto buscarEquipoId(Integer id);
    EquipoDto guardarEquipo(EquipoDto equipoDto);
    void eliminarEquipo(Integer id);
}

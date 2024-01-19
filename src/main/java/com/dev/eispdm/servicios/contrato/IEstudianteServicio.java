package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.EstudianteDto;

import java.util.List;

public interface IEstudianteServicio {
    List<EstudianteDto> listarEstudiante();
    EstudianteDto buscarEstudianteId(Integer id);
    EstudianteDto guardarestudiante(EstudianteDto estudianteDto);
    void eliminarEstudiante(Integer id);
}

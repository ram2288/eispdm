package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.entidades.Carrera;

import java.util.List;

public interface ICarreraServicio {
    List<CarreraDto> ListarCarreras();
    List<CarreraDto> listarCarrerasAscendente(String carrera);
    List<CarreraDto> listarCarrerasContengan(String carrera);
    CarreraDto buscarCarreraId(Integer id);
    CarreraDto buscarCarreraNombre(String carrera);
    CarreraDto guardarCarrera(CarreraDto carreraDto);
    void eliminarCarreraId(Integer id);
}

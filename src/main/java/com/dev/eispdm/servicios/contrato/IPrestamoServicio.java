package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.PrestamoDto;

import java.util.List;

public interface IPrestamoServicio {
    List<PrestamoDto> listarPrestamo();
    PrestamoDto buscarPrestamoId(Integer id);
    PrestamoDto guardarPrestamo(PrestamoDto prestamoDto);
    void eliminarPrestamo(Integer id);
}

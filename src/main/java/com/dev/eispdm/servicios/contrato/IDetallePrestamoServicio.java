package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.dtos.DetallePrestamoDto;

import java.util.List;

public interface IDetallePrestamoServicio {
    List<DetallePrestamoDto> ListarDetallePrestamos();
    DetallePrestamoDto buscarDetallePrestamoId(Integer id);
    DetallePrestamoDto guardarDetallePrestamo(DetallePrestamoDto detallePrestamoDto);
    void eliminarDetallePrestamoId(Integer id);
}

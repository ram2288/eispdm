package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.DetallePrestamoDto;
import com.dev.eispdm.entidades.DetallePrestamo;
import com.dev.eispdm.mappers.DetallePrestamoMapper;
import com.dev.eispdm.repositorios.DetallePrestamoRepository;
import com.dev.eispdm.servicios.contrato.IDetallePrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class
DetallePrestamoServicio implements IDetallePrestamoServicio {
    @Autowired
    private DetallePrestamoRepository detallePrestamoRepository;
    @Autowired
    private DetallePrestamoMapper detallePrestamoMapper;
    @Override
    public List<DetallePrestamoDto> ListarDetallePrestamos() {
        List<DetallePrestamo> detallePrestamo=detallePrestamoRepository.findAll();
        List<DetallePrestamoDto> detallePrestamoDtos= detallePrestamoMapper.DetallePrestamosToDetallePrestamoDtos(detallePrestamo);
        return detallePrestamoDtos;
    }
    @Override
    public DetallePrestamoDto buscarDetallePrestamoId(Integer id) {
        DetallePrestamo detallePrestamo= detallePrestamoRepository.findById(id).orElse(null);
        DetallePrestamoDto detallePrestamoDto= detallePrestamoMapper.detallePrestamoToDetallePrestamoDto(detallePrestamo);
        return detallePrestamoDto;
    }

    @Override
    public DetallePrestamoDto guardarDetallePrestamo(DetallePrestamoDto detallePrestamoDto) {
        DetallePrestamo detallePrestamo= detallePrestamoMapper.DetallePrestamoDtoToDetallePrestamo(detallePrestamoDto);
        this.detallePrestamoRepository.save(detallePrestamo);
        return detallePrestamoDto;
    }

    @Override
    public void eliminarDetallePrestamoId(Integer id) {
        this.detallePrestamoRepository.deleteById(id);
    }
}

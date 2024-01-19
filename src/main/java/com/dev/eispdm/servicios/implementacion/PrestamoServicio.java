package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.PrestamoDto;
import com.dev.eispdm.mappers.PrestamoMapper;
import com.dev.eispdm.repositorios.PrestamoRepository;
import com.dev.eispdm.servicios.contrato.IPrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServicio implements IPrestamoServicio {
    @Autowired
    private PrestamoRepository prestamoRepository;
    @Autowired
    private PrestamoMapper prestamoMapper;

    @Override
    public List<PrestamoDto> listarPrestamo() {
        return prestamoMapper.PrestamosToPrestamoDtos(prestamoRepository.findAll());
    }

    @Override
    public PrestamoDto buscarPrestamoId(Integer id) {
        return prestamoMapper.prestamoToPrestamoDto(prestamoRepository.findById(id).orElse(null));
    }

    @Override
    public PrestamoDto guardarPrestamo(PrestamoDto prestamoDto) {
        prestamoRepository.save(prestamoMapper.PrestamoDtoToPrestamo(prestamoDto));
        return prestamoDto;
    }

    @Override
    public void eliminarPrestamo(Integer id) {
        prestamoRepository.deleteById(id);
    }
}

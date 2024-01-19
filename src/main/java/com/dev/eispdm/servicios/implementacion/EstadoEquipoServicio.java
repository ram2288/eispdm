package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.EstadoEquipoDto;
import com.dev.eispdm.entidades.EstadoEquipo;
import com.dev.eispdm.mappers.EstadoEquipoMapper;
import com.dev.eispdm.repositorios.EstadoEquipoRepository;
import com.dev.eispdm.servicios.contrato.IEstadoEquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadoEquipoServicio implements IEstadoEquipoServicio {
    @Autowired
    private EstadoEquipoRepository estadoEquipoRepository;
    @Autowired
    private EstadoEquipoMapper estadoEquipoMapper;
    @Override
    public List<EstadoEquipoDto> listarEstadoEquipo() {
        List<EstadoEquipo> estadoEquipos= estadoEquipoRepository.findAll();
        List<EstadoEquipoDto> estadoEquipoDtos= estadoEquipoMapper.EstadoEquiposToEstadoEquipoDtos(estadoEquipos);
        return estadoEquipoDtos;
    }

    @Override
    public EstadoEquipoDto buscarEstadoEquipoId(Integer id) {
        EstadoEquipo estadoEquipo = estadoEquipoRepository.findById(id).orElse(null);
        EstadoEquipoDto estadoEquipoDto = estadoEquipoMapper.estadoEquipoToEstadoEquipoDto(estadoEquipo);
        return estadoEquipoDto;
    }

    @Override
    public EstadoEquipoDto guardarEstadoEquipo(EstadoEquipoDto estadoEquipoDto) {
        EstadoEquipo estadoEquipo= estadoEquipoMapper.EstadoEquipoDtoToEstadoEquipo(estadoEquipoDto);
        estadoEquipoRepository.save(estadoEquipo);
        return estadoEquipoDto;
    }

    @Override
    public void eliminarEstadoEquipo(Integer id) {
        estadoEquipoRepository.deleteById(id);
    }
}

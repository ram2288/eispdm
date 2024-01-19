package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.EquipoDto;
import com.dev.eispdm.entidades.Equipo;
import com.dev.eispdm.mappers.EquipoMapper;
import com.dev.eispdm.repositorios.EquipoRepository;
import com.dev.eispdm.servicios.contrato.IEquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServicio implements IEquipoServicio {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private EquipoMapper equipoMapper;
    @Override
    public List<EquipoDto> listarEquipos() {
        List<Equipo> equipos = equipoRepository.findAll();
        List<EquipoDto> equipoDtos = equipoMapper.EquiposToEquipoDtos(equipos);
        return equipoDtos;
    }

    @Override
    public EquipoDto buscarEquipoId(Integer id) {
        Equipo equipo = equipoRepository.findById(id).orElse(null);
        EquipoDto equipoDto= equipoMapper.equipoToEquipoDto(equipo);
        return equipoDto;
    }

    @Override
    public EquipoDto guardarEquipo(EquipoDto equipoDto) {
        Equipo equipo= equipoMapper.EquipoDtoToEquipo(equipoDto);
        equipoRepository.save(equipo);
        return equipoDto;
    }

    @Override
    public void eliminarEquipo(Integer id) {
        equipoRepository.deleteById(id);
    }
}

package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.RolDto;
import com.dev.eispdm.mappers.RolMapper;
import com.dev.eispdm.repositorios.RolRepository;
import com.dev.eispdm.servicios.contrato.IRolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class RolServicio implements IRolServicio {
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private RolMapper rolMapper;
    @Override
    public List<RolDto> listarRol() {
        return rolMapper.RolsToRolDtos(rolRepository.findAll());
    }

    @Override
    public RolDto buscarRolId(Integer id) {
        return rolMapper.rolToRolDto(rolRepository.findById(id).orElse(null));
    }

    @Override
    public RolDto guardarRol(RolDto rolDto) {
        rolRepository.save(rolMapper.RolDtoToRol(rolDto));
        return rolDto;
    }

    @Override
    public void eliminaRol(Integer id) {
        rolRepository.deleteById(id);
    }
}

package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.MateriaDto;
import com.dev.eispdm.mappers.MateriaMapper;
import com.dev.eispdm.repositorios.MateriaRepository;
import com.dev.eispdm.servicios.contrato.IMateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class MateriaServicio implements IMateriaServicio {
    @Autowired
    private MateriaRepository materiaRepository;
    @Autowired
    private MateriaMapper materiaMapper;
    @Override
    public List<MateriaDto> listarMateria() {
        return materiaMapper.MateriasToMateriaDtos(materiaRepository.findAll());
    }

    @Override
    public MateriaDto buscarMateriaId(Integer id) {
        return materiaMapper.materiaToMateriaDto(materiaRepository.findById(id).orElse(null));
    }

    @Override
    public MateriaDto guardarMateria(MateriaDto materiaDto) {
        materiaRepository.save(materiaMapper.MateriaDtoToMateria(materiaDto));
        return materiaDto;
    }

    @Override
    public void eliminarMateria(Integer id) {
        materiaRepository.deleteById(id);
    }
}

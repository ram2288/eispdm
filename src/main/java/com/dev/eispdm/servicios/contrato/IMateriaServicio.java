package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.MateriaDto;

import java.util.List;

public interface IMateriaServicio {
    List<MateriaDto> listarMateria();
    MateriaDto buscarMateriaId(Integer id);
    MateriaDto guardarMateria(MateriaDto materiaDto);
    void eliminarMateria(Integer id);
}

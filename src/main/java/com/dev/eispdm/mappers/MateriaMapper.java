package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.entidades.Estudiante;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Materia;
import com.dev.eispdm.dtos.MateriaDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {CarreraMapper.class})
public interface MateriaMapper {
    /**
     *  ClassLoader 加载方式
     */
    MateriaMapper INSTANCE = Mappers.getMapper(MateriaMapper.class);


    @Mappings({})
    MateriaDto materiaToMateriaDto(Materia source);
    Materia MateriaDtoToMateria(MateriaDto source);
    List<MateriaDto> MateriasToMateriaDtos(List<Materia> source);
    List<Materia> MateriaDtosToMaterias(List<MateriaDto> source);
}


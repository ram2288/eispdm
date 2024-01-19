package com.dev.eispdm.mappers;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Estudiante;
import com.dev.eispdm.dtos.EstudianteDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {CarreraMapper.class})
public interface EstudianteMapper {
    /**
     *  ClassLoader 加载方式
     */
    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);


    @Mappings({})
    EstudianteDto estudianteToEstudianteDto(Estudiante source);
    Estudiante EstudianteDtoToEstudiante(EstudianteDto source);
    List<EstudianteDto> EstudiantesToEstudianteDtos(List<Estudiante> source);
    List<Estudiante> EstudianteDtosToEstudiantes(List<EstudianteDto> source);
}


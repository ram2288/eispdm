package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.entidades.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.EstadoEquipo;
import com.dev.eispdm.dtos.EstadoEquipoDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EstadoEquipoMapper {
    /**
     *  ClassLoader 加载方式
     */
    EstadoEquipoMapper INSTANCE = Mappers.getMapper(EstadoEquipoMapper.class);


    @Mappings({})
    EstadoEquipoDto estadoEquipoToEstadoEquipoDto(EstadoEquipo source);
    EstadoEquipo EstadoEquipoDtoToEstadoEquipo(EstadoEquipoDto source);

    List<EstadoEquipoDto> EstadoEquiposToEstadoEquipoDtos(List<EstadoEquipo> source);

    List<EstadoEquipo> EstadoEquipoDtosToEstadoEquipos(List<EstadoEquipoDto> source);
}


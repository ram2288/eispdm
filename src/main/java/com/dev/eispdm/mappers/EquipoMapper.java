package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.entidades.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Equipo;
import com.dev.eispdm.dtos.EquipoDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {CategoriaMapper.class, AulaMapper.class,EstadoEquipoMapper.class})
public interface EquipoMapper {
    /**
     *  ClassLoader 加载方式
     */
    EquipoMapper INSTANCE = Mappers.getMapper(EquipoMapper.class);


    @Mappings({
            @Mapping(source = "descripcion",target = "Descripcion"),
            @Mapping(source = "observacion",target = "Observacion")
    })
    EquipoDto equipoToEquipoDto(Equipo source);
    Equipo EquipoDtoToEquipo(EquipoDto source);

    List<EquipoDto> EquiposToEquipoDtos(List<Equipo> source);

    List<Equipo> EquipoDtosToEquipos(List<EquipoDto> source);
}


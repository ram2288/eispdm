package com.dev.eispdm.mappers;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Equipo;
import com.dev.eispdm.dtos.EquipoDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EquipoMapper {
    /**
     *  ClassLoader 加载方式
     */
    EquipoMapper INSTANCE = Mappers.getMapper(EquipoMapper.class);


    @Mappings({})
    EquipoDto equipoToEquipoDto(Equipo source);
    @Mappings({})
    Equipo equipoDtoToEquipo(EquipoDto source);
    @Mappings({})
    List<Equipo> equiposDtosToEquipos(List<EquipoDto> source);
    @Mappings({})
    List<EquipoDto> equiposToEquipoDtos(List<Equipo> source);


}


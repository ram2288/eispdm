package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.entidades.Estudiante;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Rol;
import com.dev.eispdm.dtos.RolDto;

import javax.xml.transform.Source;
import java.util.List;


@Mapper(componentModel = "spring")
public interface RolMapper {
    /**
     *  ClassLoader 加载方式
     */
    RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);


    @Mappings({
            @Mapping(source = "rol",target = "rol")
    })
    RolDto rolToRolDto(Rol source);
    Rol RolDtoToRol(RolDto source);
    List<RolDto> RolsToRolDtos(List<Rol> source);
    List<Rol> RolDtosToRols(List<RolDto> source);
}


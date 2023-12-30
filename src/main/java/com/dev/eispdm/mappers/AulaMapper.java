package com.dev.eispdm.mappers;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Aula;
import com.dev.eispdm.dtos.AulaDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface AulaMapper {
    /**
     *  ClassLoader 加载方式
     */
    AulaMapper INSTANCE = Mappers.getMapper(AulaMapper.class);


    @Mappings({})
    List<AulaDto> AulaToAulaDtos(List<Aula> aulas);
    @Mappings({})
    List<Aula> AulaDtosToAula(List<AulaDto> aulas);

    @Mappings({})
    AulaDto aulaToAulaDto(Aula source);
    @Mappings({})
    Aula aulaDtoToAula(AulaDto source);
}


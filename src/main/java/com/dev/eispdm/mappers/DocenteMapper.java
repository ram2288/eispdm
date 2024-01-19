package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.entidades.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Docente;
import com.dev.eispdm.dtos.DocenteDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = CarreraMapper.class)
public interface DocenteMapper {
    /**
     *  ClassLoader 加载方式
     */
    DocenteMapper INSTANCE = Mappers.getMapper(DocenteMapper.class);


    @Mappings({})
    DocenteDto docenteToDocenteDto(Docente source);
    Docente DocenteDtoToDocente(DocenteDto source);

    List<DocenteDto> DocentesToDocenteDtos(List<Docente> source);

    List<Docente> DocenteDtosToDocentes(List<DocenteDto> source);
}


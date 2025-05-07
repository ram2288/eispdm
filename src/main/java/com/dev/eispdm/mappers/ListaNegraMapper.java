package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.entidades.Aula;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.ListaNegra;
import com.dev.eispdm.dtos.ListaNegraDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ListaNegraMapper {
    /**
     *  ClassLoader 加载方式
     */
    ListaNegraMapper INSTANCE = Mappers.getMapper(ListaNegraMapper.class);


    @Mappings({})
    ListaNegraDto listaNegraToListaNegraDto(ListaNegra listaNegra);
    @Mappings({})
    List<ListaNegra> ListaNegraDtosToListaNegra(List<ListaNegraDto> listaNegraDtos);
    @Mappings({})
    List< ListaNegraDto> ListaNegraToListaNegraDto(List<ListaNegra> listaNegra);
    @Mappings({})
    ListaNegra ListaNegraDtoToListaNegra(ListaNegraDto listaNegraDto);


}


package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.entidades.Carrera;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Categoria;
import com.dev.eispdm.dtos.CategoriaDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    /**
     *  ClassLoader 加载方式
     */
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);


    @Mappings({})
    CategoriaDto categoriaToCategoriaDto(Categoria source);
    Categoria CategoriaDtoToCategoria(CategoriaDto source);

    List<CategoriaDto> CategoriasToCategoriaDtos(List<Categoria> source);

    List<Categoria> CategoriaDtosToCategorias(List<CategoriaDto> source);
}


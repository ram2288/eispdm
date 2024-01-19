package com.dev.eispdm.mappers;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Carrera;
import com.dev.eispdm.dtos.CarreraDto;

import java.util.List;


@Mapper(componentModel = "spring", uses = {
        CategoriaMapper.class})
public interface CarreraMapper {
    /**
     *  ClassLoader 加载方式
     */
    CarreraMapper INSTANCE = Mappers.getMapper(CarreraMapper.class);


    @Mappings({})
    CarreraDto carreraToCarreraDto(Carrera source);
    Carrera CarreraDtoToCarrera(CarreraDto source);

    List<CarreraDto> CarrerasToCarreraDtos(List<Carrera> source);

    List<Carrera> CarreraDtosToCarreras(List<CarreraDto> source);

}


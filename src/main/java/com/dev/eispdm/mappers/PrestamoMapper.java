package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.entidades.Estudiante;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Prestamo;
import com.dev.eispdm.dtos.PrestamoDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {EstadoEquipoMapper.class,MateriaMapper.class, DocenteMapper.class, UsuarioMapper.class})
public interface PrestamoMapper {
    /**
     *  ClassLoader 加载方式
     */
    PrestamoMapper INSTANCE = Mappers.getMapper(PrestamoMapper.class);


    @Mappings({})
    PrestamoDto prestamoToPrestamoDto(Prestamo source);
    Prestamo PrestamoDtoToPrestamo(PrestamoDto source);
    List<PrestamoDto> PrestamosToPrestamoDtos(List<Prestamo> source);
    List<Prestamo> PrestamoDtosToPrestamos(List<PrestamoDto> source);
}


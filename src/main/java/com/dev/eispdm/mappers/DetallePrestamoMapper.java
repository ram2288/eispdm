package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.entidades.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.DetallePrestamo;
import com.dev.eispdm.dtos.DetallePrestamoDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {EquipoMapper.class,PrestamoMapper.class})
public interface DetallePrestamoMapper {
    /**
     *  ClassLoader 加载方式
     */
    DetallePrestamoMapper INSTANCE = Mappers.getMapper(DetallePrestamoMapper.class);


    @Mappings({})
    DetallePrestamoDto detallePrestamoToDetallePrestamoDto(DetallePrestamo source);
    DetallePrestamo DetallePrestamoDtoToDetallePrestamo(DetallePrestamoDto source);

    List<DetallePrestamoDto> DetallePrestamosToDetallePrestamoDtos(List<DetallePrestamo> source);

    List<DetallePrestamo> DetallePrestamoDtosToDetallePrestamos(List<DetallePrestamoDto> source);
}


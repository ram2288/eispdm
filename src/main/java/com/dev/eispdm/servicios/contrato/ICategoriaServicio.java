package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.dtos.CategoriaDto;

import java.util.List;

public interface ICategoriaServicio {
    List<CategoriaDto> ListarCategorias();
    CategoriaDto buscarCategoriaId(Integer id);
    CategoriaDto guardarCategoria(CategoriaDto categoriaDto);
    void eliminarCategoriaId(Integer id);
}

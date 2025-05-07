package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.ListaNegraDto;
import com.dev.eispdm.dtos.PrestamoDto;

import java.util.List;

public interface IListaNegraServicio {

    List<ListaNegraDto> listarListaNegra();
    ListaNegraDto buscarListaNegraId(Integer id);
    ListaNegraDto guardarListaNegra(ListaNegraDto listaNegraDto);
    void eliminarListaNegra(Integer id);
}

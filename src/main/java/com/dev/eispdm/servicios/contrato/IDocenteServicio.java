package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.DocenteDto;

import java.util.List;

public interface IDocenteServicio {
    List<DocenteDto> ListaDocente();
    DocenteDto buscarDocenteID(Integer id);
    DocenteDto guardarDocente(DocenteDto docenteDto);
    void eliminarDocente(Integer id);
}

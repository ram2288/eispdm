package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.entidades.Aula;

import java.util.List;

public interface IAulaServicio {
    List<AulaDto> listarAulas();
    List<AulaDto> listarAulasAscendente(String aulas);
    List<AulaDto> listarAulasContengan(String aulas);
    AulaDto buscarAulaId(Integer idAula);
    AulaDto buscarAulaNombre(String aula);
    AulaDto guardarAula(AulaDto aulaDto);
    void eliminarAulaId(Integer idAula);
}

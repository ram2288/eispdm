package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.RolDto;

import java.util.List;

public interface IRolServicio {
    List<RolDto> listarRol();
    RolDto buscarRolId(Integer id);
    RolDto guardarRol(RolDto rolDto);
    void eliminaRol(Integer id);
}

package com.dev.eispdm.servicios.contrato;

import com.dev.eispdm.dtos.UsuarioDto;

import java.util.List;

public interface IUsuarioServicio {
    List<UsuarioDto> listarUsuario();
    UsuarioDto buscarUsuarioId(Integer id);
    UsuarioDto guardarUsuario(UsuarioDto usuarioDto);
    void eliminaUsuario(Integer id);
}

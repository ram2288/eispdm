package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.UsuarioDto;
import com.dev.eispdm.mappers.UsuarioMapper;
import com.dev.eispdm.repositorios.UsuarioRepository;
import com.dev.eispdm.servicios.contrato.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UsuarioServicio implements IUsuarioServicio {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioMapper usuarioMapper;
    @Override
    public List<UsuarioDto> listarUsuario() {
        return usuarioMapper.UsuariosToUsuarioDtos(usuarioRepository.findAll());
    }

    @Override
    public UsuarioDto buscarUsuarioId(Integer id) {
        return usuarioMapper.usuarioToUsuarioDto(usuarioRepository.findById(id).orElse(null));
    }

    @Override
    public UsuarioDto guardarUsuario(UsuarioDto usuarioDto) {
        usuarioRepository.save(usuarioMapper.UsuarioDtoToUsuario(usuarioDto));
        return usuarioDto;
    }

    @Override
    public void eliminaUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}

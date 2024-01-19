package com.dev.eispdm.mappers;

import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.entidades.Estudiante;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.dev.eispdm.entidades.Usuario;
import com.dev.eispdm.dtos.UsuarioDto;

import java.util.List;


@Mapper(componentModel = "spring",uses = {RolMapper.class, CarreraMapper.class})
public interface UsuarioMapper {
    /**
     *  ClassLoader 加载方式
     */
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);


    @Mappings({})
    UsuarioDto usuarioToUsuarioDto(Usuario source);
    Usuario UsuarioDtoToUsuario(UsuarioDto source);
    List<UsuarioDto> UsuariosToUsuarioDtos(List<Usuario> source);
    List<Usuario> UsuarioDtosToUsuarios(List<UsuarioDto> source);
}


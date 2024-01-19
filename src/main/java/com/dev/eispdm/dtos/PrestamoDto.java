package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Docente;
import com.dev.eispdm.entidades.Estudiante;
import com.dev.eispdm.entidades.Materia;
import com.dev.eispdm.entidades.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrestamoDto implements Serializable {
    private  Integer idPrestamo;
    private LocalDateTime fePrestamos;
    private LocalDateTime feDevolucion;
    private EstudianteDto estudiante;
    private MateriaDto materia;
    private DocenteDto docente;
    private UsuarioDto usuario;
}

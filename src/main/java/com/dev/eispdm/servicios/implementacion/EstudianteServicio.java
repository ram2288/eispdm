package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.EquipoDto;
import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.entidades.Estudiante;
import com.dev.eispdm.mappers.EstadoEquipoMapper;
import com.dev.eispdm.mappers.EstudianteMapper;
import com.dev.eispdm.repositorios.EstudianteRepository;
import com.dev.eispdm.servicios.contrato.IEquipoServicio;
import com.dev.eispdm.servicios.contrato.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EstudianteServicio implements IEstudianteServicio {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private EstudianteMapper estudianteMapper;

    @Override
    public List<EstudianteDto> listarEstudiante() {
        List<Estudiante> estudiantes= estudianteRepository.findAll();
        List<EstudianteDto> estudianteDtos= estudianteMapper.EstudiantesToEstudianteDtos(estudiantes);
        return estudianteDtos;
    }

    @Override
    public EstudianteDto buscarEstudianteId(Integer id) {
        Estudiante estudiante= estudianteRepository.findById(id).orElse(null);
        EstudianteDto estudianteDto= estudianteMapper.estudianteToEstudianteDto(estudiante);
        return estudianteDto;
    }

    @Override
    public EstudianteDto guardarestudiante(EstudianteDto estudianteDto) {
        Estudiante estudiante=estudianteMapper.EstudianteDtoToEstudiante(estudianteDto);
        estudianteRepository.save(estudiante);
        return estudianteDto;
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        estudianteRepository.deleteById(id);
    }
}

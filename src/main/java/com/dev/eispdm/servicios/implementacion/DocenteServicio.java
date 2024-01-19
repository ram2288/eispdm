package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.DocenteDto;
import com.dev.eispdm.entidades.Docente;
import com.dev.eispdm.mappers.DocenteMapper;
import com.dev.eispdm.repositorios.DocenteRepository;
import com.dev.eispdm.servicios.contrato.IDocenteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServicio implements IDocenteServicio {
    @Autowired
    private DocenteRepository docenteRepository;
    @Autowired
    private DocenteMapper docenteMapper;

    @Override
    public List<DocenteDto> ListaDocente() {
        List<Docente> docentes= docenteRepository.findAll();
        List<DocenteDto> docenteDtos= docenteMapper.DocentesToDocenteDtos(docentes);
        return docenteDtos;
    }

    @Override
    public DocenteDto buscarDocenteID(Integer id) {
        Docente docente= docenteRepository.findById(id).orElse(null);
        DocenteDto docenteDto= docenteMapper.docenteToDocenteDto(docente);
        return docenteDto;
    }

    @Override
    public DocenteDto guardarDocente(DocenteDto docenteDto) {
        Docente docente= docenteMapper.DocenteDtoToDocente(docenteDto);
        docenteRepository.save(docente);
        return docenteDto;
    }

    @Override
    public void eliminarDocente(Integer id) {
        docenteRepository.deleteById(id);
    }
}

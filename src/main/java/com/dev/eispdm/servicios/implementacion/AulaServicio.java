package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.entidades.Aula;
import com.dev.eispdm.mappers.AulaMapper;
import com.dev.eispdm.repositorios.AulaRepository;
import com.dev.eispdm.servicios.contrato.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AulaServicio implements IAulaServicio {
    @Autowired
    private AulaRepository aulaRepository;
    @Autowired
    private AulaMapper aulaMapper;
    //@Autowired
   // private Aula au;

    @Override
    public List<AulaDto> listarAulas() {

        List <Aula> aulaList = this.aulaRepository.findAll();
        List<AulaDto> aulaDto =  aulaMapper.AulaToAulaDtos(aulaList);
        return aulaDto;
        //return this.aulaRepository.findAll();
    }

    @Override
    public List<AulaDto> listarAulasAscendente(String aulas) {
        List <Aula> aulaAS = this.aulaRepository.findByAulaContainingOrderByAulaAsc(aulas);
        List<AulaDto> aulaDto =  aulaMapper.AulaToAulaDtos(aulaAS);
        return aulaDto;
    }

    @Override
    public List<AulaDto> listarAulasContengan(String aulas) {
        List <Aula> aula = this.aulaRepository.findByAulaContaining(aulas);
        List<AulaDto> aulaDto =  aulaMapper.AulaToAulaDtos(aula);
        return aulaDto;
    }

    @Override
    public AulaDto buscarAulaId(Integer idAula) {
        Aula aula= this.aulaRepository.findById(idAula).orElse(null);
        AulaDto aulaDto = aulaMapper.aulaToAulaDto(aula);
        return aulaDto;
    }
    @Override
    public AulaDto buscarAulaNombre(String nombre) {
        Aula aula= this.aulaRepository.findByAula(nombre).orElse(null);
        AulaDto aulaDto = aulaMapper.aulaToAulaDto(aula);
        return aulaDto;
    }
    @Override
    public AulaDto guardarAula(AulaDto aulaDto) {
        Aula aula = aulaMapper.aulaDtoToAula(aulaDto);
        this.aulaRepository.save(aula);
        return aulaDto;
    }

    @Override
    public void eliminarAulaId(Integer idAula) {

        this.aulaRepository.deleteById(idAula);
    }

}

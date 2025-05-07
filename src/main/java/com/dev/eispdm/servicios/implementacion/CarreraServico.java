package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.entidades.Carrera;
import com.dev.eispdm.mappers.CarreraMapper;
import com.dev.eispdm.repositorios.CarreraRepository;
import com.dev.eispdm.servicios.contrato.ICarreraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CarreraServico implements ICarreraServicio {

    @Autowired
    private CarreraRepository carreraRepository;
    @Autowired
    private CarreraMapper carreraMapper;
    @Override
    public List<CarreraDto> ListarCarreras() {
        List<Carrera> carreras = carreraRepository.findAll();
        List<CarreraDto>  carreraDto=this.carreraMapper.CarrerasToCarreraDtos(carreras);
        return carreraDto;
    }

    @Override
    public List<CarreraDto> listarCarrerasAscendente(String carrera) {
        List<Carrera> carreras = carreraRepository.findByCarreraContainingOrderByCarreraAsc(carrera);
        List<CarreraDto> carreraDtos= this.carreraMapper.CarrerasToCarreraDtos(carreras);
        return carreraDtos;
    }

    @Override
    public List<CarreraDto> listarCarrerasContengan(String carrera) {
        List<Carrera> carreras = carreraRepository.findByCarreraContaining(carrera);
        List<CarreraDto> carreraDtos= this.carreraMapper.CarrerasToCarreraDtos(carreras);
        return carreraDtos;
    }
    @Override
    public CarreraDto buscarCarreraId(Integer id) {
        Carrera carrera= this.carreraRepository.findById(id).orElse(null);
        CarreraDto carreraDto= carreraMapper.carreraToCarreraDto(carrera);
        return carreraDto;
    }

    @Override
    public CarreraDto buscarCarreraNombre(String carrera) {
        Carrera carrera1 = carreraRepository.findByCarrera(carrera).orElse(null);
        CarreraDto carreraDto= carreraMapper.carreraToCarreraDto(carrera1);
        return carreraDto;
    }

    @Override
    public CarreraDto guardarCarrera(CarreraDto carreraDto) {
        Carrera carrera = carreraMapper.CarreraDtoToCarrera(carreraDto);
        this.carreraRepository.save(carrera);
        return carreraDto;
    }

    @Override
    public void eliminarCarreraId(Integer id) {
        this.carreraRepository.deleteById(id);
    }
}

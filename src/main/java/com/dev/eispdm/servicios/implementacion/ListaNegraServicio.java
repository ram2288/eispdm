package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.ListaNegraDto;
import com.dev.eispdm.mappers.ListaNegraMapper;
import com.dev.eispdm.repositorios.ListaNegraRepository;
import com.dev.eispdm.servicios.contrato.IListaNegraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class ListaNegraServicio implements IListaNegraServicio {
    @Autowired
    private ListaNegraRepository listaNegraRepository;
    @Autowired
    private ListaNegraMapper listaNegraMapper;

    @Override
    public List<ListaNegraDto> listarListaNegra() {
        return listaNegraMapper.ListaNegraToListaNegraDto(listaNegraRepository.findAll());
    }

    @Override
    public ListaNegraDto buscarListaNegraId(Integer id) {
        return listaNegraMapper.listaNegraToListaNegraDto(listaNegraRepository.findById(id).orElse(null));
    }

    @Override
    public ListaNegraDto guardarListaNegra(ListaNegraDto listaNegraDto) {
        listaNegraRepository.save(listaNegraMapper.ListaNegraDtoToListaNegra(listaNegraDto));
        return listaNegraDto;
    }

    @Override
    public void eliminarListaNegra(Integer id) {
        listaNegraRepository.deleteById(id);
    }
}

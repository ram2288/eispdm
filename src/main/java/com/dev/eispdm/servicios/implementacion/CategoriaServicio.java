package com.dev.eispdm.servicios.implementacion;

import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.entidades.Categoria;
import com.dev.eispdm.mappers.CategoriaMapper;
import com.dev.eispdm.repositorios.CategoriaRepository;
import com.dev.eispdm.servicios.contrato.ICategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class CategoriaServicio implements ICategoriaServicio {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaMapper categoriaMapper;
    @Override
    public List<CategoriaDto> ListarCategorias() {
        List<Categoria> categorias = this.categoriaRepository.findAll();
        List<CategoriaDto> categoriaDtos = categoriaMapper.CategoriasToCategoriaDtos(categorias);
        return categoriaDtos;
    }

    @Override
    public CategoriaDto buscarCategoriaId(Integer id) {
        Categoria categoria= this.categoriaRepository.findById(id).orElse(null);
        CategoriaDto categoriaDto = categoriaMapper.categoriaToCategoriaDto(categoria);
        return categoriaDto;
    }

    @Override
    public CategoriaDto guardarCategoria(CategoriaDto categoriaDto) {
        Categoria categoria= categoriaMapper.CategoriaDtoToCategoria(categoriaDto);
        categoriaRepository.save(categoria);
        return categoriaDto;
    }

    @Override
    public void eliminarCategoriaId(Integer id) {
        this.categoriaRepository.deleteById(id);
    }
}

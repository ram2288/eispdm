package com.dev.eispdm.controladores;


import com.dev.eispdm.dtos.CategoriaDto;
import com.dev.eispdm.servicios.implementacion.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("prestamo-app")
@CrossOrigin(value = "http://localhost:4200")
public class CategoriaControlador {
    @Autowired
    private CategoriaServicio categoriaServicio;

    @GetMapping("/categoria")
    public ResponseEntity< List<CategoriaDto>> listaCategorias(){
        return new ResponseEntity<>(categoriaServicio.ListarCategorias(), HttpStatus.OK);
    }
    @PostMapping("/categoria")
    public ResponseEntity<CategoriaDto> agregarCategoria (@RequestBody CategoriaDto categoriaDto){
        return new ResponseEntity<>(categoriaServicio.guardarCategoria(categoriaDto),HttpStatus.OK);
    }
    @GetMapping("/categoria/{id}")
    public ResponseEntity<CategoriaDto> optenerCategoriaId(@PathVariable int id){
        CategoriaDto categoriaDto= this.categoriaServicio.buscarCategoriaId(id);
        return ResponseEntity.ok(categoriaDto);
    }
    @DeleteMapping("categoria/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarCategoria(@PathVariable int id){
        this.categoriaServicio.eliminarCategoriaId(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

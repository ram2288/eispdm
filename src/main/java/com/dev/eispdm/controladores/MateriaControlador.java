package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.MateriaDto;
import com.dev.eispdm.servicios.implementacion.MateriaServicio;
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
public class MateriaControlador {
    @Autowired
    private MateriaServicio materiaServicio;
    @GetMapping("/materia")
    public ResponseEntity< List<MateriaDto>> listarMateria(){
        return new ResponseEntity<>(materiaServicio.listarMateria(), HttpStatus.OK);
    }
    @PostMapping("/materia")
    public ResponseEntity< MateriaDto> guardarMateria(@RequestBody MateriaDto materiaDto){
        return new ResponseEntity<>(materiaServicio.guardarMateria(materiaDto), HttpStatus.CREATED);
    }
    @GetMapping("/materia/{id}")
    public ResponseEntity< MateriaDto> buscarMateriaId(@PathVariable Integer id){
        return new ResponseEntity<>(materiaServicio.buscarMateriaId(id), HttpStatus.OK);
    }
    @DeleteMapping("materia/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarMateria(@PathVariable Integer id){
        materiaServicio.eliminarMateria(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

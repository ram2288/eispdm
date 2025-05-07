package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.EstadoEquipoDto;
import com.dev.eispdm.servicios.implementacion.EstadoEquipoServicio;
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
public class EstadoEquipoControlador {
    @Autowired
    private  EstadoEquipoServicio estadoEquipoServicio;
    @GetMapping("/estadoEquipo")
    public ResponseEntity< List<EstadoEquipoDto>> listaEstadoEquipo(){
        return new ResponseEntity<>(estadoEquipoServicio.listarEstadoEquipo(), HttpStatus.OK);
    }
    @PostMapping("/estadoEquipo")
    public ResponseEntity< EstadoEquipoDto> guardarEstadoEquipo(@RequestBody EstadoEquipoDto estadoEquipoDto){
        return new ResponseEntity<>(estadoEquipoServicio.guardarEstadoEquipo(estadoEquipoDto),HttpStatus.OK);
    }
    @GetMapping("/estudiante/{id}")
    public ResponseEntity< EstadoEquipoDto> buscarEstadoEquipoId(@PathVariable Integer id){
        return new ResponseEntity<>(estadoEquipoServicio.buscarEstadoEquipoId(id),HttpStatus.OK);
    }
    @DeleteMapping("estadoEquipo/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEstadoEquipo(@PathVariable Integer id){
        estadoEquipoServicio.eliminarEstadoEquipo(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

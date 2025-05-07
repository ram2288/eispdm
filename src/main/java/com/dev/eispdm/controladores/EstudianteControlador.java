package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.EstudianteDto;
import com.dev.eispdm.servicios.implementacion.EstudianteServicio;
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
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio estudianteServicio;
    @GetMapping("/estudiante")
    public ResponseEntity< List<EstudianteDto>> listarEstudiante(){
        return new ResponseEntity<>(estudianteServicio.listarEstudiante(), HttpStatus.OK);
    }
    @PostMapping("/estudiante")
    public ResponseEntity< EstudianteDto> guardarEstudiante(@RequestBody EstudianteDto estudianteDto){
        return new ResponseEntity<>(estudianteServicio.guardarestudiante(estudianteDto),HttpStatus.OK);
    }
    @GetMapping("/estudiantes/{id}")
    public ResponseEntity< EstudianteDto> buscarEstudianteId(@PathVariable Integer id){
        return new ResponseEntity<>(estudianteServicio.buscarEstudianteId(id),HttpStatus.OK);
    }
    @DeleteMapping("estudiante/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEstudiante(@PathVariable Integer id){
        estudianteServicio.eliminarEstudiante(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.RolDto;
import com.dev.eispdm.servicios.implementacion.RolServicio;
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
public class RolControlador {
    @Autowired
    private RolServicio rolServicio;
    @GetMapping("/rol")
    public ResponseEntity< List<RolDto>> listarRol(){
        return new ResponseEntity<>(rolServicio.listarRol(), HttpStatus.OK);
    }
    @PostMapping("/rol")
    public ResponseEntity< RolDto> guardarRol(@RequestBody RolDto rolDto){
        return new ResponseEntity<>(rolServicio.guardarRol(rolDto), HttpStatus.CREATED);
    }
    @GetMapping("/rol/{id}")
    public ResponseEntity< RolDto> buscarRolId(@PathVariable Integer id){
        return new ResponseEntity<>(rolServicio.buscarRolId(id), HttpStatus.OK);
    }
    @DeleteMapping("rol/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarRol(@PathVariable Integer id){
        rolServicio.eliminaRol(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.DocenteDto;
import com.dev.eispdm.dtos.EquipoDto;
import com.dev.eispdm.servicios.implementacion.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("prestamo-app")
@CrossOrigin(value = "http://localhost:4200")
public class EquipoControlador {
    @Autowired
    private EquipoServicio equipoServicio;
    @GetMapping("/equipo")
    public List<EquipoDto> listarEquipos(){
        return equipoServicio.listarEquipos();
    }
    @PostMapping("/equipo")
    public EquipoDto guardarEquipo(@RequestBody EquipoDto equipoDto){
        return equipoServicio.guardarEquipo(equipoDto);
    }
    @GetMapping("/equipo/{id}")
    public ResponseEntity<EquipoDto> buscarEquipoId(@PathVariable Integer id){
        return ResponseEntity.ok(equipoServicio.buscarEquipoId(id));
    }
    @DeleteMapping("equipo/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEquipo(@PathVariable Integer id){
        equipoServicio.eliminarEquipo(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

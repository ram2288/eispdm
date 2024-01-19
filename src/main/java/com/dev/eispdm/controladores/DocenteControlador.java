package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.DetallePrestamoDto;
import com.dev.eispdm.dtos.DocenteDto;
import com.dev.eispdm.servicios.implementacion.DocenteServicio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("prestamo-app")
@CrossOrigin(value = "http://localhost:4200")
public class DocenteControlador {
    @Autowired
    private DocenteServicio docenteServicio;
    @GetMapping("/docente")
    public List<DocenteDto> listarDocentes(){
        return docenteServicio.ListaDocente();
    }
    @PostMapping("/docente")
    public DocenteDto guardarDocente(@RequestBody DocenteDto docenteDto){
        return docenteServicio.guardarDocente(docenteDto);
    }
    @GetMapping("/docente{id}")
    public ResponseEntity<DocenteDto> buscarDocenteID(@PathVariable Integer id){
        return  ResponseEntity.ok(docenteServicio.buscarDocenteID(id));
    }
    @DeleteMapping("docente/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarDocente(@PathVariable Integer id){
        docenteServicio.eliminarDocente(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

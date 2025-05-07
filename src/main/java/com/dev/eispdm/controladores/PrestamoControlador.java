package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.PrestamoDto;
import com.dev.eispdm.servicios.implementacion.PrestamoServicio;
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
public class PrestamoControlador {
    @Autowired
    private PrestamoServicio prestamoServicio;
    @GetMapping("/prestamo")
    public ResponseEntity< List<PrestamoDto>> listarPrestamos(){
        return new ResponseEntity<>(prestamoServicio.listarPrestamo(), HttpStatus.OK);
    }
    @PostMapping("/prestamo")
    public ResponseEntity< PrestamoDto> guardarPrestamo(@RequestBody PrestamoDto prestamoDto){
        return new ResponseEntity<>(prestamoServicio.guardarPrestamo(prestamoDto), HttpStatus.CREATED);
    }
    @GetMapping("/prestamo/{id}")
    public ResponseEntity< PrestamoDto> buscarPrestamoId(@PathVariable Integer id){
        return new ResponseEntity<>(prestamoServicio.buscarPrestamoId(id), HttpStatus.OK);
    }
    @DeleteMapping("prestamo/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarPrestamo(@PathVariable Integer id){
        prestamoServicio.eliminarPrestamo(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

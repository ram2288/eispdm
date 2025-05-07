package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.dtos.DetallePrestamoDto;
import com.dev.eispdm.servicios.implementacion.CarreraServico;
import com.dev.eispdm.servicios.implementacion.DetallePrestamoServicio;
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
public class DetallePrestamoControlador {
    @Autowired
    private DetallePrestamoServicio detallePrestamoServicio;


    @GetMapping("/detallePrestamo")
    public ResponseEntity< List<DetallePrestamoDto>> listaDetallePrestamo(){
        return new ResponseEntity<>(detallePrestamoServicio.ListarDetallePrestamos(), HttpStatus.OK);
    }
    @PostMapping("/detallePrestamo")
    public ResponseEntity<DetallePrestamoDto> agregarDetallePrestamo (@RequestBody DetallePrestamoDto detallePrestamoDto){
        return new ResponseEntity<>(detallePrestamoServicio.guardarDetallePrestamo(detallePrestamoDto),HttpStatus.OK);
    }
    @GetMapping("/detallePrestamo/{id}")
    public ResponseEntity<DetallePrestamoDto> buscarDetallePrestamoId(@PathVariable int id){
        DetallePrestamoDto detallePrestamoDto= this.detallePrestamoServicio.buscarDetallePrestamoId(id);
        return ResponseEntity.ok(detallePrestamoDto);
    }
    @DeleteMapping("detallePrestamo/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarDetallePrestamo(@PathVariable int id){
        this.detallePrestamoServicio.eliminarDetallePrestamoId(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

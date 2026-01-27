package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.CarreraDto;
import com.dev.eispdm.servicios.implementacion.CarreraServico;
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
public class CarreraControlador {
    @Autowired
    private CarreraServico carreraServico;


    @GetMapping("/carrera")
    public ResponseEntity<List<CarreraDto>> listaCarrera() {
        return new ResponseEntity(carreraServico.ListarCarreras(), HttpStatus.OK);
    }

    @PostMapping("/carrera")
    public ResponseEntity<CarreraDto> agregarCarrera(@RequestBody CarreraDto carreraDto) {
        return new ResponseEntity<>(carreraServico.guardarCarrera(carreraDto), HttpStatus.OK);
    }

    @GetMapping("/carrera/{id}")
    public ResponseEntity<CarreraDto> optenerAulaId(@PathVariable int id) {
        CarreraDto aulaDto = this.carreraServico.buscarCarreraId(id);
        return ResponseEntity.ok(aulaDto);
    }

    @DeleteMapping("carrera/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarCarrera(@PathVariable int id) {
        this.carreraServico.eliminarCarreraId(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

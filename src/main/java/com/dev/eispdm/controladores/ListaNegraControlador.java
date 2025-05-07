package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.ListaNegraDto;
import com.dev.eispdm.dtos.PrestamoDto;
import com.dev.eispdm.servicios.implementacion.ListaNegraServicio;
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
public class ListaNegraControlador {
    @Autowired
    private ListaNegraServicio listaNegraServicio;

    @GetMapping("/listanegra")
    public ResponseEntity< List<ListaNegraDto>> listarListaNegra(){
        return new ResponseEntity<>(listaNegraServicio.listarListaNegra(), HttpStatus.OK);
    }
    @PostMapping("/listanegra")
    public ResponseEntity< ListaNegraDto> guardarListaNegra(@RequestBody ListaNegraDto listaNegraDto){
        return new ResponseEntity<>(listaNegraServicio.guardarListaNegra(listaNegraDto), HttpStatus.CREATED);
    }
    @GetMapping("/listanegra/{id}")
    public ResponseEntity< ListaNegraDto> buscarListaNegraId(@PathVariable Integer id){
        return new ResponseEntity<>(listaNegraServicio.buscarListaNegraId(id), HttpStatus.OK);
    }
    @DeleteMapping("listanegra/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarListaNegra(@PathVariable Integer id){
        listaNegraServicio.eliminarListaNegra(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }


}

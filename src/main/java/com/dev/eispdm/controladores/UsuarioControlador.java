package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.UsuarioDto;
import com.dev.eispdm.servicios.implementacion.UsuarioServicio;
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
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/usuario")
    public ResponseEntity<List<UsuarioDto>> listarUsuario() {
        return new ResponseEntity<>(usuarioServicio.listarUsuario(), HttpStatus.OK);
    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioDto> guardarUsuario(@RequestBody UsuarioDto usuarioDto) {
        return new ResponseEntity<>(usuarioServicio.guardarUsuario(usuarioDto), HttpStatus.CREATED);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<UsuarioDto> buscarUsuarioId(@PathVariable Integer id) {
        return new ResponseEntity<>(usuarioServicio.buscarUsuarioId(id), HttpStatus.OK);
    }

    @DeleteMapping("usuario/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarUsuario(@PathVariable Integer id) {
        usuarioServicio.eliminaUsuario(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.servicios.implementacion.AulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("prestamo-app")
@CrossOrigin(value = "http://localhost:4200")
public class AulaControlador {
    @Autowired
    private AulaServicio aulaServicio = new AulaServicio();


    @GetMapping("/aulaA")
    public List<AulaDto> listaAulaAscendente(){
       /* List<AulaDto> aula= this.aulaServicio.listarAulaAsc();
        return aula;*/

        return null;
    }

    @GetMapping("/aulasfind/{aulas}")
    public ResponseEntity <List<AulaDto>>buscarNombre(@PathVariable String aulas){
        return new ResponseEntity(aulaServicio.listarAulasAscendente(aulas),HttpStatus.OK);

    }
    @GetMapping("/aulasCont/{aulas}")
    public ResponseEntity <List<AulaDto>> listaAulaCont(@PathVariable String aulas){
        return new ResponseEntity(aulaServicio.listarAulasContengan(aulas),HttpStatus.OK);
    }

    @GetMapping("/aula/{id}")
    public ResponseEntity<Optional<AulaDto>> optenerAulaId(@PathVariable int id){
        Optional<AulaDto> aulaDto= Optional.ofNullable(this.aulaServicio.buscarAulaId(id));
        return ResponseEntity.ok(aulaDto);
    }
    @GetMapping("/aulasNom/{aulas}")
    public ResponseEntity<AulaDto> optenerAulaNombre(@PathVariable String aulas){
        AulaDto aulaDto= this.aulaServicio.buscarAulaNombre(aulas);
        return ResponseEntity.ok(aulaDto);
    }
    @GetMapping("/aula")
    public ResponseEntity <List<AulaDto>> listaAula(){
        return new ResponseEntity(aulaServicio.listarAulas(), HttpStatus.OK);
    }
    @PostMapping("/aula")
    public ResponseEntity<AulaDto> agregarAula(@RequestBody AulaDto aulaDto){
        try {
            return new ResponseEntity(aulaServicio.guardarAula(aulaDto),HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/aula")
    public ResponseEntity<AulaDto> actulizzarAula(@RequestBody AulaDto aulaDto){
        try {
            return new ResponseEntity(aulaServicio.guardarAula(aulaDto),HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("aula/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarAula(@PathVariable int id){
        this.aulaServicio.eliminarAulaId(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

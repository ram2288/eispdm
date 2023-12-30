package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.AulaDto;
import com.dev.eispdm.entidades.Aula;
import com.dev.eispdm.repositorios.AulaRepository;
import com.dev.eispdm.servicios.implementacion.AulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("prestamo-app")
@CrossOrigin(value = "http://localhost:4200")
public class AulaControlador {
    @Autowired
    private AulaServicio aulaServicio = new AulaServicio();


    @GetMapping("/aula")
    public List<AulaDto> listaAula(){
        List<AulaDto> aula= this.aulaServicio.listarAulas();
        return aula;
    }

    @GetMapping("/aulass/{aulas}")
    public List<AulaDto> listaAulaAsc(@PathVariable String aulas){
        List<AulaDto> aula= this.aulaServicio.listarAulasAscendente(aulas);
        return aula;
       // return null;
    }
    @GetMapping("/aulasss/{aulas}")
    public List<AulaDto> listaAulaCont(@PathVariable String aulas){
        List<AulaDto> aula= this.aulaServicio.listarAulasContengan(aulas);
        return aula;
        //return null;
    }
    @PostMapping("/aula")
    public AulaDto agregarAula(@RequestBody AulaDto aulaDto){
        return this.aulaServicio.guardarAula(aulaDto);
        //return null;
    }
    @GetMapping("/aula/{id}")
    public ResponseEntity<AulaDto> optenerAulaId(@PathVariable int id){
        AulaDto aulaDto= this.aulaServicio.buscarAulaId(id);
        return ResponseEntity.ok(aulaDto);
       // return null;
    }
    @GetMapping("/aulas/{aulas}")
    public ResponseEntity<AulaDto> optenerAulaNombre(@PathVariable String aulas){
        AulaDto aulaDto= this.aulaServicio.buscarAulaNombre(aulas);
        return ResponseEntity.ok(aulaDto);
        //return null;
    }
    @DeleteMapping("aula/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarAula(@PathVariable int id){
        //AulaDto aulaDto = aulaServicio.buscarAulaId(id);
        this.aulaServicio.eliminarAulaId(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
       // return null;
    }
}

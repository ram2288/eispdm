package com.dev.eispdm.controladores;

import com.dev.eispdm.dtos.AulaDto;
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
    @GetMapping("/aulaA")
    public List<AulaDto> listaAulaAscendente(){
       /* List<AulaDto> aula= this.aulaServicio.listarAulaAsc();
        return aula;*/
        return null;
    }

    @GetMapping("/aulasfind/{aulas}")
    public List<AulaDto> buscarNombre(@PathVariable String aulas){
        List<AulaDto> aula= this.aulaServicio.listarAulasAscendente(aulas);
        return aula;

    }
    @GetMapping("/aulasCont/{aulas}")
    public List<AulaDto> listaAulaCont(@PathVariable String aulas){
        List<AulaDto> aula= this.aulaServicio.listarAulasContengan(aulas);
        return aula;
        //return null;
    }
    @PostMapping("/aula")
    public AulaDto agregarAula(@RequestBody AulaDto aulaDto){
        //return this.aulaRepository.save(aula);
        return this.aulaServicio.guardarAula(aulaDto);
        //return null;
    }
    @GetMapping("/aula/{id}")
    public ResponseEntity<AulaDto> optenerAulaId(@PathVariable int id){
        AulaDto aulaDto= this.aulaServicio.buscarAulaId(id);
        return ResponseEntity.ok(aulaDto);
       // return null;
    }
    @GetMapping("/aulasNom/{aulas}")
    public ResponseEntity<AulaDto> optenerAulaNombre(@PathVariable String aulas){
        AulaDto aulaDto= this.aulaServicio.buscarAulaNombre(aulas);
        return ResponseEntity.ok(aulaDto);
        //return null;
    }
    @DeleteMapping("aula/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarAula(@PathVariable int id){
        this.aulaServicio.eliminarAulaId(id);
        Map<String,Boolean>respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}

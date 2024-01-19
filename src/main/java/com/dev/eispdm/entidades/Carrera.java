package com.dev.eispdm.entidades;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrera;
    @Column(nullable = false, unique = true)
    private String carrera;
    @JsonIgnore
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;
    @JsonIgnore
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Docente> docentes;
    @JsonIgnore
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Aula> aulas;
    @JsonIgnore
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Materia> materias;
    @JsonIgnore
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Usuario> usuarios;
}

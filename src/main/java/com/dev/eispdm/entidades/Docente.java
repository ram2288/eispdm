package com.dev.eispdm.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "docentes")
public class Docente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocente;
    private String nomDocente;
    private String apePaterno;
    private String apeMaterno;
    private String ci;
    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera;
    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Prestamo> prestamos;
}

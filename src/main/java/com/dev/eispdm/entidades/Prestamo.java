package com.dev.eispdm.entidades;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "prestamos")
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private LocalDateTime fePrestamos;
    private LocalDateTime feDevolucion;
    @ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;
    @ManyToOne
    @JoinColumn(name = "id_docente", nullable = false)
    private Docente docente;
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    @OneToMany(mappedBy = "prestamo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DetallePrestamo> detallePrestamo;

}

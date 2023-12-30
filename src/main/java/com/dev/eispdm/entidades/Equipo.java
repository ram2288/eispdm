package com.dev.eispdm.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "equipos")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipo;
    private String nomEquipo;
    private String serie;
    private String Descripcion;
    private String Observacion;
    private LocalDateTime fechaCompra;
    private LocalDateTime fechaCreado;
    @ManyToOne
    @JoinColumn(name = "id_Categoria", nullable = false)
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "id_Aula", nullable = false)
    private Aula aula;
    @ManyToOne
    @JoinColumn(name = "id_Estado", nullable = false)
    private EstadoEquipo estadoEquipo;
}

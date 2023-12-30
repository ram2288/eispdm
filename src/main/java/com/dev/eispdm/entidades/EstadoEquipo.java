package com.dev.eispdm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estado_equipos")
public class EstadoEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;
    @Column(nullable = false, unique = true)
    private String estado;
    @OneToMany(mappedBy = "estadoEquipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipo> equipos;
}
